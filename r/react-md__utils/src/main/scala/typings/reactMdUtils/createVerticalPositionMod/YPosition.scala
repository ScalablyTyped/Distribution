package typings.reactMdUtils.createVerticalPositionMod

import typings.reactMdUtils.typesMod.VerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  */
@js.native
trait YPosition extends js.Object {
  var actualY: VerticalPosition = js.native
  var bottom: js.UndefOr[Double] = js.native
  var top: Double = js.native
}

object YPosition {
  @scala.inline
  def apply(actualY: VerticalPosition, top: Double): YPosition = {
    val __obj = js.Dynamic.literal(actualY = actualY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[YPosition]
  }
  @scala.inline
  implicit class YPositionOps[Self <: YPosition] (val x: Self) extends AnyVal {
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
    def setActualY(value: VerticalPosition): Self = this.set("actualY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
  }
  
}

