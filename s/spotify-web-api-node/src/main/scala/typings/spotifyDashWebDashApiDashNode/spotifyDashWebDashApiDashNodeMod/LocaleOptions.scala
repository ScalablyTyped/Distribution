package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleOptions extends CountryOptions {
  var locale: js.UndefOr[String] = js.undefined
}

object LocaleOptions {
  @scala.inline
  def apply(country: String = null, locale: String = null): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[LocaleOptions]
  }
}

