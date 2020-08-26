package typings.pulumiAws.amiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.AmiFromInstanceEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.AmiFromInstanceEphemeralBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceState extends js.Object {
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the AMI.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: js.UndefOr[Input[String]] = js.native
  val manageEbsSnapshots: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: js.UndefOr[Input[String]] = js.native
  val rootSnapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: js.UndefOr[Input[String]] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.native
}

object AmiFromInstanceState {
  @scala.inline
  def apply(): AmiFromInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiFromInstanceState]
  }
  @scala.inline
  implicit class AmiFromInstanceStateOps[Self <: AmiFromInstanceState] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: Input[String]): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("architecture", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEbsBlockDevicesVarargs(value: Input[AmiFromInstanceEbsBlockDevice]*): Self = this.set("ebsBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEbsBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]): Self = this.set("ebsBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsBlockDevices: Self = this.set("ebsBlockDevices", js.undefined)
    @scala.inline
    def setEnaSupport(value: Input[Boolean]): Self = this.set("enaSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnaSupport: Self = this.set("enaSupport", js.undefined)
    @scala.inline
    def setEphemeralBlockDevicesVarargs(value: Input[AmiFromInstanceEphemeralBlockDevice]*): Self = this.set("ephemeralBlockDevices", js.Array(value :_*))
    @scala.inline
    def setEphemeralBlockDevices(value: Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]): Self = this.set("ephemeralBlockDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEphemeralBlockDevices: Self = this.set("ephemeralBlockDevices", js.undefined)
    @scala.inline
    def setImageLocation(value: Input[String]): Self = this.set("imageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLocation: Self = this.set("imageLocation", js.undefined)
    @scala.inline
    def setKernelId(value: Input[String]): Self = this.set("kernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("kernelId", js.undefined)
    @scala.inline
    def setManageEbsSnapshots(value: Input[Boolean]): Self = this.set("manageEbsSnapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManageEbsSnapshots: Self = this.set("manageEbsSnapshots", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRamdiskId(value: Input[String]): Self = this.set("ramdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("ramdiskId", js.undefined)
    @scala.inline
    def setRootDeviceName(value: Input[String]): Self = this.set("rootDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceName: Self = this.set("rootDeviceName", js.undefined)
    @scala.inline
    def setRootSnapshotId(value: Input[String]): Self = this.set("rootSnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootSnapshotId: Self = this.set("rootSnapshotId", js.undefined)
    @scala.inline
    def setSnapshotWithoutReboot(value: Input[Boolean]): Self = this.set("snapshotWithoutReboot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotWithoutReboot: Self = this.set("snapshotWithoutReboot", js.undefined)
    @scala.inline
    def setSourceInstanceId(value: Input[String]): Self = this.set("sourceInstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceInstanceId: Self = this.set("sourceInstanceId", js.undefined)
    @scala.inline
    def setSriovNetSupport(value: Input[String]): Self = this.set("sriovNetSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("sriovNetSupport", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVirtualizationType(value: Input[String]): Self = this.set("virtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("virtualizationType", js.undefined)
  }
  
}

