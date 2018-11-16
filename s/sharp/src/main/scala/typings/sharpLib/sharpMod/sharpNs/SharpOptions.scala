package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SharpOptions extends js.Object {
  /** Describes a new image to be created. */
  var create: js.UndefOr[Create] = js.undefined
  /** Number representing the DPI for vector images. (optional, default 72) */
  var density: js.UndefOr[scala.Double] = js.undefined
  /**
           * By default apply a "best effort" to decode images, even if the data is corrupt or invalid.
           * Set this flag to true if you'd rather halt processing and raise an error when loading invalid images.
           * (optional, default false)
           */
  var failOnError: js.UndefOr[scala.Boolean] = js.undefined
  /** Page number to extract for multi-page input (GIF, TIFF). (optional, default 0) */
  var page: js.UndefOr[scala.Double] = js.undefined
  /** Describes raw pixel input image data. See raw() for pixel ordering. */
  var raw: js.UndefOr[Raw] = js.undefined
}

