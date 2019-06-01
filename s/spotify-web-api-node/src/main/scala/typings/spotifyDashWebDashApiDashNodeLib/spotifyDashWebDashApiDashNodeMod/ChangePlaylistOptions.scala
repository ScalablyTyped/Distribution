package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePlaylistOptions extends PlaylistDetailsOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ChangePlaylistOptions {
  @scala.inline
  def apply(
    collaborative: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    name: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined
  ): ChangePlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collaborative)) __obj.updateDynamic("collaborative")(collaborative)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[ChangePlaylistOptions]
  }
}

