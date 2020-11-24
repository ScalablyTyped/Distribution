package typings.screeps.anon

import typings.screeps.screepsStrings.KO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Z extends js.Object {
  
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
  implicit class ZOps[Self <: Z] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setH(value: typings.screeps.screepsStrings.KH): Self = this.set("H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: KO): Self = this.set("O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: typings.screeps.screepsStrings.ZK): Self = this.set("Z", value.asInstanceOf[js.Any])
  }
}
