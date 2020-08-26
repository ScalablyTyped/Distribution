package typings.reactPhoneNumberInput.anon

import typings.reactPhoneNumberInput.mod.FlagsMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  var country: String = js.native
  var flags: FlagsMap = js.native
  var flagsPath: String = js.native
}

object Country {
  @scala.inline
  def apply(country: String, flags: FlagsMap, flagsPath: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], flagsPath = flagsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: FlagsMap): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlagsPath(value: String): Self = this.set("flagsPath", value.asInstanceOf[js.Any])
  }
  
}

