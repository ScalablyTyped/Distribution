package typings.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.RDS.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRDS extends js.Object {
  
  val Signer: Instantiable0[typings.awsSdk.mod.RDS.Signer] = js.native
  
  val Types: this.type = js.native
}
object TypeofRDS {
  
  @scala.inline
  def apply(Signer: Instantiable0[Signer], Types: TypeofRDS): TypeofRDS = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofRDS]
  }
  
  @scala.inline
  implicit class TypeofRDSOps[Self <: TypeofRDS] (val x: Self) extends AnyVal {
    
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
    def setSigner(value: Instantiable0[Signer]): Self = this.set("Signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: TypeofRDS): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
