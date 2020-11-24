package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelCapabilities extends js.Object {
  
  var add: js.UndefOr[js.Array[KernelCapability]] = js.native
  
  var drop: js.UndefOr[js.Array[KernelCapability]] = js.native
}
object KernelCapabilities {
  
  @scala.inline
  def apply(): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelCapabilities]
  }
  
  @scala.inline
  implicit class KernelCapabilitiesOps[Self <: KernelCapabilities] (val x: Self) extends AnyVal {
    
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
    def setAddVarargs(value: KernelCapability*): Self = this.set("add", js.Array(value :_*))
    
    @scala.inline
    def setAdd(value: js.Array[KernelCapability]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: KernelCapability*): Self = this.set("drop", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: js.Array[KernelCapability]): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
  }
}
