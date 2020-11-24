package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAlexaForBusiness extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofAlexaForBusiness {
  
  @scala.inline
  def apply(Types: TypeofAlexaForBusiness): TypeofAlexaForBusiness = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAlexaForBusiness]
  }
  
  @scala.inline
  implicit class TypeofAlexaForBusinessOps[Self <: TypeofAlexaForBusiness] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofAlexaForBusiness): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
