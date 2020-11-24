package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMarketplaceEntitlem extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofMarketplaceEntitlem {
  
  @scala.inline
  def apply(Types: TypeofMarketplaceEntitlem): TypeofMarketplaceEntitlem = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMarketplaceEntitlem]
  }
  
  @scala.inline
  implicit class TypeofMarketplaceEntitlemOps[Self <: TypeofMarketplaceEntitlem] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofMarketplaceEntitlem): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
