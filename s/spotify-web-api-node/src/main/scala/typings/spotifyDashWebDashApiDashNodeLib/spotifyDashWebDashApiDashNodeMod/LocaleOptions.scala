package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleOptions extends CountryOptions {
  var locale: js.UndefOr[java.lang.String] = js.undefined
}

object LocaleOptions {
  @scala.inline
  def apply(country: java.lang.String = null, locale: java.lang.String = null): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[LocaleOptions]
  }
}

