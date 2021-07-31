package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with some or all of properties of `options` parameter
  * of `Intl.RelativeTimeFormat` constructor.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  *
  * [Specification](https://tc39.es/ecma402/#sec-InitializeRelativeTimeFormat).
  */
trait RelativeTimeFormatOptions extends StObject {
  
  var localeMatcher: js.UndefOr[RelativeTimeFormatLocaleMatcher] = js.undefined
  
  var numeric: js.UndefOr[RelativeTimeFormatNumeric] = js.undefined
  
  var style: js.UndefOr[RelativeTimeFormatStyle] = js.undefined
}
object RelativeTimeFormatOptions {
  
  @scala.inline
  def apply(): RelativeTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeFormatOptions]
  }
  
  @scala.inline
  implicit class RelativeTimeFormatOptionsMutableBuilder[Self <: RelativeTimeFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocaleMatcher(value: RelativeTimeFormatLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setNumeric(value: RelativeTimeFormatNumeric): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setStyle(value: RelativeTimeFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
