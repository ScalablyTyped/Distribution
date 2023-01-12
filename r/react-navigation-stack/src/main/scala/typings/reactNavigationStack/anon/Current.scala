package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  /**
    * Progress value of the current screen.
    */
  var current: AnimatedInterpolation[Double | String]
  
  /**
    * Progress value for the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnimatedInterpolation[Double | String]] = js.undefined
  
  /**
    * Progress value for the screen before this one in the stack.
    * This can be `undefined` in case the screen animating is the first one.
    */
  var previous: js.UndefOr[AnimatedInterpolation[Double | String]] = js.undefined
}
object Current {
  
  inline def apply(current: AnimatedInterpolation[Double | String]): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setNext(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: AnimatedInterpolation[Double | String]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
