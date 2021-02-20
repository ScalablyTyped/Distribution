package typings.screeps.anon

import typings.screeps.PowerClassConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassName extends StObject {
  
  var className: PowerClassConstant = js.native
  
  var cooldown: Double = js.native
  
  var duration: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var effect: js.UndefOr[js.Array[Double]] = js.native
  
  var level: js.Array[Double] = js.native
  
  var ops: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var range: js.UndefOr[Double] = js.native
}
object ClassName {
  
  @scala.inline
  def apply(className: PowerClassConstant, cooldown: Double, level: js.Array[Double]): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  @scala.inline
  implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: PowerClassConstant): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: Double): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double | js.Array[Double]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setDurationVarargs(value: Double*): Self = StObject.set(x, "duration", js.Array(value :_*))
    
    @scala.inline
    def setEffect(value: js.Array[Double]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    @scala.inline
    def setEffectVarargs(value: Double*): Self = StObject.set(x, "effect", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: js.Array[Double]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelVarargs(value: Double*): Self = StObject.set(x, "level", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: Double | js.Array[Double]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    @scala.inline
    def setOpsVarargs(value: Double*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
