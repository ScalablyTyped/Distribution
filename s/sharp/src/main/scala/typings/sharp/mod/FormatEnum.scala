package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatEnum extends js.Object {
  var dz: AvailableFormatInfo = js.native
  var fits: AvailableFormatInfo = js.native
  var gif: AvailableFormatInfo = js.native
  var input: AvailableFormatInfo = js.native
  var jpeg: AvailableFormatInfo = js.native
  var magick: AvailableFormatInfo = js.native
  var openslide: AvailableFormatInfo = js.native
  var pdf: AvailableFormatInfo = js.native
  var png: AvailableFormatInfo = js.native
  var ppm: AvailableFormatInfo = js.native
  var raw: AvailableFormatInfo = js.native
  var svg: AvailableFormatInfo = js.native
  var tiff: AvailableFormatInfo = js.native
  var v: AvailableFormatInfo = js.native
  var webp: AvailableFormatInfo = js.native
}

object FormatEnum {
  @scala.inline
  def apply(
    dz: AvailableFormatInfo,
    fits: AvailableFormatInfo,
    gif: AvailableFormatInfo,
    input: AvailableFormatInfo,
    jpeg: AvailableFormatInfo,
    magick: AvailableFormatInfo,
    openslide: AvailableFormatInfo,
    pdf: AvailableFormatInfo,
    png: AvailableFormatInfo,
    ppm: AvailableFormatInfo,
    raw: AvailableFormatInfo,
    svg: AvailableFormatInfo,
    tiff: AvailableFormatInfo,
    v: AvailableFormatInfo,
    webp: AvailableFormatInfo
  ): FormatEnum = {
    val __obj = js.Dynamic.literal(dz = dz.asInstanceOf[js.Any], fits = fits.asInstanceOf[js.Any], gif = gif.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], jpeg = jpeg.asInstanceOf[js.Any], magick = magick.asInstanceOf[js.Any], openslide = openslide.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], png = png.asInstanceOf[js.Any], ppm = ppm.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], webp = webp.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatEnum]
  }
  @scala.inline
  implicit class FormatEnumOps[Self <: FormatEnum] (val x: Self) extends AnyVal {
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
    def setDz(value: AvailableFormatInfo): Self = this.set("dz", value.asInstanceOf[js.Any])
    @scala.inline
    def setFits(value: AvailableFormatInfo): Self = this.set("fits", value.asInstanceOf[js.Any])
    @scala.inline
    def setGif(value: AvailableFormatInfo): Self = this.set("gif", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: AvailableFormatInfo): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setJpeg(value: AvailableFormatInfo): Self = this.set("jpeg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagick(value: AvailableFormatInfo): Self = this.set("magick", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenslide(value: AvailableFormatInfo): Self = this.set("openslide", value.asInstanceOf[js.Any])
    @scala.inline
    def setPdf(value: AvailableFormatInfo): Self = this.set("pdf", value.asInstanceOf[js.Any])
    @scala.inline
    def setPng(value: AvailableFormatInfo): Self = this.set("png", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpm(value: AvailableFormatInfo): Self = this.set("ppm", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: AvailableFormatInfo): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setSvg(value: AvailableFormatInfo): Self = this.set("svg", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiff(value: AvailableFormatInfo): Self = this.set("tiff", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: AvailableFormatInfo): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebp(value: AvailableFormatInfo): Self = this.set("webp", value.asInstanceOf[js.Any])
  }
  
}

