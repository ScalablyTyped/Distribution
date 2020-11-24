package typings.pulumiKubernetes.outputMod.storage.v1beta1

import typings.pulumiKubernetes.outputMod.core.v1.PersistentVolumeSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VolumeAttachmentSource represents a volume that should be attached. Right now only PersistenVolumes can be attached via external attacher, in future we may allow also inline volumes in pods. Exactly one member can be set.
  */
@js.native
trait VolumeAttachmentSource extends js.Object {
  
  /**
    * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is alpha-level and is only honored by servers that enabled the CSIMigration feature.
    */
  var inlineVolumeSpec: PersistentVolumeSpec = js.native
  
  /**
    * Name of the persistent volume to attach.
    */
  var persistentVolumeName: String = js.native
}
object VolumeAttachmentSource {
  
  @scala.inline
  def apply(inlineVolumeSpec: PersistentVolumeSpec, persistentVolumeName: String): VolumeAttachmentSource = {
    val __obj = js.Dynamic.literal(inlineVolumeSpec = inlineVolumeSpec.asInstanceOf[js.Any], persistentVolumeName = persistentVolumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeAttachmentSource]
  }
  
  @scala.inline
  implicit class VolumeAttachmentSourceOps[Self <: VolumeAttachmentSource] (val x: Self) extends AnyVal {
    
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
    def setInlineVolumeSpec(value: PersistentVolumeSpec): Self = this.set("inlineVolumeSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentVolumeName(value: String): Self = this.set("persistentVolumeName", value.asInstanceOf[js.Any])
  }
}
