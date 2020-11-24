package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshSpec extends js.Object {
  
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[Input[MeshSpecEgressFilter]] = js.native
}
object MeshSpec {
  
  @scala.inline
  def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  
  @scala.inline
  implicit class MeshSpecOps[Self <: MeshSpec] (val x: Self) extends AnyVal {
    
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
    def setEgressFilter(value: Input[MeshSpecEgressFilter]): Self = this.set("egressFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgressFilter: Self = this.set("egressFilter", js.undefined)
  }
}
