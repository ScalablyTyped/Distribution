package typings.scroller.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var animating: js.UndefOr[Boolean] = js.native
  var animationDuration: js.UndefOr[Double] = js.native
  var bouncing: js.UndefOr[Boolean] = js.native
  var locking: js.UndefOr[Boolean] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var paging: js.UndefOr[Boolean] = js.native
  var scrollingX: js.UndefOr[Boolean] = js.native
  var scrollingY: js.UndefOr[Boolean] = js.native
  var snapping: js.UndefOr[Boolean] = js.native
  var zooming: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAnimating(value: Boolean): Self = this.set("animating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimating: Self = this.set("animating", js.undefined)
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setBouncing(value: Boolean): Self = this.set("bouncing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBouncing: Self = this.set("bouncing", js.undefined)
    @scala.inline
    def setLocking(value: Boolean): Self = this.set("locking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocking: Self = this.set("locking", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setPaging(value: Boolean): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    @scala.inline
    def setScrollingX(value: Boolean): Self = this.set("scrollingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollingX: Self = this.set("scrollingX", js.undefined)
    @scala.inline
    def setScrollingY(value: Boolean): Self = this.set("scrollingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollingY: Self = this.set("scrollingY", js.undefined)
    @scala.inline
    def setSnapping(value: Boolean): Self = this.set("snapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapping: Self = this.set("snapping", js.undefined)
    @scala.inline
    def setZooming(value: Double): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

