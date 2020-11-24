package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UL extends js.Object {
  
  var UL: typings.screeps.screepsStrings.G = js.native
}
object UL {
  
  @scala.inline
  def apply(UL: typings.screeps.screepsStrings.G): UL = {
    val __obj = js.Dynamic.literal(UL = UL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UL]
  }
  
  @scala.inline
  implicit class ULOps[Self <: UL] (val x: Self) extends AnyVal {
    
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
    def setUL(value: typings.screeps.screepsStrings.G): Self = this.set("UL", value.asInstanceOf[js.Any])
  }
}
