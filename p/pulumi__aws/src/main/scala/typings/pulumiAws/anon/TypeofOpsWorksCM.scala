package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOpsWorksCM extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofOpsWorksCM {
  
  @scala.inline
  def apply(Types: TypeofOpsWorksCM): TypeofOpsWorksCM = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOpsWorksCM]
  }
  
  @scala.inline
  implicit class TypeofOpsWorksCMOps[Self <: TypeofOpsWorksCM] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofOpsWorksCM): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
