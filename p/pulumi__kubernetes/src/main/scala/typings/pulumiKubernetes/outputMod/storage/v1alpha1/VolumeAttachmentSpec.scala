package typings.pulumiKubernetes.outputMod.storage.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSpec is the specification of a VolumeAttachment request.
  */
@js.native
trait VolumeAttachmentSpec extends js.Object {
  
  /**
    * Attacher indicates the name of the volume driver that MUST handle this request. This is the name returned by GetPluginName().
    */
  var attacher: String = js.native
  
  /**
    * The node that the volume should be attached to.
    */
  var nodeName: String = js.native
  
  /**
    * Source represents the volume that should be attached.
    */
  var source: VolumeAttachmentSource = js.native
}
object VolumeAttachmentSpec {
  
  @scala.inline
  def apply(attacher: String, nodeName: String, source: VolumeAttachmentSource): VolumeAttachmentSpec = {
    val __obj = js.Dynamic.literal(attacher = attacher.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSpec]
  }
  
  @scala.inline
  implicit class VolumeAttachmentSpecOps[Self <: VolumeAttachmentSpec] (val x: Self) extends AnyVal {
    
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
    def setAttacher(value: String): Self = this.set("attacher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: VolumeAttachmentSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
