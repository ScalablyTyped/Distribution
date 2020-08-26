package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiffOptions extends OutputOptions {
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.native
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.native
  /** Squash 8-bit images down to 1 bit (optional, default false) */
  var squash: js.UndefOr[Boolean] = js.native
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.native
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.native
}

object TiffOptions {
  @scala.inline
  def apply(): TiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TiffOptions]
  }
  @scala.inline
  implicit class TiffOptionsOps[Self <: TiffOptions] (val x: Self) extends AnyVal {
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
    def setCompression(value: String): Self = this.set("compression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    @scala.inline
    def setPredictor(value: String): Self = this.set("predictor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictor: Self = this.set("predictor", js.undefined)
    @scala.inline
    def setSquash(value: Boolean): Self = this.set("squash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSquash: Self = this.set("squash", js.undefined)
    @scala.inline
    def setXres(value: Double): Self = this.set("xres", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXres: Self = this.set("xres", js.undefined)
    @scala.inline
    def setYres(value: Double): Self = this.set("yres", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYres: Self = this.set("yres", js.undefined)
  }
  
}

