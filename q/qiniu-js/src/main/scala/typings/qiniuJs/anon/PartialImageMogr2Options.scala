package typings.qiniuJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.ImageMogr2Options> */
@js.native
trait PartialImageMogr2Options extends js.Object {
  var `auto-orient`: js.UndefOr[Boolean] = js.native
  var blur: js.UndefOr[String] = js.native
  var crop: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var gravity: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var strip: js.UndefOr[Boolean] = js.native
  var thumbnail: js.UndefOr[String] = js.native
}

object PartialImageMogr2Options {
  @scala.inline
  def apply(): PartialImageMogr2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImageMogr2Options]
  }
  @scala.inline
  implicit class PartialImageMogr2OptionsOps[Self <: PartialImageMogr2Options] (val x: Self) extends AnyVal {
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
    def `setAuto-orient`(value: Boolean): Self = this.set("auto-orient", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAuto-orient`: Self = this.set("auto-orient", js.undefined)
    @scala.inline
    def setBlur(value: String): Self = this.set("blur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlur: Self = this.set("blur", js.undefined)
    @scala.inline
    def setCrop(value: String): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGravity(value: String): Self = this.set("gravity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}

