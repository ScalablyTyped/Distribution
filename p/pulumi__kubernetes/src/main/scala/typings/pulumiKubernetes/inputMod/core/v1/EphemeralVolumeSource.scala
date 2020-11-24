package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ephemeral volume that is handled by a normal storage driver.
  */
@js.native
trait EphemeralVolumeSource extends js.Object {
  
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be `<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).
    *
    * An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.
    *
    * This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.
    *
    * Required, must not be nil.
    */
  var volumeClaimTemplate: js.UndefOr[Input[PersistentVolumeClaimTemplate]] = js.native
}
object EphemeralVolumeSource {
  
  @scala.inline
  def apply(): EphemeralVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemeralVolumeSource]
  }
  
  @scala.inline
  implicit class EphemeralVolumeSourceOps[Self <: EphemeralVolumeSource] (val x: Self) extends AnyVal {
    
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
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setVolumeClaimTemplate(value: Input[PersistentVolumeClaimTemplate]): Self = this.set("volumeClaimTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeClaimTemplate: Self = this.set("volumeClaimTemplate", js.undefined)
  }
}
