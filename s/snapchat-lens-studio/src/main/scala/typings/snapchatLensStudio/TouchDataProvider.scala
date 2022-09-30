package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This provider is returned by global.touchSystem and allows your lens to handle any touches on the screen, and optionally let certain touch types to pass through (let Snapchat handle the
  * touch).
  */
trait TouchDataProvider
  extends StObject
     with ScriptObject {
  
  /** Returns a copy of currentMask with the newException flag set to true. */
  def composeTouchBlockingExceptionMask(currentMask: Double, newException: TouchTypeException): Double
  
  /** Allow or stop allowing a certain TouchType to pass through your lens. Useful for allowing Snapchat to handle certain TouchType, e.g. allowing TouchTypeDoubleTap to flip the camera. */
  def enableTouchBlockingException(exception: TouchTypeException, enable: Boolean): Unit
  
  /**
    * Set your lens to handle touches on the screen, preventing default Snapchat touch behavior from occuring. Useful for enabling full screen touches without any touch components. It is similar to
    * creating a plane the size of the screen in front of the camera.
    */
  var touchBlocking: Boolean
  
  /** The current touch mask. */
  var touchBlockingExceptionMask: Double
}
object TouchDataProvider {
  
  inline def apply(
    composeTouchBlockingExceptionMask: (Double, TouchTypeException) => Double,
    enableTouchBlockingException: (TouchTypeException, Boolean) => Unit,
    getTypeName: () => String,
    isOfType: String => Boolean,
    touchBlocking: Boolean,
    touchBlockingExceptionMask: Double
  ): TouchDataProvider = {
    val __obj = js.Dynamic.literal(composeTouchBlockingExceptionMask = js.Any.fromFunction2(composeTouchBlockingExceptionMask), enableTouchBlockingException = js.Any.fromFunction2(enableTouchBlockingException), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), touchBlocking = touchBlocking.asInstanceOf[js.Any], touchBlockingExceptionMask = touchBlockingExceptionMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchDataProvider]
  }
  
  extension [Self <: TouchDataProvider](x: Self) {
    
    inline def setComposeTouchBlockingExceptionMask(value: (Double, TouchTypeException) => Double): Self = StObject.set(x, "composeTouchBlockingExceptionMask", js.Any.fromFunction2(value))
    
    inline def setEnableTouchBlockingException(value: (TouchTypeException, Boolean) => Unit): Self = StObject.set(x, "enableTouchBlockingException", js.Any.fromFunction2(value))
    
    inline def setTouchBlocking(value: Boolean): Self = StObject.set(x, "touchBlocking", value.asInstanceOf[js.Any])
    
    inline def setTouchBlockingExceptionMask(value: Double): Self = StObject.set(x, "touchBlockingExceptionMask", value.asInstanceOf[js.Any])
  }
}
