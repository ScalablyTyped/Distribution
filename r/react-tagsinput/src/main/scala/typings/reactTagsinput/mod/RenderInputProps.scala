package typings.reactTagsinput.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ChangeEvent
import typings.reactTagsinput.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderInputProps[Tag] extends InputProps {
   // parameter is either a DOM element or a mounted React component
  val value: Tag
  def addTag(tag: Tag): Unit
  def onChange(e: ChangeEvent[Value]): Unit
  def ref(r: js.Any): Unit
}

object RenderInputProps {
  @scala.inline
  def apply[Tag](
    addTag: Tag => Unit,
    onChange: ChangeEvent[Value] => Unit,
    ref: js.Any => Unit,
    value: Tag,
    StringDictionary: StringDictionary[js.Any] = null
  ): RenderInputProps[Tag] = {
    val __obj = js.Dynamic.literal(addTag = js.Any.fromFunction1(addTag), onChange = js.Any.fromFunction1(onChange), ref = js.Any.fromFunction1(ref), value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderInputProps[Tag]]
  }
}

