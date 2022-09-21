package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayNamesOptions extends StObject {
  
  /* standard es2020.intl */
  var fallback: js.UndefOr[DisplayNamesFallback] = js.undefined
  
  /* standard es2020.intl */
  var languageDisplay: js.UndefOr[DisplayNamesLanguageDisplay] = js.undefined
  
  /* standard es2020.intl */
  var localeMatcher: js.UndefOr[RelativeTimeFormatLocaleMatcher] = js.undefined
  
  /* standard es2020.intl */
  var style: js.UndefOr[RelativeTimeFormatStyle] = js.undefined
  
  /* standard es2020.intl */
  var `type`: DisplayNamesType
}
object DisplayNamesOptions {
  
  inline def apply(`type`: DisplayNamesType): DisplayNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayNamesOptions]
  }
  
  extension [Self <: DisplayNamesOptions](x: Self) {
    
    inline def setFallback(value: DisplayNamesFallback): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setLanguageDisplay(value: DisplayNamesLanguageDisplay): Self = StObject.set(x, "languageDisplay", value.asInstanceOf[js.Any])
    
    inline def setLanguageDisplayUndefined: Self = StObject.set(x, "languageDisplay", js.undefined)
    
    inline def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: DisplayNamesType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
