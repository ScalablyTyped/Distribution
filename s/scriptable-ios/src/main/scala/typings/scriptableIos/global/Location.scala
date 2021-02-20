package typings.scriptableIos.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Fetches your location._
  * @see https://docs.scriptable.app/location
  */
object Location {
  
  /**
    * _Fetches your location._
    *
    * Your location is fetched using GPS, WiFi and cellular hardware. The object carried by the promise includes the latitude, longitude and altitude as well as the horizontal and
    * vertical accuracy measured in meters.
    * @see https://docs.scriptable.app/location/#current
    */
  @JSGlobal("Location.current")
  @js.native
  def current(): js.Promise[_] = js.native
  
  /**
    * _Performs reverse-geocoding for a location._
    *
    * A reverse-geocoding request fetches information about the current location. The data is delivered by Apples geocoding service.
    * @param latitude - Latitude of coordinate to fetch information about.
    * @param longitude - Longitude of coordinate to fetch information about.
    * @param locale - Optional. Preferred locale to fetch information in. Uses the default locale of the device if null.
    * @see https://docs.scriptable.app/location/#reversegeocode
    */
  @JSGlobal("Location.reverseGeocode")
  @js.native
  def reverseGeocode(latitude: Double, longitude: Double): js.Array[StringDictionary[_]] = js.native
  @JSGlobal("Location.reverseGeocode")
  @js.native
  def reverseGeocode(latitude: Double, longitude: Double, locale: String): js.Array[StringDictionary[_]] = js.native
  
  /**
    * _Uses best accuracy. This is default._
    *
    * Set this when you want to achieve the best possible accuracy when retrieving your location. This is the default accuracy.
    * @see https://docs.scriptable.app/location/#setaccuracytobest
    */
  @JSGlobal("Location.setAccuracyToBest")
  @js.native
  def setAccuracyToBest(): Unit = js.native
  
  /**
    * _Sets accuracy to within hundred meters._
    * @see https://docs.scriptable.app/location/#setaccuracytohundredmeters
    */
  @JSGlobal("Location.setAccuracyToHundredMeters")
  @js.native
  def setAccuracyToHundredMeters(): Unit = js.native
  
  /**
    * _Sets accuracy to within one kilometer._
    * @see https://docs.scriptable.app/location/#setaccuracytokilometer
    */
  @JSGlobal("Location.setAccuracyToKilometer")
  @js.native
  def setAccuracyToKilometer(): Unit = js.native
  
  /**
    * _Sets accuracy to within ten meters._
    * @see https://docs.scriptable.app/location/#setaccuracytotenmeters
    */
  @JSGlobal("Location.setAccuracyToTenMeters")
  @js.native
  def setAccuracyToTenMeters(): Unit = js.native
  
  /**
    * _Sets accuracy to within three kilometers._
    * @see https://docs.scriptable.app/location/#setaccuracytothreekilometers
    */
  @JSGlobal("Location.setAccuracyToThreeKilometers")
  @js.native
  def setAccuracyToThreeKilometers(): Unit = js.native
}
