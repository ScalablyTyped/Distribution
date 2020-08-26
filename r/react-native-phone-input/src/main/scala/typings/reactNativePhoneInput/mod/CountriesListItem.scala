package typings.reactNativePhoneInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountriesListItem extends js.Object {
  var areaCodes: js.Array[String] | Null = js.native
  var dialCode: String = js.native
  var iso2: String = js.native
  var name: String = js.native
  var priority: Double = js.native
}

object CountriesListItem {
  @scala.inline
  def apply(dialCode: String, iso2: String, name: String, priority: Double): CountriesListItem = {
    val __obj = js.Dynamic.literal(dialCode = dialCode.asInstanceOf[js.Any], iso2 = iso2.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountriesListItem]
  }
  @scala.inline
  implicit class CountriesListItemOps[Self <: CountriesListItem] (val x: Self) extends AnyVal {
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
    def setDialCode(value: String): Self = this.set("dialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso2(value: String): Self = this.set("iso2", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaCodesVarargs(value: String*): Self = this.set("areaCodes", js.Array(value :_*))
    @scala.inline
    def setAreaCodes(value: js.Array[String]): Self = this.set("areaCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAreaCodesNull: Self = this.set("areaCodes", null)
  }
  
}

