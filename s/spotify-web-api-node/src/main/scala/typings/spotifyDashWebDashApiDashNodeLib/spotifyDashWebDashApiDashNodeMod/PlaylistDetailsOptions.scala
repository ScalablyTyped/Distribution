package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistDetailsOptions extends PublicOptions {
  var collaborative: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistDetailsOptions {
  @scala.inline
  def apply(
    collaborative: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined
  ): PlaylistDetailsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collaborative)) __obj.updateDynamic("collaborative")(collaborative)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[PlaylistDetailsOptions]
  }
}

