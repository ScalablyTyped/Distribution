package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputInfo extends js.Object {
  var channels: scala.Double
  /** Only defined when using a crop strategy */
  var cropOffsetLeft: js.UndefOr[scala.Double] = js.undefined
  /** Only defined when using a crop strategy */
  var cropOffsetTop: js.UndefOr[scala.Double] = js.undefined
  var format: java.lang.String
  var height: scala.Double
  /** indicating if premultiplication was used */
  var premultiplied: scala.Boolean
  var size: scala.Double
  var width: scala.Double
}

