package typings.smartystreetsJavascriptSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usReverseGeo {
  
  @JSImport("smartystreets-javascript-sdk", "usReverseGeo.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(
      /** The latitude portion of the coordinate. The latitude must be specified as a decimal between **-90.0** and **90.0.** */
    latitude: String,
      /** The longitude portion of the coordinate. The longitude must be specified as a decimal between **-180.0** and **180.0**. */
    longitude: String
    ) = this()
    
    /** **Required**. The latitude portion of the coordinate. The latitude must be specified as a decimal between **-90.0** and **90.0.** */
    var latitude: String = js.native
    
    /** **Required**. The longitude portion of the coordinate. The longitude must be specified as a decimal between **-180.0** and **180.0**. */
    var longitude: String = js.native
    
    var response: Response = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usReverseGeo.Response")
  @js.native
  open class Response protected () extends StObject {
    def this(responseData: Any) = this()
    
    /** The array of result objects. Each object contains the fields described in the Result. */
    var results: js.Array[Result] = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usReverseGeo.Result")
  @js.native
  open class Result protected () extends StObject {
    def this(responseData: Any) = this()
    
    var address: ResultAddress = js.native
    
    var coordinate: ResultCoordinate = js.native
    
    /** The distance in meters of this address to the input latitude/longitude values. */
    var distance: Double = js.native
  }
  
  trait ResultAddress extends StObject {
    
    /** The city name of this address. */
    var city: String
    
    /** The state abbreviation of this address. */
    var state_abbreviation: String
    
    /** The street name of this address. */
    var street: String
    
    /** The 5-digit ZIP Code of this address. */
    var zipcode: String
  }
  object ResultAddress {
    
    inline def apply(city: String, state_abbreviation: String, street: String, zipcode: String): ResultAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], state_abbreviation = state_abbreviation.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], zipcode = zipcode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultAddress]
    }
    
    extension [Self <: ResultAddress](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setState_abbreviation(value: String): Self = StObject.set(x, "state_abbreviation", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setZipcode(value: String): Self = StObject.set(x, "zipcode", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultCoordinate extends StObject {
    
    /**
      * Indicates the accuracy of the latitude and longitude values.
      * - **Unknown** — Coordinates not known. Reasons could include: lat/lon coordinates not available.
      * - **Zip5** — Accurate to a 5-digit ZIP Code level (least accurate)
      * - **Zip6** — Accurate to a 6-digit ZIP Code level
      * - **Zip7** — Accurate to a 7-digit ZIP Code level
      * - **Zip8** — Accurate to an 8-digit ZIP Code level
      * - **Zip9** — Accurate to a [9-digit ZIP Code level](https://smartystreets.com/articles/zip-4-code)
      * - **Parcel** — Accurate to the centroid of a property parcel.
      * - **Rooftop** — Accurate to the rooftop of a structure for this address.
      *
      * Note: Concerning addresses for which the ZIP9 accuracy is not available, the ZIP# accuracy is interpolated based on neighboring addresses. Thus, ZIP7 is an average of all the lat/long
      * coordinates of nearby ZIP Codes that share those first 7 digits.
      */
    var accuracy: String
    
    /** The latitude value of this address. */
    var latitude: Double
    
    /** The license ID for the geographic coordinate returned. See the licensing table below for more details. */
    var license: Double
    
    /** The longitude value of this address. */
    var longitude: Double
  }
  object ResultCoordinate {
    
    inline def apply(accuracy: String, latitude: Double, license: Double, longitude: Double): ResultCoordinate = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultCoordinate]
    }
    
    extension [Self <: ResultCoordinate](x: Self) {
      
      inline def setAccuracy(value: String): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: Double): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
}
