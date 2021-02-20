package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
  */
@js.native
trait PersistentVolumeClaimSpec extends StObject {
  
  /**
    * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.Array[String] = js.native
  
  /**
    * This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot - Beta) * An existing PVC (PersistentVolumeClaim) * An existing custom resource/object that implements data population (Alpha) In order to use VolumeSnapshot object types, the appropriate feature gate must be enabled (VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the specified data source is not supported, the volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
    */
  var dataSource: TypedLocalObjectReference = js.native
  
  /**
    * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: ResourceRequirements = js.native
  
  /**
    * A label query over volumes to consider for binding.
    */
  var selector: LabelSelector = js.native
  
  /**
    * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: String = js.native
  
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
    */
  var volumeMode: String = js.native
  
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: String = js.native
}
object PersistentVolumeClaimSpec {
  
  @scala.inline
  def apply(
    accessModes: js.Array[String],
    dataSource: TypedLocalObjectReference,
    resources: ResourceRequirements,
    selector: LabelSelector,
    storageClassName: String,
    volumeMode: String,
    volumeName: String
  ): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal(accessModes = accessModes.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], storageClassName = storageClassName.asInstanceOf[js.Any], volumeMode = volumeMode.asInstanceOf[js.Any], volumeName = volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  
  @scala.inline
  implicit class PersistentVolumeClaimSpecMutableBuilder[Self <: PersistentVolumeClaimSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessModes(value: js.Array[String]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessModesVarargs(value: String*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: TypedLocalObjectReference): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: ResourceRequirements): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassName(value: String): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeMode(value: String): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeName(value: String): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
  }
}
