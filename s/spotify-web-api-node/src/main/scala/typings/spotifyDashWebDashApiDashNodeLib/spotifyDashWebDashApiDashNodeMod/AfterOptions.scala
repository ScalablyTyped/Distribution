package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterOptions extends LimitOptions {
  var after: js.UndefOr[scala.Double] = js.undefined
}

object AfterOptions {
  @scala.inline
  def apply(after: scala.Int | scala.Double = null, limit: scala.Int | scala.Double = null): AfterOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterOptions]
  }
}

