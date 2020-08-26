package typings.slickCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurX extends js.Object {
  var curX: js.UndefOr[Double] = js.native
  var curY: js.UndefOr[Double] = js.native
  var edgeHit: js.UndefOr[Boolean] = js.native
  var fingerCount: js.UndefOr[Double] = js.native
  var minSwipe: js.UndefOr[Double] = js.native
  var startX: js.UndefOr[Double] = js.native
  var startY: js.UndefOr[Double] = js.native
  var swipeLength: js.UndefOr[Double] = js.native
  var verticalSwiping: js.UndefOr[Boolean] = js.native
}

object CurX {
  @scala.inline
  def apply(): CurX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurX]
  }
  @scala.inline
  implicit class CurXOps[Self <: CurX] (val x: Self) extends AnyVal {
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
    def setCurX(value: Double): Self = this.set("curX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurX: Self = this.set("curX", js.undefined)
    @scala.inline
    def setCurY(value: Double): Self = this.set("curY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurY: Self = this.set("curY", js.undefined)
    @scala.inline
    def setEdgeHit(value: Boolean): Self = this.set("edgeHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeHit: Self = this.set("edgeHit", js.undefined)
    @scala.inline
    def setFingerCount(value: Double): Self = this.set("fingerCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerCount: Self = this.set("fingerCount", js.undefined)
    @scala.inline
    def setMinSwipe(value: Double): Self = this.set("minSwipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSwipe: Self = this.set("minSwipe", js.undefined)
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartY: Self = this.set("startY", js.undefined)
    @scala.inline
    def setSwipeLength(value: Double): Self = this.set("swipeLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeLength: Self = this.set("swipeLength", js.undefined)
    @scala.inline
    def setVerticalSwiping(value: Boolean): Self = this.set("verticalSwiping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSwiping: Self = this.set("verticalSwiping", js.undefined)
  }
  
}

