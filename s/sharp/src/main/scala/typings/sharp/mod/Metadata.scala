package typings.sharp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends WriteableMetadata {
  /** Number of bands e.g. 3 for sRGB, 4 for CMYK */
  var channels: js.UndefOr[Channels] = js.undefined
  /** String containing JPEG chroma subsampling, 4:2:0 or 4:4:4 for RGB, 4:2:0:4 or 4:4:4:4 for CMYK */
  var chromaSubsampling: String
  /** Delay in ms between each page in an animated image, provided as an array of integers. */
  var delay: js.UndefOr[js.Array[Double]] = js.undefined
  /** Number of pixels per inch (DPI), if present */
  var density: js.UndefOr[Double] = js.undefined
  /** Name of pixel depth format e.g. uchar, char, ushort, float ... */
  var depth: js.UndefOr[String] = js.undefined
  /** Buffer containing raw EXIF data, if present */
  var exif: js.UndefOr[Buffer] = js.undefined
  /** Name of decoder used to decompress image data e.g. jpeg, png, webp, gif, svg */
  var format: js.UndefOr[String] = js.undefined
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
  /** Number of pixels high each page in a multi-page image will be. */
  var pageHeight: js.UndefOr[Double] = js.undefined
  /**  Number of the primary page in a HEIF image */
  var pagePrimary: js.UndefOr[Double] = js.undefined
  /** Number of pages/frames contained within the image, with support for TIFF, HEIF, PDF, animated GIF and animated WebP */
  var pages: js.UndefOr[Double] = js.undefined
  /** Total size of image in bytes, for Stream and Buffer input only */
  var size: js.UndefOr[Double] = js.undefined
  /** Name of colour space interpretation e.g. srgb, rgb, cmyk, lab, b-w ... */
  var space: js.UndefOr[String] = js.undefined
  /** Buffer containing raw TIFFTAG_PHOTOSHOP data, if present */
  var tifftagPhotoshop: js.UndefOr[Buffer] = js.undefined
  /** Number of pixels wide (EXIF orientation is not taken into consideration) */
  var width: js.UndefOr[Double] = js.undefined
  /** Buffer containing raw XMP data, if present */
  var xmp: js.UndefOr[Buffer] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    chromaSubsampling: String,
    channels: Channels = null,
    delay: js.Array[Double] = null,
    density: Int | Double = null,
    depth: String = null,
    exif: Buffer = null,
    format: String = null,
    hasAlpha: js.UndefOr[Boolean] = js.undefined,
    hasProfile: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    icc: Buffer = null,
    iptc: Buffer = null,
    isProgressive: js.UndefOr[Boolean] = js.undefined,
    loop: Int | Double = null,
    orientation: Int | Double = null,
    pageHeight: Int | Double = null,
    pagePrimary: Int | Double = null,
    pages: Int | Double = null,
    size: Int | Double = null,
    space: String = null,
    tifftagPhotoshop: Buffer = null,
    width: Int | Double = null,
    xmp: Buffer = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(chromaSubsampling = chromaSubsampling.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (exif != null) __obj.updateDynamic("exif")(exif.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAlpha)) __obj.updateDynamic("hasAlpha")(hasAlpha.asInstanceOf[js.Any])
    if (!js.isUndefined(hasProfile)) __obj.updateDynamic("hasProfile")(hasProfile.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icc != null) __obj.updateDynamic("icc")(icc.asInstanceOf[js.Any])
    if (iptc != null) __obj.updateDynamic("iptc")(iptc.asInstanceOf[js.Any])
    if (!js.isUndefined(isProgressive)) __obj.updateDynamic("isProgressive")(isProgressive.asInstanceOf[js.Any])
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageHeight != null) __obj.updateDynamic("pageHeight")(pageHeight.asInstanceOf[js.Any])
    if (pagePrimary != null) __obj.updateDynamic("pagePrimary")(pagePrimary.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (tifftagPhotoshop != null) __obj.updateDynamic("tifftagPhotoshop")(tifftagPhotoshop.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xmp != null) __obj.updateDynamic("xmp")(xmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

