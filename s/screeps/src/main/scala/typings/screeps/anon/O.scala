package typings.screeps.anon

import typings.screeps.screepsStrings.LO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait O extends StObject {
  
  var H: typings.screeps.screepsStrings.LH
  
  var O: LO
  
  var U: typings.screeps.screepsStrings.UL
}
object O {
  
  inline def apply(): O = {
    val __obj = js.Dynamic.literal(H = "LH", O = "LO", U = "UL")
    __obj.asInstanceOf[O]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: O] (val x: Self) extends AnyVal {
    
    inline def setH(value: typings.screeps.screepsStrings.LH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: LO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    inline def setU(value: typings.screeps.screepsStrings.UL): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
  }
}
