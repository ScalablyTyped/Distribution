package typings.pulumiAws.storedIscsiVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoredIscsiVolumeState extends js.Object {
  
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether mutual CHAP is enabled for the iSCSI target.
    */
  val chapEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The unique identifier for the gateway local disk that is configured as a stored volume.
    */
  val diskId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
    */
  val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
    */
  val kmsKey: js.UndefOr[Input[String]] = js.native
  
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
    * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
    */
  val preserveExistingData: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The snapshot ID of the snapshot to restore as the new stored volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of resource tags
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
    * A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
    */
  val volumeAttachmentStatus: js.UndefOr[Input[String]] = js.native
  
  /**
    * Volume ID, e.g. `vol-12345678`.
    */
  val volumeId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The size of the data stored on the volume in bytes.
    */
  val volumeSizeInBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * indicates the state of the storage volume.
    */
  val volumeStatus: js.UndefOr[Input[String]] = js.native
  
  /**
    * indicates the type of the volume.
    */
  val volumeType: js.UndefOr[Input[String]] = js.native
}
object StoredIscsiVolumeState {
  
  @scala.inline
  def apply(): StoredIscsiVolumeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoredIscsiVolumeState]
  }
  
  @scala.inline
  implicit class StoredIscsiVolumeStateOps[Self <: StoredIscsiVolumeState] (val x: Self) extends AnyVal {
    
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
    def setDiskId(value: Input[String]): Self = this.set("diskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskId: Self = this.set("diskId", js.undefined)
    
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayArn: Self = this.set("gatewayArn", js.undefined)
    
    @scala.inline
    def setKmsEncrypted(value: Input[Boolean]): Self = this.set("kmsEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsEncrypted: Self = this.set("kmsEncrypted", js.undefined)
    
    @scala.inline
    def setKmsKey(value: Input[String]): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
    
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
    def setPreserveExistingData(value: Input[Boolean]): Self = this.set("preserveExistingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveExistingData: Self = this.set("preserveExistingData", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    
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
    def setVolumeAttachmentStatus(value: Input[String]): Self = this.set("volumeAttachmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeAttachmentStatus: Self = this.set("volumeAttachmentStatus", js.undefined)
    
    @scala.inline
    def setVolumeId(value: Input[String]): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
    
    @scala.inline
    def setVolumeSizeInBytes(value: Input[Double]): Self = this.set("volumeSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSizeInBytes: Self = this.set("volumeSizeInBytes", js.undefined)
    
    @scala.inline
    def setVolumeStatus(value: Input[String]): Self = this.set("volumeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeStatus: Self = this.set("volumeStatus", js.undefined)
    
    @scala.inline
    def setVolumeType(value: Input[String]): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeType: Self = this.set("volumeType", js.undefined)
  }
}
