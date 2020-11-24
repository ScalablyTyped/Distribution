package typings.sharpie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cairo extends js.Object {
  
  var cairo: js.UndefOr[String] = js.native
  
  var croco: js.UndefOr[String] = js.native
  
  var exif: js.UndefOr[String] = js.native
  
  var expat: js.UndefOr[String] = js.native
  
  var ffi: js.UndefOr[String] = js.native
  
  var fontconfig: js.UndefOr[String] = js.native
  
  var freetype: js.UndefOr[String] = js.native
  
  var gdkpixbuf: js.UndefOr[String] = js.native
  
  var gif: js.UndefOr[String] = js.native
  
  var glib: js.UndefOr[String] = js.native
  
  var gsf: js.UndefOr[String] = js.native
  
  var harfbuzz: js.UndefOr[String] = js.native
  
  var jpeg: js.UndefOr[String] = js.native
  
  var lcms: js.UndefOr[String] = js.native
  
  var orc: js.UndefOr[String] = js.native
  
  var pango: js.UndefOr[String] = js.native
  
  var pixman: js.UndefOr[String] = js.native
  
  var png: js.UndefOr[String] = js.native
  
  var svg: js.UndefOr[String] = js.native
  
  var tiff: js.UndefOr[String] = js.native
  
  var vips: String = js.native
  
  var webp: js.UndefOr[String] = js.native
  
  var xml: js.UndefOr[String] = js.native
  
  var zlib: js.UndefOr[String] = js.native
}
object Cairo {
  
  @scala.inline
  def apply(vips: String): Cairo = {
    val __obj = js.Dynamic.literal(vips = vips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cairo]
  }
  
  @scala.inline
  implicit class CairoOps[Self <: Cairo] (val x: Self) extends AnyVal {
    
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
    def setVips(value: String): Self = this.set("vips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCairo(value: String): Self = this.set("cairo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCairo: Self = this.set("cairo", js.undefined)
    
    @scala.inline
    def setCroco(value: String): Self = this.set("croco", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCroco: Self = this.set("croco", js.undefined)
    
    @scala.inline
    def setExif(value: String): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExif: Self = this.set("exif", js.undefined)
    
    @scala.inline
    def setExpat(value: String): Self = this.set("expat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpat: Self = this.set("expat", js.undefined)
    
    @scala.inline
    def setFfi(value: String): Self = this.set("ffi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFfi: Self = this.set("ffi", js.undefined)
    
    @scala.inline
    def setFontconfig(value: String): Self = this.set("fontconfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontconfig: Self = this.set("fontconfig", js.undefined)
    
    @scala.inline
    def setFreetype(value: String): Self = this.set("freetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreetype: Self = this.set("freetype", js.undefined)
    
    @scala.inline
    def setGdkpixbuf(value: String): Self = this.set("gdkpixbuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGdkpixbuf: Self = this.set("gdkpixbuf", js.undefined)
    
    @scala.inline
    def setGif(value: String): Self = this.set("gif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGif: Self = this.set("gif", js.undefined)
    
    @scala.inline
    def setGlib(value: String): Self = this.set("glib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlib: Self = this.set("glib", js.undefined)
    
    @scala.inline
    def setGsf(value: String): Self = this.set("gsf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGsf: Self = this.set("gsf", js.undefined)
    
    @scala.inline
    def setHarfbuzz(value: String): Self = this.set("harfbuzz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHarfbuzz: Self = this.set("harfbuzz", js.undefined)
    
    @scala.inline
    def setJpeg(value: String): Self = this.set("jpeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJpeg: Self = this.set("jpeg", js.undefined)
    
    @scala.inline
    def setLcms(value: String): Self = this.set("lcms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLcms: Self = this.set("lcms", js.undefined)
    
    @scala.inline
    def setOrc(value: String): Self = this.set("orc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrc: Self = this.set("orc", js.undefined)
    
    @scala.inline
    def setPango(value: String): Self = this.set("pango", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePango: Self = this.set("pango", js.undefined)
    
    @scala.inline
    def setPixman(value: String): Self = this.set("pixman", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixman: Self = this.set("pixman", js.undefined)
    
    @scala.inline
    def setPng(value: String): Self = this.set("png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePng: Self = this.set("png", js.undefined)
    
    @scala.inline
    def setSvg(value: String): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    
    @scala.inline
    def setTiff(value: String): Self = this.set("tiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTiff: Self = this.set("tiff", js.undefined)
    
    @scala.inline
    def setWebp(value: String): Self = this.set("webp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebp: Self = this.set("webp", js.undefined)
    
    @scala.inline
    def setXml(value: String): Self = this.set("xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml: Self = this.set("xml", js.undefined)
    
    @scala.inline
    def setZlib(value: String): Self = this.set("zlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlib: Self = this.set("zlib", js.undefined)
  }
}
