package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePlaylistOptions extends PlaylistDetailsOptions {
  var name: js.UndefOr[String] = js.undefined
}

object ChangePlaylistOptions {
  @scala.inline
  def apply(
    collaborative: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    name: String = null,
    public: js.UndefOr[Boolean] = js.undefined
  ): ChangePlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collaborative)) __obj.updateDynamic("collaborative")(collaborative)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    __obj.asInstanceOf[ChangePlaylistOptions]
  }
}

