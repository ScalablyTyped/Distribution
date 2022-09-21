package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationOptions extends StObject {
  
  /** delay(s) between animation frames (in milliseconds), each value between 0 and 65535. (optional) */
  var delay: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /** Number of animation iterations, a value between 0 and 65535. Use 0 for infinite animation. (optional, default 0) */
  var loop: js.UndefOr[Double] = js.undefined
}
object AnimationOptions {
  
  inline def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  extension [Self <: AnimationOptions](x: Self) {
    
    inline def setDelay(value: Double | js.Array[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value*))
    
    inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
  }
}
