package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val accessModes: js.Array[java.lang.String]
  /**
    * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and
    * currently VolumeSnapshot is the only supported data source. If the provisioner can support
    * VolumeSnapshot data source, it will create a new volume and data will be restored to the
    * volume at the same time. If the provisioner does not support VolumeSnapshot data source,
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
  val selector: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.LabelSelector
  /**
    * Name of the StorageClass required by the claim. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  val storageClassName: java.lang.String
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is
    * implied when not included in claim spec. This is a beta feature.
    */
  val volumeMode: java.lang.String
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  val volumeName: java.lang.String
}

