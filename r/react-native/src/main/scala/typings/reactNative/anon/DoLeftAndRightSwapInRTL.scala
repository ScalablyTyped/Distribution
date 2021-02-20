package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoLeftAndRightSwapInRTL extends StObject {
  
  var doLeftAndRightSwapInRTL: Boolean = js.native
  
  var isRTL: Boolean = js.native
}
object DoLeftAndRightSwapInRTL {
  
  @scala.inline
  def apply(doLeftAndRightSwapInRTL: Boolean, isRTL: Boolean): DoLeftAndRightSwapInRTL = {
    val __obj = js.Dynamic.literal(doLeftAndRightSwapInRTL = doLeftAndRightSwapInRTL.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoLeftAndRightSwapInRTL]
  }
  
  @scala.inline
  implicit class DoLeftAndRightSwapInRTLMutableBuilder[Self <: DoLeftAndRightSwapInRTL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoLeftAndRightSwapInRTL(value: Boolean): Self = StObject.set(x, "doLeftAndRightSwapInRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
  }
}
