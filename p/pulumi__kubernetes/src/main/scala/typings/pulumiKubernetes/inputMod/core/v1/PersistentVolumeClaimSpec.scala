package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
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
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * This field requires the VolumeSnapshotDataSource alpha feature gate to be enabled and
    * currently VolumeSnapshot is the only supported data source. If the provisioner can support
    * VolumeSnapshot data source, it will create a new volume and data will be restored to the
    * volume at the same time. If the provisioner does not support VolumeSnapshot data source,
    * volume will not be created and the failure will be reported as an event. In the future, we
    * plan to support more data source types and the behavior of the provisioner may change.
    */
  var dataSource: js.UndefOr[Input[TypedLocalObjectReference]] = js.undefined
  /**
    * Resources represents the minimum resources the volume should have. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.undefined
  /**
    * A label query over volumes to consider for binding.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
  /**
    * Name of the StorageClass required by the claim. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: js.UndefOr[Input[String]] = js.undefined
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is
    * implied when not included in claim spec. This is a beta feature.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.undefined
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: js.UndefOr[Input[String]] = js.undefined
}

object PersistentVolumeClaimSpec {
  @scala.inline
  def apply(
    accessModes: Input[js.Array[Input[String]]] = null,
    dataSource: Input[TypedLocalObjectReference] = null,
    resources: Input[ResourceRequirements] = null,
    selector: Input[LabelSelector] = null,
    storageClassName: Input[String] = null,
    volumeMode: Input[String] = null,
    volumeName: Input[String] = null
  ): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal()
    if (accessModes != null) __obj.updateDynamic("accessModes")(accessModes.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (storageClassName != null) __obj.updateDynamic("storageClassName")(storageClassName.asInstanceOf[js.Any])
    if (volumeMode != null) __obj.updateDynamic("volumeMode")(volumeMode.asInstanceOf[js.Any])
    if (volumeName != null) __obj.updateDynamic("volumeName")(volumeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
}

