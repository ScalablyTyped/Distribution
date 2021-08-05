package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoLeftAndRightSwapInRTL extends StObject {
  
  var doLeftAndRightSwapInRTL: Boolean
  
  var isRTL: Boolean
}
object DoLeftAndRightSwapInRTL {
  
  inline def apply(doLeftAndRightSwapInRTL: Boolean, isRTL: Boolean): DoLeftAndRightSwapInRTL = {
    val __obj = js.Dynamic.literal(doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoLeftAndRightSwapInRTL]
  }
  
  extension [Self <: DoLeftAndRightSwapInRTL](x: Self) {
    
    inline def setDoLeftAndRightSwapInRTL(value: Boolean): Self = StObject.set(x, "doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
  }
}
