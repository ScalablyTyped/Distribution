package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HO extends StObject {
  
  var H: typings.screeps.screepsStrings.GH = js.native
  
  var O: typings.screeps.screepsStrings.GO = js.native
}
object HO {
  
  @scala.inline
  def apply(H: typings.screeps.screepsStrings.GH, O: typings.screeps.screepsStrings.GO): HO = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[HO]
  }
  
  @scala.inline
  implicit class HOMutableBuilder[Self <: HO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: typings.screeps.screepsStrings.GH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: typings.screeps.screepsStrings.GO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
