package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UH extends StObject {
  
  var UH: Attack
  
  var UH2O: `27`
  
  var XUH2O: `28`
}
object UH {
  
  inline def apply(UH: Attack, UH2O: `27`, XUH2O: `28`): UH = {
    val __obj = js.Dynamic.literal(UH = UH.asInstanceOf[js.Any], UH2O = UH2O.asInstanceOf[js.Any], XUH2O = XUH2O.asInstanceOf[js.Any])
    __obj.asInstanceOf[UH]
  }
  
  extension [Self <: UH](x: Self) {
    
    inline def setUH(value: Attack): Self = StObject.set(x, "UH", value.asInstanceOf[js.Any])
    
    inline def setUH2O(value: `27`): Self = StObject.set(x, "UH2O", value.asInstanceOf[js.Any])
    
    inline def setXUH2O(value: `28`): Self = StObject.set(x, "XUH2O", value.asInstanceOf[js.Any])
  }
}
