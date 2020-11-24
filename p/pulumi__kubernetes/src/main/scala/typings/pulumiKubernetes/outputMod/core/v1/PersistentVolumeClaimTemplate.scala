package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimTemplate is used to produce PersistentVolumeClaim objects as part of an EphemeralVolumeSource.
  */
@js.native
trait PersistentVolumeClaimTemplate extends js.Object {
  
  /**
    * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * The specification for the PersistentVolumeClaim. The entire content is copied unchanged into the PVC that gets created from this template. The same fields as in a PersistentVolumeClaim are also valid here.
    */
  var spec: PersistentVolumeClaimSpec = js.native
}
object PersistentVolumeClaimTemplate {
  
  @scala.inline
  def apply(metadata: ObjectMeta, spec: PersistentVolumeClaimSpec): PersistentVolumeClaimTemplate = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimTemplate]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimTemplateOps[Self <: PersistentVolumeClaimTemplate] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: PersistentVolumeClaimSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
  }
}
