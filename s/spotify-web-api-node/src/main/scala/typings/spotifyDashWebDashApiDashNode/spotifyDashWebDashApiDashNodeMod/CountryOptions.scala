package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountryOptions extends js.Object {
  var country: js.UndefOr[String] = js.undefined
}

object CountryOptions {
  @scala.inline
  def apply(country: String = null): CountryOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    __obj.asInstanceOf[CountryOptions]
  }
}

