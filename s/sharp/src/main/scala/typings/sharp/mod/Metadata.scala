package typings.sharp.mod

import typings.node.bufferMod.global.Buffer
import typings.sharp.anon.B
import typings.sharp.sharpStrings.`b-w`
import typings.sharp.sharpStrings.av1
import typings.sharp.sharpStrings.avif
import typings.sharp.sharpStrings.bw
import typings.sharp.sharpStrings.cmyk
import typings.sharp.sharpStrings.dz
import typings.sharp.sharpStrings.fits
import typings.sharp.sharpStrings.gif
import typings.sharp.sharpStrings.heif
import typings.sharp.sharpStrings.hevc
import typings.sharp.sharpStrings.input
import typings.sharp.sharpStrings.jpeg
import typings.sharp.sharpStrings.jpg
import typings.sharp.sharpStrings.magick
import typings.sharp.sharpStrings.multiband
import typings.sharp.sharpStrings.openslide
import typings.sharp.sharpStrings.pdf
import typings.sharp.sharpStrings.png
import typings.sharp.sharpStrings.ppm
import typings.sharp.sharpStrings.raw
import typings.sharp.sharpStrings.srgb
import typings.sharp.sharpStrings.svg
import typings.sharp.sharpStrings.tif
import typings.sharp.sharpStrings.tiff
import typings.sharp.sharpStrings.v
import typings.sharp.sharpStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /** Default background colour, if present, for PNG (bKGD) and GIF images, either an RGB Object or a single greyscale value */
  var background: js.UndefOr[B | Double] = js.undefined
  
  /** Number of bands e.g. 3 for sRGB, 4 for CMYK */
  var channels: js.UndefOr[Channels] = js.undefined
  
  /** String containing JPEG chroma subsampling, 4:2:0 or 4:4:4 for RGB, 4:2:0:4 or 4:4:4:4 for CMYK */
  var chromaSubsampling: String
  
  /** The encoder used to compress an HEIF file, `av1` (AVIF) or `hevc` (HEIC) */
  var compression: js.UndefOr[av1 | hevc] = js.undefined
  
  /** Delay in ms between each page in an animated image, provided as an array of integers. */
  var delay: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Number of pixels per inch (DPI), if present */
  var density: js.UndefOr[Double] = js.undefined
  
  /** Name of pixel depth format e.g. uchar, char, ushort, float ... */
  var depth: js.UndefOr[String] = js.undefined
  
  /** Buffer containing raw EXIF data, if present */
  var exif: js.UndefOr[Buffer] = js.undefined
  
  /** Name of decoder used to decompress image data e.g. jpeg, png, webp, gif, svg */
  var format: js.UndefOr[
    avif | dz | fits | gif | heif | input | jpeg | jpg | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp
  ] = js.undefined
  
  /** Boolean indicating the presence of an alpha transparency channel */
  var hasAlpha: js.UndefOr[Boolean] = js.undefined
  
  /** Boolean indicating the presence of an embedded ICC profile */
  var hasProfile: js.UndefOr[Boolean] = js.undefined
  
  /** Number of pixels high (EXIF orientation is not taken into consideration) */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Buffer containing raw ICC profile data, if present */
  var icc: js.UndefOr[Buffer] = js.undefined
  
  /** Buffer containing raw IPTC data, if present */
  var iptc: js.UndefOr[Buffer] = js.undefined
  
  /** Boolean indicating whether the image is interlaced using a progressive scan */
  var isProgressive: js.UndefOr[Boolean] = js.undefined
  
  /** Number of times to loop an animated image, zero refers to a continuous loop. */
  var loop: js.UndefOr[Double] = js.undefined
  
  /** Number value of the EXIF Orientation header, if present */
  var orientation: js.UndefOr[Double] = js.undefined
  
  /** Number of pixels high each page in a multi-page image will be. */
  var pageHeight: js.UndefOr[Double] = js.undefined
  
  /**  Number of the primary page in a HEIF image */
  var pagePrimary: js.UndefOr[Double] = js.undefined
  
  /** Number of pages/frames contained within the image, with support for TIFF, HEIF, PDF, animated GIF and animated WebP */
  var pages: js.UndefOr[Double] = js.undefined
  
  /** Total size of image in bytes, for Stream and Buffer input only */
  var size: js.UndefOr[Double] = js.undefined
  
  /** Name of colour space interpretation */
  var space: js.UndefOr[multiband | `b-w` | bw | cmyk | srgb] = js.undefined
  
  /** Buffer containing raw TIFFTAG_PHOTOSHOP data, if present */
  var tifftagPhotoshop: js.UndefOr[Buffer] = js.undefined
  
  /** Number of pixels wide (EXIF orientation is not taken into consideration) */
  var width: js.UndefOr[Double] = js.undefined
  
  /** Buffer containing raw XMP data, if present */
  var xmp: js.UndefOr[Buffer] = js.undefined
}
object Metadata {
  
  inline def apply(chromaSubsampling: String): Metadata = {
    val __obj = js.Dynamic.literal(chromaSubsampling = chromaSubsampling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  extension [Self <: Metadata](x: Self) {
    
    inline def setBackground(value: B | Double): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChromaSubsampling(value: String): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: av1 | hevc): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setDelay(value: js.Array[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value*))
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setExif(value: Buffer): Self = StObject.set(x, "exif", value.asInstanceOf[js.Any])
    
    inline def setExifUndefined: Self = StObject.set(x, "exif", js.undefined)
    
    inline def setFormat(
      value: avif | dz | fits | gif | heif | input | jpeg | jpg | magick | openslide | pdf | png | ppm | raw | svg | tiff | tif | v | webp
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
    
    inline def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
    
    inline def setHasProfile(value: Boolean): Self = StObject.set(x, "hasProfile", value.asInstanceOf[js.Any])
    
    inline def setHasProfileUndefined: Self = StObject.set(x, "hasProfile", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIcc(value: Buffer): Self = StObject.set(x, "icc", value.asInstanceOf[js.Any])
    
    inline def setIccUndefined: Self = StObject.set(x, "icc", js.undefined)
    
    inline def setIptc(value: Buffer): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
    
    inline def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
    
    inline def setIsProgressive(value: Boolean): Self = StObject.set(x, "isProgressive", value.asInstanceOf[js.Any])
    
    inline def setIsProgressiveUndefined: Self = StObject.set(x, "isProgressive", js.undefined)
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    inline def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
    
    inline def setPagePrimary(value: Double): Self = StObject.set(x, "pagePrimary", value.asInstanceOf[js.Any])
    
    inline def setPagePrimaryUndefined: Self = StObject.set(x, "pagePrimary", js.undefined)
    
    inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSpace(value: multiband | `b-w` | bw | cmyk | srgb): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setTifftagPhotoshop(value: Buffer): Self = StObject.set(x, "tifftagPhotoshop", value.asInstanceOf[js.Any])
    
    inline def setTifftagPhotoshopUndefined: Self = StObject.set(x, "tifftagPhotoshop", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXmp(value: Buffer): Self = StObject.set(x, "xmp", value.asInstanceOf[js.Any])
    
    inline def setXmpUndefined: Self = StObject.set(x, "xmp", js.undefined)
  }
}
