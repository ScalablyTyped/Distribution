package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeOptions extends LimitOptions {
  var before: js.UndefOr[scala.Double] = js.undefined
}

object BeforeOptions {
  @scala.inline
  def apply(before: scala.Int | scala.Double = null, limit: scala.Int | scala.Double = null): BeforeOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeOptions]
  }
}

