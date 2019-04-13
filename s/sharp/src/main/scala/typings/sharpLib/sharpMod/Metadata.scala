package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends WriteableMetadata {
  /** Number of bands e.g. 3 for sRGB, 4 for CMYK */
  var channels: js.UndefOr[Channels] = js.undefined
  /** String containing JPEG chroma subsampling, 4:2:0 or 4:4:4 for RGB, 4:2:0:4 or 4:4:4:4 for CMYK */
  var chromaSubsampling: java.lang.String
  /** Number of pixels per inch (DPI), if present */
  var density: js.UndefOr[scala.Double] = js.undefined
  /** Name of pixel depth format e.g. uchar, char, ushort, float ... */
  var depth: js.UndefOr[java.lang.String] = js.undefined
  /** Buffer containing raw EXIF data, if present */
  var exif: js.UndefOr[nodeLib.Buffer] = js.undefined
  /** Name of decoder used to decompress image data e.g. jpeg, png, webp, gif, svg */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating the presence of an alpha transparency channel */
  var hasAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /** Boolean indicating the presence of an embedded ICC profile */
  var hasProfile: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of pixels high (EXIF orientation is not taken into consideration) */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Buffer containing raw ICC profile data, if present */
  var icc: js.UndefOr[nodeLib.Buffer] = js.undefined
  /** Buffer containing raw IPTC data, if present */
  var iptc: js.UndefOr[nodeLib.Buffer] = js.undefined
  /** Boolean indicating whether the image is interlaced using a progressive scan */
  var isProgressive: js.UndefOr[scala.Boolean] = js.undefined
  /** Total size of image in bytes, for Stream and Buffer input only */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** Name of colour space interpretation e.g. srgb, rgb, cmyk, lab, b-w ... */
  var space: js.UndefOr[java.lang.String] = js.undefined
  /** Number of pixels wide (EXIF orientation is not taken into consideration) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Buffer containing raw XMP data, if present */
  var xmp: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    chromaSubsampling: java.lang.String,
    channels: Channels = null,
    density: scala.Int | scala.Double = null,
    depth: java.lang.String = null,
    exif: nodeLib.Buffer = null,
    format: java.lang.String = null,
    hasAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    hasProfile: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    icc: nodeLib.Buffer = null,
    iptc: nodeLib.Buffer = null,
    isProgressive: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    space: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xmp: nodeLib.Buffer = null
  ): Metadata = {
    val __obj = js.Dynamic.literal(chromaSubsampling = chromaSubsampling)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth)
    if (exif != null) __obj.updateDynamic("exif")(exif)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasAlpha)) __obj.updateDynamic("hasAlpha")(hasAlpha)
    if (!js.isUndefined(hasProfile)) __obj.updateDynamic("hasProfile")(hasProfile)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icc != null) __obj.updateDynamic("icc")(icc)
    if (iptc != null) __obj.updateDynamic("iptc")(iptc)
    if (!js.isUndefined(isProgressive)) __obj.updateDynamic("isProgressive")(isProgressive)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xmp != null) __obj.updateDynamic("xmp")(xmp)
    __obj.asInstanceOf[Metadata]
  }
}

