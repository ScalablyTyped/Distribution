package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemRendererGetResizePropsReturnType extends js.Object {
  var left: js.UndefOr[ClassName] = js.native
  var right: js.UndefOr[ClassName] = js.native
}

object ItemRendererGetResizePropsReturnType {
  @scala.inline
  def apply(): ItemRendererGetResizePropsReturnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemRendererGetResizePropsReturnType]
  }
  @scala.inline
  implicit class ItemRendererGetResizePropsReturnTypeOps[Self <: ItemRendererGetResizePropsReturnType] (val x: Self) extends AnyVal {
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
    def setLeft(value: ClassName): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: ClassName): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

