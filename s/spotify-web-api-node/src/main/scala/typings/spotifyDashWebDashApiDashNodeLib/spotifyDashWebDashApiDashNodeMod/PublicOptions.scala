package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicOptions extends js.Object {
  var public: js.UndefOr[scala.Boolean] = js.undefined
}

object PublicOptions {
  @scala.inline
  def apply(public: js.UndefOr[scala.Boolean] = js.undefined): PublicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[PublicOptions]
  }
}

