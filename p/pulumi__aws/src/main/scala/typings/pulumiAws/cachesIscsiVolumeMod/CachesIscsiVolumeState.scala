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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
  def apply(): CachesIscsiVolumeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachesIscsiVolumeState]
  }
  @scala.inline
  implicit class CachesIscsiVolumeStateOps[Self <: CachesIscsiVolumeState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setChapEnabled(value: Input[Boolean]): Self = this.set("chapEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChapEnabled: Self = this.set("chapEnabled", js.undefined)
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayArn: Self = this.set("gatewayArn", js.undefined)
    @scala.inline
    def setLunNumber(value: Input[Double]): Self = this.set("lunNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLunNumber: Self = this.set("lunNumber", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setNetworkInterfacePort(value: Input[Double]): Self = this.set("networkInterfacePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfacePort: Self = this.set("networkInterfacePort", js.undefined)
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    @scala.inline
    def setSourceVolumeArn(value: Input[String]): Self = this.set("sourceVolumeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceVolumeArn: Self = this.set("sourceVolumeArn", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
    @scala.inline
    def setTargetName(value: Input[String]): Self = this.set("targetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetName: Self = this.set("targetName", js.undefined)
    @scala.inline
    def setVolumeArn(value: Input[String]): Self = this.set("volumeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeArn: Self = this.set("volumeArn", js.undefined)
    @scala.inline
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
    @scala.inline
    def setVolumeSizeInBytes(value: Input[Double]): Self = this.set("volumeSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("volumeSizeInBytes", js.undefined)
  }
  
}

