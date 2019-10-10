package typings.reactDashNativeDashPhoneDashInput.reactDashNativeDashPhoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountriesListItem extends js.Object {
  var areaCodes: js.Array[String] | Null
  var dialCode: String
  var iso2: String
  var name: String
  var priority: Double
}

object CountriesListItem {
  @scala.inline
  def apply(dialCode: String, iso2: String, name: String, priority: Double, areaCodes: js.Array[String] = null): CountriesListItem = {
    val __obj = js.Dynamic.literal(dialCode = dialCode, iso2 = iso2, name = name, priority = priority)
    if (areaCodes != null) __obj.updateDynamic("areaCodes")(areaCodes)
    __obj.asInstanceOf[CountriesListItem]
  }
}

