package typings.smartystreetsJavascriptSdk.mod.usZipcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZipCode extends js.Object {
  
  var alternateCounties: js.Array[County] = js.native
  
  var countyFips: js.Any = js.native
  
  var countyName: String = js.native
  
  var defaultCity: String = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var precision: String = js.native
  
  var state: String = js.native
  
  var stateAbbreviation: String = js.native
  
  var zipcode: String = js.native
  
  var zipcodeType: String = js.native
}
object ZipCode {
  
  @scala.inline
  def apply(
    alternateCounties: js.Array[County],
    countyFips: js.Any,
    countyName: String,
    defaultCity: String,
    latitude: Double,
    longitude: Double,
    precision: String,
    state: String,
    stateAbbreviation: String,
    zipcode: String,
    zipcodeType: String
  ): ZipCode = {
    val __obj = js.Dynamic.literal(alternateCounties = alternateCounties.asInstanceOf[js.Any], countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], defaultCity = defaultCity.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any], zipcodeType = zipcodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipCode]
  }
  
  @scala.inline
  implicit class ZipCodeOps[Self <: ZipCode] (val x: Self) extends AnyVal {
    
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
    def setAlternateCountiesVarargs(value: County*): Self = this.set("alternateCounties", js.Array(value :_*))
    
    @scala.inline
    def setAlternateCounties(value: js.Array[County]): Self = this.set("alternateCounties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyFips(value: js.Any): Self = this.set("countyFips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountyName(value: String): Self = this.set("countyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCity(value: String): Self = this.set("defaultCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = this.set("latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = this.set("longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: String): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateAbbreviation(value: String): Self = this.set("stateAbbreviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipcode(value: String): Self = this.set("zipcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipcodeType(value: String): Self = this.set("zipcodeType", value.asInstanceOf[js.Any])
  }
}
