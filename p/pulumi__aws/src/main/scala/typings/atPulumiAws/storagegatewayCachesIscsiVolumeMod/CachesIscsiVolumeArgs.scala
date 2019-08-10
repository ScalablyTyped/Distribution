package typings.atPulumiAws.storagegatewayCachesIscsiVolumeMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachesIscsiVolumeArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String]
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: Input[String]
  /**
    * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  val sourceVolumeArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: Input[String]
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: Input[Double]
}

object CachesIscsiVolumeArgs {
  @scala.inline
  def apply(
    gatewayArn: Input[String],
    networkInterfaceId: Input[String],
    targetName: Input[String],
    volumeSizeInBytes: Input[Double],
    snapshotId: Input[String] = null,
    sourceVolumeArn: Input[String] = null
  ): CachesIscsiVolumeArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], volumeSizeInBytes = volumeSizeInBytes.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (sourceVolumeArn != null) __obj.updateDynamic("sourceVolumeArn")(sourceVolumeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachesIscsiVolumeArgs]
  }
}

