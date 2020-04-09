package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a
  * Source for provider-specific attributes
  */
trait PersistentVolumeClaimSpec extends js.Object {
  /**
    * AccessModes contains the desired access modes the volume should have. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  val accessModes: js.Array[String]
  /**
    * This field can be used to specify either: * An existing VolumeSnapshot object
    * (snapshot.storage.k8s.io/VolumeSnapshot - Beta) * An existing PVC (PersistentVolumeClaim) *
    * An existing custom resource/object that implements data population (Alpha) In order to use
    * VolumeSnapshot object types, the appropriate feature gate must be enabled
    * (VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external
    * controller can support the specified data source, it will create a new volume based on the
    * contents of the specified data source. If the specified data source is not supported, the
    * volume will not be created and the failure will be reported as an event. In the future, we
    * plan to support more data source types and the behavior of the provisioner may change.
    */
  val dataSource: TypedLocalObjectReference
  /**
    * Resources represents the minimum resources the volume should have. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  val resources: ResourceRequirements
  /**
    * A label query over volumes to consider for binding.
    */
  val selector: LabelSelector
  /**
    * Name of the StorageClass required by the claim. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  val storageClassName: String
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is
    * implied when not included in claim spec.
    */
  val volumeMode: String
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  val volumeName: String
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
}

