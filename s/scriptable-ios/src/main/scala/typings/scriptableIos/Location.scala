package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Location {
  
  trait CurrentLocation extends StObject {
    
    var altitude: Double
    
    var horizontalAccuracy: Double
    
    var latitude: Double
    
    var longitude: Double
    
    var verticalAccuracy: Double
  }
  object CurrentLocation {
    
    inline def apply(
      altitude: Double,
      horizontalAccuracy: Double,
      latitude: Double,
      longitude: Double,
      verticalAccuracy: Double
    ): CurrentLocation = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], horizontalAccuracy = horizontalAccuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], verticalAccuracy = verticalAccuracy.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentLocation]
    }
    
    extension [Self <: CurrentLocation](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAccuracy(value: Double): Self = StObject.set(x, "horizontalAccuracy", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setVerticalAccuracy(value: Double): Self = StObject.set(x, "verticalAccuracy", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeLocation extends StObject {
    
    var altitude: Double
    
    var latitude: Double
    
    var longitude: Double
  }
  object GeocodeLocation {
    
    inline def apply(altitude: Double, latitude: Double, longitude: Double): GeocodeLocation = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodeLocation]
    }
    
    extension [Self <: GeocodeLocation](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodePostalAddress extends StObject {
    
    var city: String
    
    var country: String
    
    var isoCountryCode: String
    
    var postalCode: String
    
    var state: String
    
    var street: String
    
    var subAdministrativeArea: String
    
    var subLocality: String
  }
  object GeocodePostalAddress {
    
    inline def apply(
      city: String,
      country: String,
      isoCountryCode: String,
      postalCode: String,
      state: String,
      street: String,
      subAdministrativeArea: String,
      subLocality: String
    ): GeocodePostalAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], isoCountryCode = isoCountryCode.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], subAdministrativeArea = subAdministrativeArea.asInstanceOf[js.Any], subLocality = subLocality.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeocodePostalAddress]
    }
    
    extension [Self <: GeocodePostalAddress](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryCode(value: String): Self = StObject.set(x, "isoCountryCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setSubAdministrativeArea(value: String): Self = StObject.set(x, "subAdministrativeArea", value.asInstanceOf[js.Any])
      
      inline def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeocodeSummary extends StObject {
    
    var administrativeArea: String | Null
    
    var areasOfInterest: js.Array[String] | Null
    
    var country: String | Null
    
    var inlandWater: String | Null
    
    var isoCountryCode: String | Null
    
    var locality: String | Null
    
    var location: GeocodeLocation
    
    var name: String
    
    var ocean: String | Null
    
    var postalAddress: GeocodePostalAddress
    
    var postalCode: String | Null
    
    var subAdministrativeArea: String | Null
    
    var subLocality: String | Null
    
    var subThoroughfare: String | Null
    
    var thoroughfare: String | Null
    
    var timeZone: String
  }
  object GeocodeSummary {
    
    inline def apply(location: GeocodeLocation, name: String, postalAddress: GeocodePostalAddress, timeZone: String): GeocodeSummary = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], postalAddress = postalAddress.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], administrativeArea = null, areasOfInterest = null, country = null, inlandWater = null, isoCountryCode = null, locality = null, ocean = null, postalCode = null, subAdministrativeArea = null, subLocality = null, subThoroughfare = null, thoroughfare = null)
      __obj.asInstanceOf[GeocodeSummary]
    }
    
    extension [Self <: GeocodeSummary](x: Self) {
      
      inline def setAdministrativeArea(value: String): Self = StObject.set(x, "administrativeArea", value.asInstanceOf[js.Any])
      
      inline def setAdministrativeAreaNull: Self = StObject.set(x, "administrativeArea", null)
      
      inline def setAreasOfInterest(value: js.Array[String]): Self = StObject.set(x, "areasOfInterest", value.asInstanceOf[js.Any])
      
      inline def setAreasOfInterestNull: Self = StObject.set(x, "areasOfInterest", null)
      
      inline def setAreasOfInterestVarargs(value: String*): Self = StObject.set(x, "areasOfInterest", js.Array(value*))
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryNull: Self = StObject.set(x, "country", null)
      
      inline def setInlandWater(value: String): Self = StObject.set(x, "inlandWater", value.asInstanceOf[js.Any])
      
      inline def setInlandWaterNull: Self = StObject.set(x, "inlandWater", null)
      
      inline def setIsoCountryCode(value: String): Self = StObject.set(x, "isoCountryCode", value.asInstanceOf[js.Any])
      
      inline def setIsoCountryCodeNull: Self = StObject.set(x, "isoCountryCode", null)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityNull: Self = StObject.set(x, "locality", null)
      
      inline def setLocation(value: GeocodeLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOcean(value: String): Self = StObject.set(x, "ocean", value.asInstanceOf[js.Any])
      
      inline def setOceanNull: Self = StObject.set(x, "ocean", null)
      
      inline def setPostalAddress(value: GeocodePostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
      
      inline def setSubAdministrativeArea(value: String): Self = StObject.set(x, "subAdministrativeArea", value.asInstanceOf[js.Any])
      
      inline def setSubAdministrativeAreaNull: Self = StObject.set(x, "subAdministrativeArea", null)
      
      inline def setSubLocality(value: String): Self = StObject.set(x, "subLocality", value.asInstanceOf[js.Any])
      
      inline def setSubLocalityNull: Self = StObject.set(x, "subLocality", null)
      
      inline def setSubThoroughfare(value: String): Self = StObject.set(x, "subThoroughfare", value.asInstanceOf[js.Any])
      
      inline def setSubThoroughfareNull: Self = StObject.set(x, "subThoroughfare", null)
      
      inline def setThoroughfare(value: String): Self = StObject.set(x, "thoroughfare", value.asInstanceOf[js.Any])
      
      inline def setThoroughfareNull: Self = StObject.set(x, "thoroughfare", null)
      
      inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    }
  }
}
