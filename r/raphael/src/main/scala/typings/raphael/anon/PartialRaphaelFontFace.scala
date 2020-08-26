package typings.raphael.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelFontFace> */
@js.native
trait PartialRaphaelFontFace extends js.Object {
  var ascent: js.UndefOr[Double | String] = js.native
  var bbox: js.UndefOr[String] = js.native
  var descent: js.UndefOr[Double | String] = js.native
  var `font-family`: js.UndefOr[String] = js.native
  var `font-stretch`: js.UndefOr[String] = js.native
  var `font-style`: js.UndefOr[String] = js.native
  var `font-weight`: js.UndefOr[Double | String] = js.native
  var `panose-1`: js.UndefOr[String] = js.native
  var `underline-position`: js.UndefOr[Double | String] = js.native
  var `underline-thickness`: js.UndefOr[Double | String] = js.native
  var `unicode-range`: js.UndefOr[String] = js.native
  var `units-per-em`: js.UndefOr[Double | String] = js.native
  var `x-height`: js.UndefOr[Double | String] = js.native
}

object PartialRaphaelFontFace {
  @scala.inline
  def apply(): PartialRaphaelFontFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRaphaelFontFace]
  }
  @scala.inline
  implicit class PartialRaphaelFontFaceOps[Self <: PartialRaphaelFontFace] (val x: Self) extends AnyVal {
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
    def setAscent(value: Double | String): Self = this.set("ascent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscent: Self = this.set("ascent", js.undefined)
    @scala.inline
    def setBbox(value: String): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setDescent(value: Double | String): Self = this.set("descent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescent: Self = this.set("descent", js.undefined)
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-stretch`(value: String): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    @scala.inline
    def `setFont-style`(value: String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-weight`(value: Double | String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def `setPanose-1`(value: String): Self = this.set("panose-1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePanose-1`: Self = this.set("panose-1", js.undefined)
    @scala.inline
    def `setUnderline-position`(value: Double | String): Self = this.set("underline-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnderline-position`: Self = this.set("underline-position", js.undefined)
    @scala.inline
    def `setUnderline-thickness`(value: Double | String): Self = this.set("underline-thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnderline-thickness`: Self = this.set("underline-thickness", js.undefined)
    @scala.inline
    def `setUnicode-range`(value: String): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-range`: Self = this.set("unicode-range", js.undefined)
    @scala.inline
    def `setUnits-per-em`(value: Double | String): Self = this.set("units-per-em", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnits-per-em`: Self = this.set("units-per-em", js.undefined)
    @scala.inline
    def `setX-height`(value: Double | String): Self = this.set("x-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-height`: Self = this.set("x-height", js.undefined)
  }
  
}

