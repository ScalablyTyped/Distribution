package typings.reactTagsinput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderTagProps[Tag] extends TagProps {
  val disabled: Boolean = js.native
  val tag: Tag = js.native
  def getTagDisplayValue(tag: Tag): String = js.native
  def onRemove(tagIndex: Double): Unit = js.native
}

object RenderTagProps {
  @scala.inline
  def apply[Tag](disabled: Boolean, getTagDisplayValue: Tag => String, onRemove: Double => Unit, tag: Tag): RenderTagProps[Tag] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTagDisplayValue = js.Any.fromFunction1(getTagDisplayValue), onRemove = js.Any.fromFunction1(onRemove), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTagProps[Tag]]
  }
  @scala.inline
  implicit class RenderTagPropsOps[Self <: RenderTagProps[_], Tag] (val x: Self with RenderTagProps[Tag]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTagDisplayValue(value: Tag => String): Self = this.set("getTagDisplayValue", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRemove(value: Double => Unit): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setTag(value: Tag): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

