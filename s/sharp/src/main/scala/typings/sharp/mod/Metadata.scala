package typings.sharp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends WriteableMetadata {
  
  /** Number of bands e.g. 3 for sRGB, 4 for CMYK */
  var channels: js.UndefOr[Channels] = js.native
  
  /** String containing JPEG chroma subsampling, 4:2:0 or 4:4:4 for RGB, 4:2:0:4 or 4:4:4:4 for CMYK */
  var chromaSubsampling: String = js.native
  
  /** Delay in ms between each page in an animated image, provided as an array of integers. */
  var delay: js.UndefOr[js.Array[Double]] = js.native
  
  /** Number of pixels per inch (DPI), if present */
  var density: js.UndefOr[Double] = js.native
  
  /** Name of pixel depth format e.g. uchar, char, ushort, float ... */
  var depth: js.UndefOr[String] = js.native
  
  /** Buffer containing raw EXIF data, if present */
  var exif: js.UndefOr[Buffer] = js.native
  
  /** Name of decoder used to decompress image data e.g. jpeg, png, webp, gif, svg */
  var format: js.UndefOr[String] = js.native
  
  /** Boolean indicating the presence of an alpha transparency channel */
  var hasAlpha: js.UndefOr[Boolean] = js.native
  
  /** Boolean indicating the presence of an embedded ICC profile */
  var hasProfile: js.UndefOr[Boolean] = js.native
  
  /** Number of pixels high (EXIF orientation is not taken into consideration) */
  var height: js.UndefOr[Double] = js.native
  
  /** Buffer containing raw ICC profile data, if present */
  var icc: js.UndefOr[Buffer] = js.native
  
  /** Buffer containing raw IPTC data, if present */
  var iptc: js.UndefOr[Buffer] = js.native
  
  /** Boolean indicating whether the image is interlaced using a progressive scan */
  var isProgressive: js.UndefOr[Boolean] = js.native
  
  /** Number of times to loop an animated image, zero refers to a continuous loop. */
  var loop: js.UndefOr[Double] = js.native
  
  /** Number of pixels high each page in a multi-page image will be. */
  var pageHeight: js.UndefOr[Double] = js.native
  
  /**  Number of the primary page in a HEIF image */
  var pagePrimary: js.UndefOr[Double] = js.native
  
  /** Number of pages/frames contained within the image, with support for TIFF, HEIF, PDF, animated GIF and animated WebP */
  var pages: js.UndefOr[Double] = js.native
  
  /** Total size of image in bytes, for Stream and Buffer input only */
  var size: js.UndefOr[Double] = js.native
  
  /** Name of colour space interpretation e.g. srgb, rgb, cmyk, lab, b-w ... */
  var space: js.UndefOr[String] = js.native
  
  /** Buffer containing raw TIFFTAG_PHOTOSHOP data, if present */
  var tifftagPhotoshop: js.UndefOr[Buffer] = js.native
  
  /** Number of pixels wide (EXIF orientation is not taken into consideration) */
  var width: js.UndefOr[Double] = js.native
  
  /** Buffer containing raw XMP data, if present */
  var xmp: js.UndefOr[Buffer] = js.native
}
object Metadata {
  
  @scala.inline
  def apply(chromaSubsampling: String): Metadata = {
    val __obj = js.Dynamic.literal(chromaSubsampling = chromaSubsampling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setChromaSubsampling(value: String): Self = this.set("chromaSubsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: Channels): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setDelayVarargs(value: Double*): Self = this.set("delay", js.Array(value :_*))
    
    @scala.inline
    def setDelay(value: js.Array[Double]): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    
    @scala.inline
    def setDepth(value: String): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setExif(value: Buffer): Self = this.set("exif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExif: Self = this.set("exif", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHasAlpha(value: Boolean): Self = this.set("hasAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAlpha: Self = this.set("hasAlpha", js.undefined)
    
    @scala.inline
    def setHasProfile(value: Boolean): Self = this.set("hasProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasProfile: Self = this.set("hasProfile", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcc(value: Buffer): Self = this.set("icc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcc: Self = this.set("icc", js.undefined)
    
    @scala.inline
    def setIptc(value: Buffer): Self = this.set("iptc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIptc: Self = this.set("iptc", js.undefined)
    
    @scala.inline
    def setIsProgressive(value: Boolean): Self = this.set("isProgressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsProgressive: Self = this.set("isProgressive", js.undefined)
    
    @scala.inline
    def setLoop(value: Double): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setPageHeight(value: Double): Self = this.set("pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageHeight: Self = this.set("pageHeight", js.undefined)
    
    @scala.inline
    def setPagePrimary(value: Double): Self = this.set("pagePrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagePrimary: Self = this.set("pagePrimary", js.undefined)
    
    @scala.inline
    def setPages(value: Double): Self = this.set("pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setTifftagPhotoshop(value: Buffer): Self = this.set("tifftagPhotoshop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTifftagPhotoshop: Self = this.set("tifftagPhotoshop", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setXmp(value: Buffer): Self = this.set("xmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmp: Self = this.set("xmp", js.undefined)
  }
}
