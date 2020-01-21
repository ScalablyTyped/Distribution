package typings.pulumiAws.cachesIscsiVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachesIscsiVolumeState extends js.Object {
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Whether mutual CHAP is enabled for the iSCSI target.
    */
  val chapEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.native
  /**
    * Logical disk number.
    */
  val lunNumber: js.UndefOr[Input[Double]] = js.native
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The port used to communicate with iSCSI targets.
    */
  val networkInterfacePort: js.UndefOr[Input[Double]] = js.native
  /**
    * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  val sourceVolumeArn: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: js.UndefOr[Input[String]] = js.native
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val volumeArn: js.UndefOr[Input[String]] = js.native
  /**
    * Volume ID, e.g. `vol-12345678`.
    */
  val volumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: js.UndefOr[Input[Double]] = js.native
}

object CachesIscsiVolumeState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    chapEnabled: Input[Boolean] = null,
    gatewayArn: Input[String] = null,
    lunNumber: Input[Double] = null,
    networkInterfaceId: Input[String] = null,
    networkInterfacePort: Input[Double] = null,
    snapshotId: Input[String] = null,
    sourceVolumeArn: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    targetArn: Input[String] = null,
    targetName: Input[String] = null,
    volumeArn: Input[String] = null,
    volumeId: Input[String] = null,
    volumeSizeInBytes: Input[Double] = null
  ): CachesIscsiVolumeState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (chapEnabled != null) __obj.updateDynamic("chapEnabled")(chapEnabled.asInstanceOf[js.Any])
    if (gatewayArn != null) __obj.updateDynamic("gatewayArn")(gatewayArn.asInstanceOf[js.Any])
    if (lunNumber != null) __obj.updateDynamic("lunNumber")(lunNumber.asInstanceOf[js.Any])
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any])
    if (networkInterfacePort != null) __obj.updateDynamic("networkInterfacePort")(networkInterfacePort.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (sourceVolumeArn != null) __obj.updateDynamic("sourceVolumeArn")(sourceVolumeArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    if (targetName != null) __obj.updateDynamic("targetName")(targetName.asInstanceOf[js.Any])
    if (volumeArn != null) __obj.updateDynamic("volumeArn")(volumeArn.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (volumeSizeInBytes != null) __obj.updateDynamic("volumeSizeInBytes")(volumeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachesIscsiVolumeState]
  }
}

