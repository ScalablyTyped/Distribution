package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helps convert data types to localized string representations. Accessible through global.localizationSystem. Note that formatted or localized strings may appear differently to users depending on
  * their region. The example results given here are representative of a user in the United States, but may appear differently for users in other regions.
  */
trait LocalizationSystem
  extends StObject
     with ScriptObject {
  
  /** Returns a localized string for the date and time of the passed in Date object. Example: “Jan 1, 2019 at 12:34 AM” */
  def getDateAndTimeFormatted(date: js.Date): String
  
  /** Returns a localized string for the date of the passed in Date object. Example: “Jan 1, 2019” */
  def getDateFormatted(date: js.Date): String
  
  /** Returns a short, localized string for the date of the passed in Date object. Example: “1/1/19” */
  def getDateShortFormatted(date: js.Date): String
  
  /** Returns a localized string for the day of the week of the passed in Date object. Example: “Tuesday” */
  def getDayOfWeek(date: js.Date): String
  
  /** Returns a localized, formatted string representation of the distance in meters passed in. Example: “39.4 in” (from 1 passed in) */
  def getFormattedDistanceFromMeters(meters: Double): String
  
  /** Returns a localized, formatted string representation of the number passed in. Example: “1,234” (from 1234 passed in) */
  def getFormattedNumber(number: Double): String
  
  /** Returns a localized, formatted string representing the number of seconds passed in. Example: “2:06” (from 126 passed in) */
  def getFormattedSeconds(seconds: Double): String
  
  /** Returns a localized, formatted string representation of the celsius temperature passed in. Example: “32°F” (from 0 passed in) */
  def getFormattedTemperatureFromCelsius(temperature: Double): String
  
  /** Returns a localized, formatted string representation of the fahrenheit temperature passed in. Example: “32°F” (from 32 passed in) */
  def getFormattedTemperatureFromFahrenheit(temperature: Double): String
  
  /** Returns the language code of the language being used on the device. Example: “en” ( English: for) */
  def getLanguage(): String
  
  /** Returns a localized string for the month of the passed in Date object. Example: “January” */
  def getMonth(date: js.Date): String
  
  /** Returns a localized string for the time of the passed in Date object. Example: “12:34 AM” */
  def getTimeFormatted(date: js.Date): String
}
object LocalizationSystem {
  
  inline def apply(
    getDateAndTimeFormatted: js.Date => String,
    getDateFormatted: js.Date => String,
    getDateShortFormatted: js.Date => String,
    getDayOfWeek: js.Date => String,
    getFormattedDistanceFromMeters: Double => String,
    getFormattedNumber: Double => String,
    getFormattedSeconds: Double => String,
    getFormattedTemperatureFromCelsius: Double => String,
    getFormattedTemperatureFromFahrenheit: Double => String,
    getLanguage: () => String,
    getMonth: js.Date => String,
    getTimeFormatted: js.Date => String,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): LocalizationSystem = {
    val __obj = js.Dynamic.literal(getDateAndTimeFormatted = js.Any.fromFunction1(getDateAndTimeFormatted), getDateFormatted = js.Any.fromFunction1(getDateFormatted), getDateShortFormatted = js.Any.fromFunction1(getDateShortFormatted), getDayOfWeek = js.Any.fromFunction1(getDayOfWeek), getFormattedDistanceFromMeters = js.Any.fromFunction1(getFormattedDistanceFromMeters), getFormattedNumber = js.Any.fromFunction1(getFormattedNumber), getFormattedSeconds = js.Any.fromFunction1(getFormattedSeconds), getFormattedTemperatureFromCelsius = js.Any.fromFunction1(getFormattedTemperatureFromCelsius), getFormattedTemperatureFromFahrenheit = js.Any.fromFunction1(getFormattedTemperatureFromFahrenheit), getLanguage = js.Any.fromFunction0(getLanguage), getMonth = js.Any.fromFunction1(getMonth), getTimeFormatted = js.Any.fromFunction1(getTimeFormatted), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[LocalizationSystem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalizationSystem] (val x: Self) extends AnyVal {
    
    inline def setGetDateAndTimeFormatted(value: js.Date => String): Self = StObject.set(x, "getDateAndTimeFormatted", js.Any.fromFunction1(value))
    
    inline def setGetDateFormatted(value: js.Date => String): Self = StObject.set(x, "getDateFormatted", js.Any.fromFunction1(value))
    
    inline def setGetDateShortFormatted(value: js.Date => String): Self = StObject.set(x, "getDateShortFormatted", js.Any.fromFunction1(value))
    
    inline def setGetDayOfWeek(value: js.Date => String): Self = StObject.set(x, "getDayOfWeek", js.Any.fromFunction1(value))
    
    inline def setGetFormattedDistanceFromMeters(value: Double => String): Self = StObject.set(x, "getFormattedDistanceFromMeters", js.Any.fromFunction1(value))
    
    inline def setGetFormattedNumber(value: Double => String): Self = StObject.set(x, "getFormattedNumber", js.Any.fromFunction1(value))
    
    inline def setGetFormattedSeconds(value: Double => String): Self = StObject.set(x, "getFormattedSeconds", js.Any.fromFunction1(value))
    
    inline def setGetFormattedTemperatureFromCelsius(value: Double => String): Self = StObject.set(x, "getFormattedTemperatureFromCelsius", js.Any.fromFunction1(value))
    
    inline def setGetFormattedTemperatureFromFahrenheit(value: Double => String): Self = StObject.set(x, "getFormattedTemperatureFromFahrenheit", js.Any.fromFunction1(value))
    
    inline def setGetLanguage(value: () => String): Self = StObject.set(x, "getLanguage", js.Any.fromFunction0(value))
    
    inline def setGetMonth(value: js.Date => String): Self = StObject.set(x, "getMonth", js.Any.fromFunction1(value))
    
    inline def setGetTimeFormatted(value: js.Date => String): Self = StObject.set(x, "getTimeFormatted", js.Any.fromFunction1(value))
  }
}
