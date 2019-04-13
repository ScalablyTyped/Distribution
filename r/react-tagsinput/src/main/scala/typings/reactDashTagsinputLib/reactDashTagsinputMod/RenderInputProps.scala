package typings
package reactDashTagsinputLib.reactDashTagsinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputProps extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: reactDashTagsinputLib.Tag
  def addTag(tag: reactDashTagsinputLib.Tag): scala.Unit
  def onChange(e: reactLib.reactMod.ChangeEvent[reactDashTagsinputLib.Anon_Value]): scala.Unit
  def ref(r: js.Any): scala.Unit
}

object RenderInputProps {
  @scala.inline
  def apply(
    addTag: reactDashTagsinputLib.Tag => scala.Unit,
    onChange: reactLib.reactMod.ChangeEvent[reactDashTagsinputLib.Anon_Value] => scala.Unit,
    ref: js.Any => scala.Unit,
    value: reactDashTagsinputLib.Tag,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RenderInputProps = {
    val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderInputProps]
  }
}

