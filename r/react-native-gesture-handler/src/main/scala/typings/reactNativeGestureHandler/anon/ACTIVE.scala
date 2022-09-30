package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`0`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`3`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ACTIVE extends StObject {
  
  val ACTIVE: `4`
  
  val BEGAN: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
  
  val CANCELLED: `3`
  
  val END: `5`
  
  val FAILED: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
  
  val UNDETERMINED: `0`
}
object ACTIVE {
  
  inline def apply(): ACTIVE = {
    val __obj = js.Dynamic.literal(ACTIVE = 4, BEGAN = 2, CANCELLED = 3, END = 5, FAILED = 1, UNDETERMINED = 0)
    __obj.asInstanceOf[ACTIVE]
  }
  
  extension [Self <: ACTIVE](x: Self) {
    
    inline def setACTIVE(value: `4`): Self = StObject.set(x, "ACTIVE", value.asInstanceOf[js.Any])
    
    inline def setBEGAN(value: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`): Self = StObject.set(x, "BEGAN", value.asInstanceOf[js.Any])
    
    inline def setCANCELLED(value: `3`): Self = StObject.set(x, "CANCELLED", value.asInstanceOf[js.Any])
    
    inline def setEND(value: `5`): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
    
    inline def setFAILED(value: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`): Self = StObject.set(x, "FAILED", value.asInstanceOf[js.Any])
    
    inline def setUNDETERMINED(value: `0`): Self = StObject.set(x, "UNDETERMINED", value.asInstanceOf[js.Any])
  }
}
