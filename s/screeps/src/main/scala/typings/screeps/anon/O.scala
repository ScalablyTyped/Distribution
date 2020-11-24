package typings.screeps.anon

import typings.screeps.screepsStrings.LH
import typings.screeps.screepsStrings.LO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait O extends js.Object {
  
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
  implicit class OOps[Self <: O] (val x: Self) extends AnyVal {
    
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
    def setH(value: LH): Self = this.set("H", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: LO): Self = this.set("O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU(value: typings.screeps.screepsStrings.UL): Self = this.set("U", value.asInstanceOf[js.Any])
  }
}
