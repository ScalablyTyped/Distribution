package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with some or all of properties of `options` parameter
  * of `Intl.RelativeTimeFormat` constructor.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  */
trait RelativeTimeFormatOptions extends StObject {
  
  /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
  /* standard es2020.intl */
  var localeMatcher: js.UndefOr[RelativeTimeFormatLocaleMatcher] = js.undefined
  
  /** The format of output message. */
  /* standard es2020.intl */
  var numeric: js.UndefOr[RelativeTimeFormatNumeric] = js.undefined
  
  /** The length of the internationalized message. */
  /* standard es2020.intl */
  var style: js.UndefOr[RelativeTimeFormatStyle] = js.undefined
}
object RelativeTimeFormatOptions {
  
  inline def apply(): RelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeFormatOptions]
  }
  
  extension [Self <: RelativeTimeFormatOptions](x: Self) {
    
    inline def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setNumeric(value: RelativeTimeFormatNumeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
