package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HO extends StObject {
  
  var H: typings.screeps.screepsStrings.GH
  
  var O: typings.screeps.screepsStrings.GO
}
object HO {
  
  inline def apply(): HO = {
    val __obj = js.Dynamic.literal(H = "GH", O = "GO")
    __obj.asInstanceOf[HO]
  }
  
  extension [Self <: HO](x: Self) {
    
    inline def setH(value: typings.screeps.screepsStrings.GH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: typings.screeps.screepsStrings.GO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
