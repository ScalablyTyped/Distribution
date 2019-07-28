package typings.reactDashTagsinput.reactDashTagsinputMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ChangeEvent
import typings.reactDashTagsinput.Anon_Value
import typings.reactDashTagsinput.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputProps extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: Tag
  def addTag(tag: Tag): Unit
  def onChange(e: ChangeEvent[Anon_Value]): Unit
  def ref(r: js.Any): Unit
}

object RenderInputProps {
  @scala.inline
  def apply(
    addTag: Tag => Unit,
    onChange: ChangeEvent[Anon_Value] => Unit,
    ref: js.Any => Unit,
    value: Tag,
    StringDictionary: StringDictionary[js.Any] = null
  ): RenderInputProps = {
    val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderInputProps]
  }
}

