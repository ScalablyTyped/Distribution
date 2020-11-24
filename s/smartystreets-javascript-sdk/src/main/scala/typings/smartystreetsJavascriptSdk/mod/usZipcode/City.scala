package typings.smartystreetsJavascriptSdk.mod.usZipcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait City extends js.Object {
  
  var city: String = js.native
  
  var mailableCity: String = js.native
  
  var state: String = js.native
  
  var stateAbbreviation: String = js.native
}
object City {
  
  @scala.inline
  def apply(city: String, mailableCity: String, state: String, stateAbbreviation: String): City = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], mailableCity = mailableCity.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
    __obj.asInstanceOf[City]
  }
  
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailableCity(value: String): Self = this.set("mailableCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateAbbreviation(value: String): Self = this.set("stateAbbreviation", value.asInstanceOf[js.Any])
  }
}
