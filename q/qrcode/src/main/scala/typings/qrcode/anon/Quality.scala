package typings.qrcode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quality extends js.Object {
  /**
    * A Number between 0 and 1 indicating image quality if the requested type is image/jpeg or image/webp.
    * Default: 0.92
    */
  var quality: js.UndefOr[Double] = js.native
}

object Quality {
  @scala.inline
  def apply(): Quality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quality]
  }
  @scala.inline
  implicit class QualityOps[Self <: Quality] (val x: Self) extends AnyVal {
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
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

