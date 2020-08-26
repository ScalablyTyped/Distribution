package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tip extends js.Object {
  var border: js.UndefOr[Double | Boolean] = js.native
  var corner: js.UndefOr[String | Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var mimic: js.UndefOr[String | Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Tip {
  @scala.inline
  def apply(): Tip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tip]
  }
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
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
    def setBorder(value: Double | Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setCorner(value: String | Boolean): Self = this.set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMimic(value: String | Boolean): Self = this.set("mimic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimic: Self = this.set("mimic", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

