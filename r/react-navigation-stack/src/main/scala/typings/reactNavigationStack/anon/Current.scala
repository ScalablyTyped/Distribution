package typings.reactNavigationStack.anon

import typings.reactNative.mod.Animated.AnimatedInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends StObject {
  
  /**
    * Progress value of the current screen.
    */
  var current: AnimatedInterpolation = js.native
  
  /**
    * Progress value for the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnimatedInterpolation] = js.native
  
  /**
    * Progress value for the screen before this one in the stack.
    * This can be `undefined` in case the screen animating is the first one.
    */
  var previous: js.UndefOr[AnimatedInterpolation] = js.native
}
object Current {
  
  @scala.inline
  def apply(current: AnimatedInterpolation): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: AnimatedInterpolation): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: AnimatedInterpolation): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setPrevious(value: AnimatedInterpolation): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
  }
}
