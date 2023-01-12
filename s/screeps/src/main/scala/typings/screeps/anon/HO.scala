package typings.screeps.anon

import typings.screeps.screepsStrings.GO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HO extends StObject {
  
  var H: typings.screeps.screepsStrings.GH
  
  var O: GO
}
object HO {
  
  inline def apply(): HO = {
    val __obj = js.Dynamic.literal(H = "GH", O = "GO")
    __obj.asInstanceOf[HO]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HO] (val x: Self) extends AnyVal {
    
    inline def setH(value: typings.screeps.screepsStrings.GH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    inline def setO(value: GO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
