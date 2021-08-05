package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ephemeral volume that is handled by a normal storage driver.
  */
trait EphemeralVolumeSource extends StObject {
  
  /**
    * Specifies a read-only configuration for the volume. Defaults to false (read/write).
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Will be used to create a stand-alone PVC to provision the volume. The pod in which this EphemeralVolumeSource is embedded will be the owner of the PVC, i.e. the PVC will be deleted together with the pod.  The name of the PVC will be `<pod name>-<volume name>` where `<volume name>` is the name from the `PodSpec.Volumes` array entry. Pod validation will reject the pod if the concatenated name is not valid for a PVC (for example, too long).
    *
    * An existing PVC with that name that is not owned by the pod will *not* be used for the pod to avoid using an unrelated volume by mistake. Starting the pod is then blocked until the unrelated PVC is removed. If such a pre-created PVC is meant to be used by the pod, the PVC has to updated with an owner reference to the pod once the pod exists. Normally this should not be necessary, but it may be useful when manually reconstructing a broken cluster.
    *
    * This field is read-only and no changes will be made by Kubernetes to the PVC after it has been created.
    *
    * Required, must not be nil.
    */
  var volumeClaimTemplate: js.UndefOr[Input[PersistentVolumeClaimTemplate]] = js.undefined
}
object EphemeralVolumeSource {
  
  inline def apply(): EphemeralVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EphemeralVolumeSource]
  }
  
  extension [Self <: EphemeralVolumeSource](x: Self) {
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setVolumeClaimTemplate(value: Input[PersistentVolumeClaimTemplate]): Self = StObject.set(x, "volumeClaimTemplate", value.asInstanceOf[js.Any])
    
    inline def setVolumeClaimTemplateUndefined: Self = StObject.set(x, "volumeClaimTemplate", js.undefined)
  }
}
