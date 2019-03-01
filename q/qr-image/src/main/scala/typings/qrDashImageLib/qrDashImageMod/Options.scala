package typings
package qrDashImageLib.qrDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ec_level: js.UndefOr[ec_level] = js.undefined
  		// (png and svg only) for png and undefined for svg.-(png and svg only) — size of one module in pixels.
  var margin: js.UndefOr[scala.Double] = js.undefined
  		// (only png)for png and 1 for others.-white space around QR image in modules.
  var parse_url: js.UndefOr[scala.Boolean] = js.undefined
  		// image type. Possible values png(default), svg, pdf and eps.
  var size: js.UndefOr[scala.Double] = js.undefined
  	// error correction level. One of L, M, Q, H. Default M.
  var `type`: js.UndefOr[image_type] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ec_level: ec_level = null,
    margin: scala.Int | scala.Double = null,
    parse_url: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    `type`: image_type = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ec_level != null) __obj.updateDynamic("ec_level")(ec_level)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(parse_url)) __obj.updateDynamic("parse_url")(parse_url)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Options]
  }
}

