package typings.atPulumiAws.ebsVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeArgs extends js.Object {
  /**
    * The AZ where the EBS volume will exist.
    */
  val availabilityZone: Input[String]
  /**
    * If true, the disk will be encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The amount of IOPS to provision for the disk.
    */
  val iops: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The size of the drive in GiBs.
    */
  val size: js.UndefOr[Input[Double]] = js.undefined
  /**
    * A snapshot to base the EBS volume off of.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The type of EBS volume. Can be "standard", "gp2", "io1", "sc1" or "st1" (Default: "standard").
    */
  val `type`: js.UndefOr[Input[String]] = js.undefined
}

object VolumeArgs {
  @scala.inline
  def apply(
    availabilityZone: Input[String],
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    size: Input[Double] = null,
    snapshotId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null
  ): VolumeArgs = {
    val __obj = js.Dynamic.literal(availabilityZone = availabilityZone.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeArgs]
  }
}

