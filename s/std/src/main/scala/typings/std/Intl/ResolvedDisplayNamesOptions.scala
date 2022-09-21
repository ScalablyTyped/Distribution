package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedDisplayNamesOptions extends StObject {
  
  /* standard es2020.intl */
  var fallback: DisplayNamesFallback
  
  /* standard es2020.intl */
  var languageDisplay: js.UndefOr[DisplayNamesLanguageDisplay] = js.undefined
  
  /* standard es2020.intl */
  var locale: UnicodeBCP47LocaleIdentifier
  
  /* standard es2020.intl */
  var style: RelativeTimeFormatStyle
  
  /* standard es2020.intl */
  var `type`: DisplayNamesType
}
object ResolvedDisplayNamesOptions {
  
  inline def apply(
    fallback: DisplayNamesFallback,
    locale: UnicodeBCP47LocaleIdentifier,
    style: RelativeTimeFormatStyle,
    `type`: DisplayNamesType
  ): ResolvedDisplayNamesOptions = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedDisplayNamesOptions]
  }
  
  extension [Self <: ResolvedDisplayNamesOptions](x: Self) {
    
    inline def setFallback(value: DisplayNamesFallback): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setLanguageDisplay(value: DisplayNamesLanguageDisplay): Self = StObject.set(x, "languageDisplay", value.asInstanceOf[js.Any])
    
    inline def setLanguageDisplayUndefined: Self = StObject.set(x, "languageDisplay", js.undefined)
    
    inline def setLocale(value: UnicodeBCP47LocaleIdentifier): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setType(value: DisplayNamesType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
