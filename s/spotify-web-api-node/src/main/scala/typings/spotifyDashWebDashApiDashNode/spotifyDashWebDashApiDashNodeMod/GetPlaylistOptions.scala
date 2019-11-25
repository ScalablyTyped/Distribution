package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlaylistOptions
  extends MarketOptions
     with FieldsOptions

object GetPlaylistOptions {
  @scala.inline
  def apply(fields: String = null, market: String = null): GetPlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (market != null) __obj.updateDynamic("market")(market.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaylistOptions]
  }
}

