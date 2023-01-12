package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with properties reflecting the locale
  * and formatting options computed during initialization
  * of the `Intl.RelativeTimeFormat` object
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions#Description).
  */
trait ResolvedRelativeTimeFormatOptions extends StObject {
  
  /* standard es2020.intl */
  var locale: UnicodeBCP47LocaleIdentifier
  
  /* standard es2020.intl */
  var numberingSystem: String
  
  /* standard es2020.intl */
  var numeric: RelativeTimeFormatNumeric
  
  /* standard es2020.intl */
  var style: RelativeTimeFormatStyle
}
object ResolvedRelativeTimeFormatOptions {
  
  inline def apply(
    locale: UnicodeBCP47LocaleIdentifier,
    numberingSystem: String,
    numeric: RelativeTimeFormatNumeric,
    style: RelativeTimeFormatStyle
  ): ResolvedRelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedRelativeTimeFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedRelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: UnicodeBCP47LocaleIdentifier): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumeric(value: RelativeTimeFormatNumeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
