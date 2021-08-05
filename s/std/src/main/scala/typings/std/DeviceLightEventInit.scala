package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceLightEventInit
  extends StObject
     with EventInit {
  
  var value: js.UndefOr[Double] = js.undefined
}
object DeviceLightEventInit {
  
  inline def apply(): DeviceLightEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceLightEventInit]
  }
  
  extension [Self <: DeviceLightEventInit](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
