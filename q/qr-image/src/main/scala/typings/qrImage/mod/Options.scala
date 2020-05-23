package typings.qrImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ec_level: js.UndefOr[ecLevel] = js.undefined
          // (png and svg only) for png and undefined for svg.-(png and svg only) — size of one module in pixels.
  var margin: js.UndefOr[Double] = js.undefined
          // (only png)for png and 1 for others.-white space around QR image in modules.
  var parse_url: js.UndefOr[Boolean] = js.undefined
          // image type. Possible values png(default), svg, pdf and eps.
  var size: js.UndefOr[Double] = js.undefined
      // error correction level. One of L, M, Q, H. Default M.
  var `type`: js.UndefOr[imageType] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ec_level: ecLevel = null,
    margin: js.UndefOr[Double] = js.undefined,
    parse_url: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    `type`: imageType = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ec_level != null) __obj.updateDynamic("ec_level")(ec_level.asInstanceOf[js.Any])
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parse_url)) __obj.updateDynamic("parse_url")(parse_url.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

