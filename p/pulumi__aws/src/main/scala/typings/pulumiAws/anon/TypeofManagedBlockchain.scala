package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofManagedBlockchain extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofManagedBlockchain {
  
  @scala.inline
  def apply(Types: TypeofManagedBlockchain): TypeofManagedBlockchain = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofManagedBlockchain]
  }
  
  @scala.inline
  implicit class TypeofManagedBlockchainOps[Self <: TypeofManagedBlockchain] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofManagedBlockchain): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
