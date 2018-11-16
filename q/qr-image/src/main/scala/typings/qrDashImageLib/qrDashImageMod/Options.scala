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

