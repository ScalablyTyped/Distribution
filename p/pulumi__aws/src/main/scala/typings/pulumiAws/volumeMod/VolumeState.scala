package typings.pulumiAws.volumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeState extends js.Object {
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The AZ where the EBS volume will exist.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The amount of IOPS to provision for the disk.
    */
  val iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN for the KMS encryption key. When specifying `kmsKeyId`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val size: js.UndefOr[Input[Double]] = js.native
  /**
    * A snapshot to base the EBS volume off of.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of EBS volume. Can be "standard", "gp2", "io1", "sc1" or "st1" (Default: "standard").
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}

object VolumeState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    availabilityZone: Input[String] = null,
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    size: Input[Double] = null,
    snapshotId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
  ): VolumeState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeState]
  }
}

