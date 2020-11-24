package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
  */
@js.native
trait VolumeNodeAffinity extends js.Object {
  
  /**
    * Required specifies hard node constraints that must be met.
    */
  var required: NodeSelector = js.native
}
object VolumeNodeAffinity {
  
  @scala.inline
  def apply(required: NodeSelector): VolumeNodeAffinity = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeNodeAffinity]
  }
  
  @scala.inline
  implicit class VolumeNodeAffinityOps[Self <: VolumeNodeAffinity] (val x: Self) extends AnyVal {
    
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
    def setRequired(value: NodeSelector): Self = this.set("required", value.asInstanceOf[js.Any])
  }
}
