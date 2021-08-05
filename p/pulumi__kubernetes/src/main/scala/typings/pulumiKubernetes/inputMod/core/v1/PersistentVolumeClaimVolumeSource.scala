package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
  */
trait PersistentVolumeClaimVolumeSource extends StObject {
  
  /**
    * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  var claimName: Input[String]
  
  /**
    * Will force the ReadOnly setting in VolumeMounts. Default false.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}
object PersistentVolumeClaimVolumeSource {
  
  inline def apply(claimName: Input[String]): PersistentVolumeClaimVolumeSource = {
    val __obj = js.Dynamic.literal(claimName = claimName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimVolumeSource]
  }
  
  extension [Self <: PersistentVolumeClaimVolumeSource](x: Self) {
    
    inline def setClaimName(value: Input[String]): Self = StObject.set(x, "claimName", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
