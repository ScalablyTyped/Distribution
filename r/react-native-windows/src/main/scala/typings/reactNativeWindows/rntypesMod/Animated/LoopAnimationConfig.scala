package typings.reactNativeWindows.rntypesMod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoopAnimationConfig extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  // default -1 for infinite
  /**
    * Defaults to `true`
    */
  var resetBeforeIteration: js.UndefOr[Boolean] = js.undefined
}
object LoopAnimationConfig {
  
  inline def apply(): LoopAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoopAnimationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoopAnimationConfig] (val x: Self) extends AnyVal {
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setResetBeforeIteration(value: Boolean): Self = StObject.set(x, "resetBeforeIteration", value.asInstanceOf[js.Any])
    
    inline def setResetBeforeIterationUndefined: Self = StObject.set(x, "resetBeforeIteration", js.undefined)
  }
}
