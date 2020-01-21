package typings.reactTagsinput.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderTagProps extends TagProps {
  val disabled: Boolean
  val tag: Tag
  def getTagDisplayValue(tag: Tag): String
  def onRemove(tagIndex: Double): Unit
}

object RenderTagProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    getTagDisplayValue: Tag => String,
    onRemove: Double => Unit,
    tag: Tag,
    StringDictionary: StringDictionary[js.Any] = null
  ): RenderTagProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1(onRemove), tag = tag.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RenderTagProps]
  }
}

