package typings.atPulumiAws.ec2AmiFromInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.AmiFromInstanceEbsBlockDevice
import typings.atPulumiAws.typesInputMod.ec2Ns.AmiFromInstanceEphemeralBlockDevice
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiFromInstanceState extends js.Object {
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: js.UndefOr[Input[String]] = js.undefined
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]]] = js.undefined
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]]] = js.undefined
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: js.UndefOr[Input[String]] = js.undefined
  val manageEbsSnapshots: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: js.UndefOr[Input[String]] = js.undefined
  val rootSnapshotId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.undefined
}

object AmiFromInstanceState {
  @scala.inline
  def apply(
    architecture: Input[String] = null,
    description: Input[String] = null,
    ebsBlockDevices: Input[js.Array[Input[AmiFromInstanceEbsBlockDevice]]] = null,
    enaSupport: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[AmiFromInstanceEphemeralBlockDevice]]] = null,
    imageLocation: Input[String] = null,
    kernelId: Input[String] = null,
    manageEbsSnapshots: Input[Boolean] = null,
    name: Input[String] = null,
    ramdiskId: Input[String] = null,
    rootDeviceName: Input[String] = null,
    rootSnapshotId: Input[String] = null,
    snapshotWithoutReboot: Input[Boolean] = null,
    sourceInstanceId: Input[String] = null,
    sriovNetSupport: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualizationType: Input[String] = null
  ): AmiFromInstanceState = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (enaSupport != null) __obj.updateDynamic("enaSupport")(enaSupport.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (imageLocation != null) __obj.updateDynamic("imageLocation")(imageLocation.asInstanceOf[js.Any])
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId.asInstanceOf[js.Any])
    if (manageEbsSnapshots != null) __obj.updateDynamic("manageEbsSnapshots")(manageEbsSnapshots.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ramdiskId != null) __obj.updateDynamic("ramdiskId")(ramdiskId.asInstanceOf[js.Any])
    if (rootDeviceName != null) __obj.updateDynamic("rootDeviceName")(rootDeviceName.asInstanceOf[js.Any])
    if (rootSnapshotId != null) __obj.updateDynamic("rootSnapshotId")(rootSnapshotId.asInstanceOf[js.Any])
    if (snapshotWithoutReboot != null) __obj.updateDynamic("snapshotWithoutReboot")(snapshotWithoutReboot.asInstanceOf[js.Any])
    if (sourceInstanceId != null) __obj.updateDynamic("sourceInstanceId")(sourceInstanceId.asInstanceOf[js.Any])
    if (sriovNetSupport != null) __obj.updateDynamic("sriovNetSupport")(sriovNetSupport.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualizationType != null) __obj.updateDynamic("virtualizationType")(virtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceState]
  }
}

