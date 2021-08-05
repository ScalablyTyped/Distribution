package typings.screeps.anon

import typings.screeps.screepsStrings.UO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait L extends StObject {
  
  var H: typings.screeps.screepsStrings.UH
  
  var L: typings.screeps.screepsStrings.UL
  
  var O: UO
}
object L {
  
  inline def apply(): L = {
    val __obj = js.Dynamic.literal(H = "UH", L = "UL", O = "UO")
    __obj.asInstanceOf[L]
  }
  
  extension [Self <: L](x: Self) {
    
    inline def setH(value: typings.screeps.screepsStrings.UH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setL(value: typings.screeps.screepsStrings.UL): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    inline def setO(value: UO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
