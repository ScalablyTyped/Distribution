package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoopMod {
  
  @JSImport("@react-md/utils/types/loop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loop(param0: LoopOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("loop")(param0.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait LoopOptions extends StObject {
    
    /**
      * Boolean if the `value` should be incremented or decremented by `1`.
      */
    var increment: Boolean
    
    /**
      * The max number that can be used before looping to the `min` value.
      */
    var max: Double
    
    /**
      * An optional `min` value that can be used before looping to the `max` value.
      *
      * @defaultValue `0`
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the looping should be ignored and only the `min`/`max` options
      * should be respected. In other words, the looping  behavior will be disabled
      * and the `value` must be: `min >= value <= max`
      */
    var minmax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current value that should be modified.
      */
    var value: Double
  }
  object LoopOptions {
    
    inline def apply(increment: Boolean, max: Double, value: Double): LoopOptions = {
      val __obj = js.Dynamic.literal(increment = increment.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoopOptions]
    }
    
    extension [Self <: LoopOptions](x: Self) {
      
      inline def setIncrement(value: Boolean): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinmax(value: Boolean): Self = StObject.set(x, "minmax", value.asInstanceOf[js.Any])
      
      inline def setMinmaxUndefined: Self = StObject.set(x, "minmax", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
