package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PngOptions extends js.Object {
  /** use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[Boolean] = js.native
  /** Alternative Spelling of "colours". Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colors: js.UndefOr[Double] = js.native
  /** Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colours: js.UndefOr[Double] = js.native
  /** zlib compression level, 0-9 (optional, default 9) */
  var compressionLevel: js.UndefOr[Double] = js.native
  /**  Level of Floyd-Steinberg error diffusion, requires libimagequant (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.native
  /** Force PNG output, otherwise attempt to use input format (optional, default  true) */
  var force: js.UndefOr[Boolean] = js.native
  /** Quantise to a palette-based image with alpha transparency support, requires libimagequant (optional, default false) */
  var palette: js.UndefOr[Boolean] = js.native
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.native
  /** use the lowest number of colours needed to achieve given quality, requires libimagequant (optional, default `100`) */
  var quality: js.UndefOr[Double] = js.native
}

object PngOptions {
  @scala.inline
  def apply(): PngOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PngOptions]
  }
  @scala.inline
  implicit class PngOptionsOps[Self <: PngOptions] (val x: Self) extends AnyVal {
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
    def setAdaptiveFiltering(value: Boolean): Self = this.set("adaptiveFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveFiltering: Self = this.set("adaptiveFiltering", js.undefined)
    @scala.inline
    def setColors(value: Double): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setColours(value: Double): Self = this.set("colours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColours: Self = this.set("colours", js.undefined)
    @scala.inline
    def setCompressionLevel(value: Double): Self = this.set("compressionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionLevel: Self = this.set("compressionLevel", js.undefined)
    @scala.inline
    def setDither(value: Double): Self = this.set("dither", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDither: Self = this.set("dither", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setPalette(value: Boolean): Self = this.set("palette", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    @scala.inline
    def setProgressive(value: Boolean): Self = this.set("progressive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
  }
  
}

