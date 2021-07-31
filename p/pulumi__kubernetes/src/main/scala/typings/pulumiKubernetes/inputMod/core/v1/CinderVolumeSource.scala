package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cinder volume resource in Openstack. A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
  */
trait CinderVolumeSource extends StObject {
  
  /**
    * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var fsType: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Optional: points to a secret object containing parameters used to connect to OpenStack.
    */
  var secretRef: js.UndefOr[Input[LocalObjectReference]] = js.undefined
  
  /**
    * volume id used to identify the volume in cinder. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var volumeID: Input[String]
}
object CinderVolumeSource {
  
  @scala.inline
  def apply(volumeID: Input[String]): CinderVolumeSource = {
    val __obj = js.Dynamic.literal(volumeID = volumeID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CinderVolumeSource]
  }
  
  @scala.inline
  implicit class CinderVolumeSourceMutableBuilder[Self <: CinderVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFsType(value: Input[String]): Self = StObject.set(x, "fsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsTypeUndefined: Self = StObject.set(x, "fsType", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSecretRef(value: Input[LocalObjectReference]): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
    
    @scala.inline
    def setVolumeID(value: Input[String]): Self = StObject.set(x, "volumeID", value.asInstanceOf[js.Any])
  }
}
