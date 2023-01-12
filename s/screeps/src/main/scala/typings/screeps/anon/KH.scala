package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KH extends StObject {
  
  var KH: Capacity
  
  var KH2O: `29`
  
  var XKH2O: `30`
}
object KH {
  
  inline def apply(KH: Capacity, KH2O: `29`, XKH2O: `30`): KH = {
    val __obj = js.Dynamic.literal(KH = KH.asInstanceOf[js.Any], KH2O = KH2O.asInstanceOf[js.Any], XKH2O = XKH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[KH]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KH] (val x: Self) extends AnyVal {
    
    inline def setKH(value: Capacity): Self = StObject.set(x, "KH", value.asInstanceOf[js.Any])
    
    inline def setKH2O(value: `29`): Self = StObject.set(x, "KH2O", value.asInstanceOf[js.Any])
    
    inline def setXKH2O(value: `30`): Self = StObject.set(x, "XKH2O", value.asInstanceOf[js.Any])
  }
}
