package typings.screeps.anon

import typings.screeps.PowerClassConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: PowerClassConstant
  
  var cooldown: Double
  
  var duration: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var effect: js.UndefOr[js.Array[Double]] = js.undefined
  
  var level: js.Array[Double]
  
  var ops: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var range: js.UndefOr[Double] = js.undefined
}
object ClassName {
  
  inline def apply(className: PowerClassConstant, cooldown: Double, level: js.Array[Double]): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: PowerClassConstant): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double | js.Array[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setDurationVarargs(value: Double*): Self = StObject.set(x, "duration", js.Array(value*))
    
    inline def setEffect(value: js.Array[Double]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEffectVarargs(value: Double*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setLevel(value: js.Array[Double]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelVarargs(value: Double*): Self = StObject.set(x, "level", js.Array(value*))
    
    inline def setOps(value: Double | js.Array[Double]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    inline def setOpsVarargs(value: Double*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
