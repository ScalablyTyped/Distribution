package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KH extends StObject {
  
  var KH: Capacity
  
  var KH2O: `8`
  
  var XKH2O: `9`
}
object KH {
  
  inline def apply(KH: Capacity, KH2O: `8`, XKH2O: `9`): KH = {
    val __obj = js.Dynamic.literal(KH = KH.asInstanceOf[js.Any], KH2O = KH2O.asInstanceOf[js.Any], XKH2O = XKH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[KH]
  }
  
  extension [Self <: KH](x: Self) {
    
    inline def setKH(value: Capacity): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
    
    inline def setKH2O(value: `8`): Self = StObject.set(x, "KH2O", value.asInstanceOf[js.Any])
    
    inline def setXKH2O(value: `9`): Self = StObject.set(x, "XKH2O", value.asInstanceOf[js.Any])
  }
}
