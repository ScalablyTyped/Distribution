package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the user such as display name, birthday,
  * and current weather. Accessible through global.userContextSystem.
  *
  * All callbacks will execute as soon as the requested information is available.
  * In some rare cases, the requested information may be completely unavailable,
  * and the callback will never occur.
  *
  * Note that formatted or localized strings may appear differently to users
  * depending on their region.
  */
trait UserContextSystem
  extends StObject
     with ScriptObject {
  
  /** Provides the user’s current altitude as a localized string. */
  def requestAltitudeFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the user’s current altitude in meters. */
  def requestAltitudeInMeters(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s birth date as a Date object. */
  def requestBirthdate(callback: js.Function1[/* data */ js.Date, Unit]): Unit
  
  /** Provides the user’s birth date as localized string. */
  def requestBirthdateFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the name of the city the user is currently located in. */
  def requestCity(callback: js.Function1[/* data */ String, Unit]): Unit
  
  /** Provides the user’s display name. */
  def requestDisplayName(callback: js.Function1[/* data */ String, Unit]): Unit
  
  /** Provides the user’s current temperature in celsius. */
  def requestTemperatureCelsius(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s current temperature in fahrenheit. */
  def requestTemperatureFahrenheit(callback: js.Function1[/* data */ Double, Unit]): Unit
  
  /** Provides the user’s current temperature as a localized string. */
  def requestTemperatureFormatted(callback: js.Function1[/* formattedData */ String, Unit]): Unit
  
  /** Provides the user’s current weather condition. */
  def requestWeatherCondition(callback: js.Function1[/* data */ WeatherCondition, Unit]): Unit
  
  /** Provides the user’s current weather condition as a localized string. */
  def requestWeatherLocalized(callback: js.Function1[/* formattedData */ String, Unit]): Unit
}
object UserContextSystem {
  
  inline def apply(
    getTypeName: () => String,
    isOfType: String => Boolean,
    requestAltitudeFormatted: js.Function1[/* formattedData */ String, Unit] => Unit,
    requestAltitudeInMeters: js.Function1[/* data */ Double, Unit] => Unit,
    requestBirthdate: js.Function1[/* data */ js.Date, Unit] => Unit,
    requestBirthdateFormatted: js.Function1[/* formattedData */ String, Unit] => Unit,
    requestCity: js.Function1[/* data */ String, Unit] => Unit,
    requestDisplayName: js.Function1[/* data */ String, Unit] => Unit,
    requestTemperatureCelsius: js.Function1[/* data */ Double, Unit] => Unit,
    requestTemperatureFahrenheit: js.Function1[/* data */ Double, Unit] => Unit,
    requestTemperatureFormatted: js.Function1[/* formattedData */ String, Unit] => Unit,
    requestWeatherCondition: js.Function1[/* data */ WeatherCondition, Unit] => Unit,
    requestWeatherLocalized: js.Function1[/* formattedData */ String, Unit] => Unit
  ): UserContextSystem = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), requestAltitudeFormatted = js.Any.fromFunction1(requestAltitudeFormatted), requestAltitudeInMeters = js.Any.fromFunction1(requestAltitudeInMeters), requestBirthdate = js.Any.fromFunction1(requestBirthdate), requestBirthdateFormatted = js.Any.fromFunction1(requestBirthdateFormatted), requestCity = js.Any.fromFunction1(requestCity), requestDisplayName = js.Any.fromFunction1(requestDisplayName), requestTemperatureCelsius = js.Any.fromFunction1(requestTemperatureCelsius), requestTemperatureFahrenheit = js.Any.fromFunction1(requestTemperatureFahrenheit), requestTemperatureFormatted = js.Any.fromFunction1(requestTemperatureFormatted), requestWeatherCondition = js.Any.fromFunction1(requestWeatherCondition), requestWeatherLocalized = js.Any.fromFunction1(requestWeatherLocalized))
    __obj.asInstanceOf[UserContextSystem]
  }
  
  extension [Self <: UserContextSystem](x: Self) {
    
    inline def setRequestAltitudeFormatted(value: js.Function1[/* formattedData */ String, Unit] => Unit): Self = StObject.set(x, "requestAltitudeFormatted", js.Any.fromFunction1(value))
    
    inline def setRequestAltitudeInMeters(value: js.Function1[/* data */ Double, Unit] => Unit): Self = StObject.set(x, "requestAltitudeInMeters", js.Any.fromFunction1(value))
    
    inline def setRequestBirthdate(value: js.Function1[/* data */ js.Date, Unit] => Unit): Self = StObject.set(x, "requestBirthdate", js.Any.fromFunction1(value))
    
    inline def setRequestBirthdateFormatted(value: js.Function1[/* formattedData */ String, Unit] => Unit): Self = StObject.set(x, "requestBirthdateFormatted", js.Any.fromFunction1(value))
    
    inline def setRequestCity(value: js.Function1[/* data */ String, Unit] => Unit): Self = StObject.set(x, "requestCity", js.Any.fromFunction1(value))
    
    inline def setRequestDisplayName(value: js.Function1[/* data */ String, Unit] => Unit): Self = StObject.set(x, "requestDisplayName", js.Any.fromFunction1(value))
    
    inline def setRequestTemperatureCelsius(value: js.Function1[/* data */ Double, Unit] => Unit): Self = StObject.set(x, "requestTemperatureCelsius", js.Any.fromFunction1(value))
    
    inline def setRequestTemperatureFahrenheit(value: js.Function1[/* data */ Double, Unit] => Unit): Self = StObject.set(x, "requestTemperatureFahrenheit", js.Any.fromFunction1(value))
    
    inline def setRequestTemperatureFormatted(value: js.Function1[/* formattedData */ String, Unit] => Unit): Self = StObject.set(x, "requestTemperatureFormatted", js.Any.fromFunction1(value))
    
    inline def setRequestWeatherCondition(value: js.Function1[/* data */ WeatherCondition, Unit] => Unit): Self = StObject.set(x, "requestWeatherCondition", js.Any.fromFunction1(value))
    
    inline def setRequestWeatherLocalized(value: js.Function1[/* formattedData */ String, Unit] => Unit): Self = StObject.set(x, "requestWeatherLocalized", js.Any.fromFunction1(value))
  }
}
