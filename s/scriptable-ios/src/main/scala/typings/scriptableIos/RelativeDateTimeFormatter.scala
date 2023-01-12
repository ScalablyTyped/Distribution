package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Creates a textual representation of the amount of time between two dates._
  *
  * The formatter creates a textual representation of the time between two points in time.
  * @see https://docs.scriptable.app/relativedatetimeformatter/#-new-relativedatetimeformatter
  */
trait RelativeDateTimeFormatter extends StObject {
  
  /**
    * _Locale to use when formatting._
    *
    * The locale should be specified using a string identifier, e.g. "en", "it" or "da". When no locale is set, the formatter will use the current locale of the device.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#locale
    */
  var locale: String
  
  /**
    * _Creates a localized string communicating the amount of time between two dates._
    *
    * Creates a localized textual representation of the amount of time between to dates. If the two dates are the same, the function will return "now". If the reference date is
    * yesterday, the function will return "yesterday". Other examples include "in 10 seconds", "2 hours ago", "last week" and "next year".
    * @param date - The date to create a relative date and time for.
    * @param referenceDate - The reference date that `date` is relative to.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-string
    */
  def string(date: js.Date, referenceDate: js.Date): String
  
  /**
    * _Prefers named dates and times._
    *
    * When using the named style, the formatter tries to find a suitable textual representation over a numeric value for the relative time, e.g. "now" instead of "in 0 seconds" and
    * "yesterday" instead of "1 day ago".
    *
    * When no named representation is found the formatter will fallback to using the numeric style.
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-usenameddatetimestyle
    */
  def useNamedDateTimeStyle(): Unit
  
  /**
    * _Prefers numeric dates and times._
    *
    * When using the numeric style, the formatter will always prefer numeric representations over named representations. E.g. it will return "in 0 seconds" instead of "now" and "1 day
    * ago" instead of "yesteday".
    * @see https://docs.scriptable.app/relativedatetimeformatter/#-usenumericdatetimestyle
    */
  def useNumericDateTimeStyle(): Unit
}
object RelativeDateTimeFormatter {
  
  inline def apply(
    locale: String,
    string: (js.Date, js.Date) => String,
    useNamedDateTimeStyle: () => Unit,
    useNumericDateTimeStyle: () => Unit
  ): RelativeDateTimeFormatter = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], string = js.Any.fromFunction2(string), useNamedDateTimeStyle = js.Any.fromFunction0(useNamedDateTimeStyle), useNumericDateTimeStyle = js.Any.fromFunction0(useNumericDateTimeStyle))
    __obj.asInstanceOf[RelativeDateTimeFormatter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeDateTimeFormatter] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setString(value: (js.Date, js.Date) => String): Self = StObject.set(x, "string", js.Any.fromFunction2(value))
    
    inline def setUseNamedDateTimeStyle(value: () => Unit): Self = StObject.set(x, "useNamedDateTimeStyle", js.Any.fromFunction0(value))
    
    inline def setUseNumericDateTimeStyle(value: () => Unit): Self = StObject.set(x, "useNumericDateTimeStyle", js.Any.fromFunction0(value))
  }
}
