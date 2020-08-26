package typings.reactNativeQrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeProperties extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var fgColor: js.UndefOr[String] = js.native
  var size: js.UndefOr[Double] = js.native
  var value: js.UndefOr[String] = js.native
}

object QRCodeProperties {
  @scala.inline
  def apply(): QRCodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeProperties]
  }
  @scala.inline
  implicit class QRCodePropertiesOps[Self <: QRCodeProperties] (val x: Self) extends AnyVal {
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
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setFgColor(value: String): Self = this.set("fgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFgColor: Self = this.set("fgColor", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

