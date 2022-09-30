package typings.reactNativeWindows.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoLeftAndRightSwapInRTL extends StObject {
  
  var doLeftAndRightSwapInRTL: Boolean
  
  var isRTL: Boolean
  
  var localeIdentifier: js.UndefOr[String | Null] = js.undefined
}
object DoLeftAndRightSwapInRTL {
  
  inline def apply(doLeftAndRightSwapInRTL: Boolean, isRTL: Boolean): DoLeftAndRightSwapInRTL = {
    val __obj = js.Dynamic.literal(doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoLeftAndRightSwapInRTL]
  }
  
  extension [Self <: DoLeftAndRightSwapInRTL](x: Self) {
    
    inline def setDoLeftAndRightSwapInRTL(value: Boolean): Self = StObject.set(x, "doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdentifier(value: String): Self = StObject.set(x, "localeIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdentifierNull: Self = StObject.set(x, "localeIdentifier", null)
    
    inline def setLocaleIdentifierUndefined: Self = StObject.set(x, "localeIdentifier", js.undefined)
  }
}
