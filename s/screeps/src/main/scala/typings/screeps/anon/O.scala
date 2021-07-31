package typings.screeps.anon

import typings.screeps.screepsStrings.LH
import typings.screeps.screepsStrings.LO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait O extends StObject {
  
  var H: LH
  
  var O: LO
  
  var U: typings.screeps.screepsStrings.UL
}
object O {
  
  @scala.inline
  def apply(): O = {
    val __obj = js.Dynamic.literal(H = "LH", O = "LO", U = "UL")
    __obj.asInstanceOf[O]
  }
  
  @scala.inline
  implicit class OMutableBuilder[Self <: O] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: LH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: LO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: typings.screeps.screepsStrings.UL): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
  }
}
