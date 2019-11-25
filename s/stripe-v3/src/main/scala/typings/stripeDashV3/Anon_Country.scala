package typings.stripeDashV3

import typings.stripeDashV3.stripeDashV3Strings.de
import typings.stripeDashV3.stripeDashV3Strings.en
import typings.stripeDashV3.stripeDashV3Strings.es
import typings.stripeDashV3.stripeDashV3Strings.fr
import typings.stripeDashV3.stripeDashV3Strings.it
import typings.stripeDashV3.stripeDashV3Strings.nl
import typings.stripeDashV3.stripeDashV3Strings.pl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country extends js.Object {
  var country: String
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.undefined
}

object Anon_Country {
  @scala.inline
  def apply(country: String, preferred_language: de | en | es | it | fr | nl | pl = null): Anon_Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    if (preferred_language != null) __obj.updateDynamic("preferred_language")(preferred_language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Country]
  }
}

