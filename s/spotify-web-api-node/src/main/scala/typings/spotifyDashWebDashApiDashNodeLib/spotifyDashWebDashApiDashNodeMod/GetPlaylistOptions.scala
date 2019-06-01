package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPlaylistOptions
  extends MarketOptions
     with FieldsOptions

object GetPlaylistOptions {
  @scala.inline
  def apply(fields: java.lang.String = null, market: java.lang.String = null): GetPlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (market != null) __obj.updateDynamic("market")(market)
    __obj.asInstanceOf[GetPlaylistOptions]
  }
}

