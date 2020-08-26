package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
  */
@js.native
trait PersistentVolumeClaimSpec extends js.Object {
  /**
    * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot - Beta) * An existing PVC (PersistentVolumeClaim) * An existing custom resource/object that implements data population (Alpha) In order to use VolumeSnapshot object types, the appropriate feature gate must be enabled (VolumeSnapshotDataSource or AnyVolumeDataSource) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the specified data source is not supported, the volume will not be created and the failure will be reported as an event. In the future, we plan to support more data source types and the behavior of the provisioner may change.
    */
  var dataSource: js.UndefOr[Input[TypedLocalObjectReference]] = js.native
  /**
    * Resources represents the minimum resources the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
    */
  var resources: js.UndefOr[Input[ResourceRequirements]] = js.native
  /**
    * A label query over volumes to consider for binding.
    */
  var selector: js.UndefOr[Input[LabelSelector]] = js.native
  /**
    * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
    */
  var storageClassName: js.UndefOr[Input[String]] = js.native
  /**
    * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.native
  /**
    * VolumeName is the binding reference to the PersistentVolume backing this claim.
    */
  var volumeName: js.UndefOr[Input[String]] = js.native
}

object PersistentVolumeClaimSpec {
  @scala.inline
  def apply(): PersistentVolumeClaimSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeClaimSpec]
  }
  @scala.inline
  implicit class PersistentVolumeClaimSpecOps[Self <: PersistentVolumeClaimSpec] (val x: Self) extends AnyVal {
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
    def setAccessModesVarargs(value: Input[String]*): Self = this.set("accessModes", js.Array(value :_*))
    @scala.inline
    def setAccessModes(value: Input[js.Array[Input[String]]]): Self = this.set("accessModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessModes: Self = this.set("accessModes", js.undefined)
    @scala.inline
    def setDataSource(value: Input[TypedLocalObjectReference]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setResources(value: Input[ResourceRequirements]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setSelector(value: Input[LabelSelector]): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStorageClassName(value: Input[String]): Self = this.set("storageClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClassName: Self = this.set("storageClassName", js.undefined)
    @scala.inline
    def setVolumeMode(value: Input[String]): Self = this.set("volumeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeMode: Self = this.set("volumeMode", js.undefined)
    @scala.inline
    def setVolumeName(value: Input[String]): Self = this.set("volumeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeName: Self = this.set("volumeName", js.undefined)
  }
  
}

