package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistDetailsOptions extends PublicOptions {
  var collaborative: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
}

object PlaylistDetailsOptions {
  @scala.inline
  def apply(
    collaborative: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    public: js.UndefOr[Boolean] = js.undefined
  ): PlaylistDetailsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collaborative)) __obj.updateDynamic("collaborative")(collaborative.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistDetailsOptions]
  }
}

