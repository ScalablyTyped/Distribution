package typings.scriptableIos.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Fetches your location._
  * @see https://docs.scriptable.app/location
  */
object Location {
  
  @JSGlobal("Location")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Fetches your location._
    *
    * Your location is fetched using GPS, WiFi and cellular hardware. The object carried by the promise includes the latitude, longitude and altitude as well as the horizontal and
    * vertical accuracy measured in meters.
    * @see https://docs.scriptable.app/location/#current
    */
  inline def current(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[js.Promise[js.Any]]
  
  /**
    * _Performs reverse-geocoding for a location._
    *
    * A reverse-geocoding request fetches information about the current location. The data is delivered by Apples geocoding service.
    * @param latitude - Latitude of coordinate to fetch information about.
    * @param longitude - Longitude of coordinate to fetch information about.
    * @param locale - Optional. Preferred locale to fetch information in. Uses the default locale of the device if null.
    * @see https://docs.scriptable.app/location/#reversegeocode
    */
  inline def reverseGeocode(latitude: Double, longitude: Double): js.Array[StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringDictionary[js.Any]]]
  inline def reverseGeocode(latitude: Double, longitude: Double, locale: String): js.Array[StringDictionary[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseGeocode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringDictionary[js.Any]]]
  
  /**
    * _Uses best accuracy. This is default._
    *
    * Set this when you want to achieve the best possible accuracy when retrieving your location. This is the default accuracy.
    * @see https://docs.scriptable.app/location/#setaccuracytobest
    */
  inline def setAccuracyToBest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccuracyToBest")().asInstanceOf[Unit]
  
  /**
    * _Sets accuracy to within hundred meters._
    * @see https://docs.scriptable.app/location/#setaccuracytohundredmeters
    */
  inline def setAccuracyToHundredMeters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccuracyToHundredMeters")().asInstanceOf[Unit]
  
  /**
    * _Sets accuracy to within one kilometer._
    * @see https://docs.scriptable.app/location/#setaccuracytokilometer
    */
  inline def setAccuracyToKilometer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccuracyToKilometer")().asInstanceOf[Unit]
  
  /**
    * _Sets accuracy to within ten meters._
    * @see https://docs.scriptable.app/location/#setaccuracytotenmeters
    */
  inline def setAccuracyToTenMeters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccuracyToTenMeters")().asInstanceOf[Unit]
  
  /**
    * _Sets accuracy to within three kilometers._
    * @see https://docs.scriptable.app/location/#setaccuracytothreekilometers
    */
  inline def setAccuracyToThreeKilometers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccuracyToThreeKilometers")().asInstanceOf[Unit]
}
