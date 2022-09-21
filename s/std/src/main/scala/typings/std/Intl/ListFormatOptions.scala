package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with some or all properties of the `Intl.ListFormat` constructor `options` parameter.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters).
  */
trait ListFormatOptions extends StObject {
  
  /** The locale matching algorithm to use. For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation). */
  /* standard es2021.intl */
  var localeMatcher: js.UndefOr[ListFormatLocaleMatcher] = js.undefined
  
  /** The length of the internationalized message. */
  /* standard es2021.intl */
  var style: js.UndefOr[ListFormatStyle] = js.undefined
  
  /** The format of output message. */
  /* standard es2021.intl */
  var `type`: js.UndefOr[ListFormatType] = js.undefined
}
object ListFormatOptions {
  
  inline def apply(): ListFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFormatOptions]
  }
  
  extension [Self <: ListFormatOptions](x: Self) {
    
    inline def setLocaleMatcher(value: ListFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: ListFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: ListFormatType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
