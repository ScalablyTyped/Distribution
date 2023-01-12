package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`4`
import typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOWN extends StObject {
  
  val DOWN: `8`
  
  val LEFT: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`
  
  val RIGHT: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`
  
  val UP: `4`
}
object DOWN {
  
  inline def apply(): DOWN = {
    val __obj = js.Dynamic.literal(DOWN = 8, LEFT = 2, RIGHT = 1, UP = 4)
    __obj.asInstanceOf[DOWN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOWN] (val x: Self) extends AnyVal {
    
    inline def setDOWN(value: `8`): Self = StObject.set(x, "DOWN", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`2`): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: typings.reactNativeGestureHandler.reactNativeGestureHandlerInts.`1`): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setUP(value: `4`): Self = StObject.set(x, "UP", value.asInstanceOf[js.Any])
  }
}
