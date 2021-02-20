package typings.screeps.anon

import typings.screeps.screepsStrings.UO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait L extends StObject {
  
  var H: typings.screeps.screepsStrings.UH = js.native
  
  var L: typings.screeps.screepsStrings.UL = js.native
  
  var O: UO = js.native
}
object L {
  
  @scala.inline
  def apply(H: typings.screeps.screepsStrings.UH, L: typings.screeps.screepsStrings.UL, O: UO): L = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit class LMutableBuilder[Self <: L] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: typings.screeps.screepsStrings.UH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: typings.screeps.screepsStrings.UL): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: UO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
