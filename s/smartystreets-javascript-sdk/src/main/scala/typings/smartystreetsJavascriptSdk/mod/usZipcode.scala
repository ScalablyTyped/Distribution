package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usZipcode {
  
  @JSImport("smartystreets-javascript-sdk", "usZipcode.Lookup")
  @js.native
  class Lookup ()
    extends StObject
       with typings.smartystreetsJavascriptSdk.mod.core.Lookup {
    def this(city: String) = this()
    def this(city: String, state: String) = this()
    def this(city: Unit, state: String) = this()
    def this(city: String, state: String, zipCode: String) = this()
    def this(city: String, state: Unit, zipCode: String) = this()
    def this(city: Unit, state: String, zipCode: String) = this()
    def this(city: Unit, state: Unit, zipCode: String) = this()
    def this(city: String, state: String, zipCode: String, inputId: String) = this()
    def this(city: String, state: String, zipCode: Unit, inputId: String) = this()
    def this(city: String, state: Unit, zipCode: String, inputId: String) = this()
    def this(city: String, state: Unit, zipCode: Unit, inputId: String) = this()
    def this(city: Unit, state: String, zipCode: String, inputId: String) = this()
    def this(city: Unit, state: String, zipCode: Unit, inputId: String) = this()
    def this(city: Unit, state: Unit, zipCode: String, inputId: String) = this()
    def this(city: Unit, state: Unit, zipCode: Unit, inputId: String) = this()
    
    var city: String = js.native
    
    var inputId: String = js.native
    
    var result: js.Array[js.Any] = js.native
    
    var state: String = js.native
    
    var zipCode: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usZipcode.Result")
  @js.native
  class Result protected () extends StObject {
    def this(responseData: js.Any) = this()
    
    var cities: js.Array[City] = js.native
    
    var inputIndex: String = js.native
    
    var reason: String = js.native
    
    var status: String = js.native
    
    var valid: Boolean = js.native
    
    var zipcodes: js.Array[ZipCode] = js.native
  }
  
  trait City extends StObject {
    
    var city: String
    
    var mailableCity: String
    
    var state: String
    
    var stateAbbreviation: String
  }
  object City {
    
    inline def apply(city: String, mailableCity: String, state: String, stateAbbreviation: String): City = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], mailableCity = mailableCity.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
      __obj.asInstanceOf[City]
    }
    
    extension [Self <: City](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setMailableCity(value: String): Self = StObject.set(x, "mailableCity", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
    }
  }
  
  trait County extends StObject {
    
    var countyFips: js.Any
    
    var countyName: String
    
    var state: String
    
    var stateAbbreviation: String
  }
  object County {
    
    inline def apply(countyFips: js.Any, countyName: String, state: String, stateAbbreviation: String): County = {
      val __obj = js.Dynamic.literal(countyFips = countyFips.asInstanceOf[js.Any], countyName = countyName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stateAbbreviation = stateAbbreviation.asInstanceOf[js.Any])
      __obj.asInstanceOf[County]
    }
    
    extension [Self <: County](x: Self) {
      
      inline def setCountyFips(value: js.Any): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZipCode extends StObject {
    
    var alternateCounties: js.Array[County]
    
    var countyFips: js.Any
    
    var countyName: String
    
    var defaultCity: String
    
    var latitude: Double
    
    var longitude: Double
    
    var precision: String
    
    var state: String
    
    var stateAbbreviation: String
    
    var zipcode: String
    
    var zipcodeType: String
  }
  object ZipCode {
    
    inline def apply(
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
    
    extension [Self <: ZipCode](x: Self) {
      
      inline def setAlternateCounties(value: js.Array[County]): Self = StObject.set(x, "alternateCounties", value.asInstanceOf[js.Any])
      
      inline def setAlternateCountiesVarargs(value: County*): Self = StObject.set(x, "alternateCounties", js.Array(value :_*))
      
      inline def setCountyFips(value: js.Any): Self = StObject.set(x, "countyFips", value.asInstanceOf[js.Any])
      
      inline def setCountyName(value: String): Self = StObject.set(x, "countyName", value.asInstanceOf[js.Any])
      
      inline def setDefaultCity(value: String): Self = StObject.set(x, "defaultCity", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateAbbreviation(value: String): Self = StObject.set(x, "stateAbbreviation", value.asInstanceOf[js.Any])
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
      
      inline def setZipcodeType(value: String): Self = StObject.set(x, "zipcodeType", value.asInstanceOf[js.Any])
    }
  }
}
