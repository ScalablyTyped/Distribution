package typings.reactPhoneNumberInput.anon

import typings.reactPhoneNumberInput.mod.FlagsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var country: String
  var flags: FlagsMap
  var flagsPath: String
}

object Country {
  @scala.inline
  def apply(country: String, flags: FlagsMap, flagsPath: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], flagsPath = flagsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

