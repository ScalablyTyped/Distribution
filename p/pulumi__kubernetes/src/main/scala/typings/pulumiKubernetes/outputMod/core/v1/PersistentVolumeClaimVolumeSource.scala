package typings.pulumiKubernetes.outputMod.core.v1

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
  var claimName: String
  
  /**
    * Will force the ReadOnly setting in VolumeMounts. Default false.
    */
  var readOnly: Boolean
}
object PersistentVolumeClaimVolumeSource {
  
  @scala.inline
  def apply(claimName: String, readOnly: Boolean): PersistentVolumeClaimVolumeSource = {
    val __obj = js.Dynamic.literal(claimName = claimName.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimVolumeSource]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimVolumeSourceMutableBuilder[Self <: PersistentVolumeClaimVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimName(value: String): Self = StObject.set(x, "claimName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
