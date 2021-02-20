package typings.screeps.anon

import typings.screeps.screepsStrings.KO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Z extends StObject {
  
  var H: typings.screeps.screepsStrings.KH = js.native
  
  var O: KO = js.native
  
  var Z: typings.screeps.screepsStrings.ZK = js.native
}
object Z {
  
  @scala.inline
  def apply(H: typings.screeps.screepsStrings.KH, O: KO, Z: typings.screeps.screepsStrings.ZK): Z = {
    val __obj = js.Dynamic.literal(H = H.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Z]
  }
  
  @scala.inline
  implicit class ZMutableBuilder[Self <: Z] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setH(value: typings.screeps.screepsStrings.KH): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: KO): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: typings.screeps.screepsStrings.ZK): Self = StObject.set(x, "Z", value.asInstanceOf[js.Any])
  }
}
