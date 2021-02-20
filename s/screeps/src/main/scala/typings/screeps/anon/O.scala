package typings.screeps.anon

import typings.screeps.screepsStrings.LH
import typings.screeps.screepsStrings.LO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait O extends StObject {
  
  var H: LH = js.native
  
  var O: LO = js.native
  
  var U: typings.screeps.screepsStrings.UL = js.native
}
object O {
  
  @scala.inline
  def apply(H: LH, O: LO, U: typings.screeps.screepsStrings.UL): O = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
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
