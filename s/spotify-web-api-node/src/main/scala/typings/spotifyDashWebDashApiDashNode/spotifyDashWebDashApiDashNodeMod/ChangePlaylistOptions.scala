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
    if (!js.isUndefined(collaborative)) __obj.updateDynamic("collaborative")(collaborative.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangePlaylistOptions]
  }
}

