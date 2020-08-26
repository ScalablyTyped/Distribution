package typings.reactSwipeableViewsCore.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeIndexParams extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var pageX: Double = js.native
  var resistance: js.UndefOr[Boolean] = js.native
  var startIndex: Double = js.native
  var startX: Double = js.native
  var viewLength: Double = js.native
}

object ComputeIndexParams {
  @scala.inline
  def apply(pageX: Double, startIndex: Double, startX: Double, viewLength: Double): ComputeIndexParams = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], viewLength = viewLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeIndexParams]
  }
  @scala.inline
  implicit class ComputeIndexParamsOps[Self <: ComputeIndexParams] (val x: Self) extends AnyVal {
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
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewLength(value: Double): Self = this.set("viewLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setResistance(value: Boolean): Self = this.set("resistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResistance: Self = this.set("resistance", js.undefined)
  }
  
}

