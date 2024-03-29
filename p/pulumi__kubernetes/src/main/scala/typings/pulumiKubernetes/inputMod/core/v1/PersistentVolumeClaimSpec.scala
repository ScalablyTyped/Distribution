package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
  */
trait PersistentVolumeClaimSpec extends StObject {
  
  /**
    * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot - Beta) * An existing PVC (PersistentVolumeClaim) * An existing custom resource/object that implements data population (Alpha) In order to use VolumeSnapshot object types, the appropriate feature gate must be enabled (VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the specified data source is not supported, the volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
    */
  var dataSource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  
  /**
    * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.undefined
  
  /**
    * A label query over volumes to consider for binding.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  
  /**
    * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}
object PersistentVolumeClaimSpec {
  
  inline def apply(): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  
  extension [Self <: PersistentVolumeClaimSpec](x: Self) {
    
    inline def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    inline def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    inline def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    inline def setDataSource(value: Input[TypedLocalObjectReference]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setResources(value: Input[ResourceRequirements]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setStorageClassName(value: Input[String]): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    inline def setStorageClassNameUndefined: Self = StObject.set(x, "storageClassName", js.undefined)
    
    inline def setVolumeMode(value: Input[String]): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    inline def setVolumeModeUndefined: Self = StObject.set(x, "volumeMode", js.undefined)
    
    inline def setVolumeName(value: Input[String]): Self = StObject.set(x, "volumeName", value.asInstanceOf[js.Any])
    
    inline def setVolumeNameUndefined: Self = StObject.set(x, "volumeName", js.undefined)
  }
}
