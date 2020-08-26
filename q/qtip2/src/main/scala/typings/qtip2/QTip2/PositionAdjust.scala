package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Position property
  */
@js.native
trait PositionAdjust extends js.Object {
  var method: js.UndefOr[String] = js.native
  var mouse: js.UndefOr[Boolean] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
}

object PositionAdjust {
  @scala.inline
  def apply(): PositionAdjust = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionAdjust]
  }
  @scala.inline
  implicit class PositionAdjustOps[Self <: PositionAdjust] (val x: Self) extends AnyVal {
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMouse(value: Boolean): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

