package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatteryParams extends StObject {
  
  var size: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object BatteryParams {
  
  inline def apply(): BatteryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatteryParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatteryParams] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
