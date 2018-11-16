package typings
package sharpLib.sharpMod.sharpNs

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

