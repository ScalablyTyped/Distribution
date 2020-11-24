package typings.smartystreetsJavascriptSdk.mod.usStreet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Componenet extends js.Object {
  
  var cityName: String = js.native
  
  var defaultCityName: String = js.native
  
  var deliveryPoint: String = js.native
  
  var deliveryPointCheckDigit: String = js.native
  
  var extraSecondaryDesignator: js.Any = js.native
  
  var extraSecondaryNumber: js.Any = js.native
  
  var plus4Code: String = js.native
  
  var pmbDesignator: js.Any = js.native
  
  var pmbNumber: js.Any = js.native
  
  var primaryNumber: String = js.native
  
  var secondaryDesignator: String = js.native
  
  var secondaryNumber: String = js.native
  
  var state: String = js.native
  
  var streetName: String = js.native
  
  var streetPostdirection: String = js.native
  
  var streetPredirection: String = js.native
  
  var streetSuffix: String = js.native
  
  var urbanization: String = js.native
  
  var zipCode: String = js.native
}
object Componenet {
  
  @scala.inline
  def apply(
    cityName: String,
    defaultCityName: String,
    deliveryPoint: String,
    deliveryPointCheckDigit: String,
    extraSecondaryDesignator: js.Any,
    extraSecondaryNumber: js.Any,
    plus4Code: String,
    pmbDesignator: js.Any,
    pmbNumber: js.Any,
    primaryNumber: String,
    secondaryDesignator: String,
    secondaryNumber: String,
    state: String,
    streetName: String,
    streetPostdirection: String,
    streetPredirection: String,
    streetSuffix: String,
    urbanization: String,
    zipCode: String
  ): Componenet = {
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], defaultCityName = defaultCityName.asInstanceOf[js.Any], deliveryPoint = deliveryPoint.asInstanceOf[js.Any], deliveryPointCheckDigit = deliveryPointCheckDigit.asInstanceOf[js.Any], extraSecondaryDesignator = extraSecondaryDesignator.asInstanceOf[js.Any], extraSecondaryNumber = extraSecondaryNumber.asInstanceOf[js.Any], plus4Code = plus4Code.asInstanceOf[js.Any], pmbDesignator = pmbDesignator.asInstanceOf[js.Any], pmbNumber = pmbNumber.asInstanceOf[js.Any], primaryNumber = primaryNumber.asInstanceOf[js.Any], secondaryDesignator = secondaryDesignator.asInstanceOf[js.Any], secondaryNumber = secondaryNumber.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streetName = streetName.asInstanceOf[js.Any], streetPostdirection = streetPostdirection.asInstanceOf[js.Any], streetPredirection = streetPredirection.asInstanceOf[js.Any], streetSuffix = streetSuffix.asInstanceOf[js.Any], urbanization = urbanization.asInstanceOf[js.Any], zipCode = zipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Componenet]
  }
  
  @scala.inline
  implicit class ComponenetOps[Self <: Componenet] (val x: Self) extends AnyVal {
    
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
    def setCityName(value: String): Self = this.set("cityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCityName(value: String): Self = this.set("defaultCityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPoint(value: String): Self = this.set("deliveryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryPointCheckDigit(value: String): Self = this.set("deliveryPointCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraSecondaryDesignator(value: js.Any): Self = this.set("extraSecondaryDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraSecondaryNumber(value: js.Any): Self = this.set("extraSecondaryNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlus4Code(value: String): Self = this.set("plus4Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmbDesignator(value: js.Any): Self = this.set("pmbDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmbNumber(value: js.Any): Self = this.set("pmbNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryNumber(value: String): Self = this.set("primaryNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryDesignator(value: String): Self = this.set("secondaryDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryNumber(value: String): Self = this.set("secondaryNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetName(value: String): Self = this.set("streetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetPostdirection(value: String): Self = this.set("streetPostdirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetPredirection(value: String): Self = this.set("streetPredirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetSuffix(value: String): Self = this.set("streetSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrbanization(value: String): Self = this.set("urbanization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipCode(value: String): Self = this.set("zipCode", value.asInstanceOf[js.Any])
  }
}
