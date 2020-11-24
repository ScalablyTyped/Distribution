package typings.pulumiAws.storedIscsiVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoredIscsiVolumeArgs extends js.Object {
  
  /**
    * The unique identifier for the gateway local disk that is configured as a stored volume.
    */
  val diskId: Input[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String] = js.native
  
  /**
    * `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
    */
  val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kmsEncrypted` is `true`.
    */
  val kmsKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: Input[String] = js.native
  
  /**
    * Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
    */
  val preserveExistingData: Input[Boolean] = js.native
  
  /**
    * The snapshot ID of the snapshot to restore as the new stored volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: Input[String] = js.native
}
object StoredIscsiVolumeArgs {
  
  @scala.inline
  def apply(
    diskId: Input[String],
    gatewayArn: Input[String],
    networkInterfaceId: Input[String],
    preserveExistingData: Input[Boolean],
    targetName: Input[String]
  ): StoredIscsiVolumeArgs = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], preserveExistingData = preserveExistingData.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoredIscsiVolumeArgs]
  }
  
  @scala.inline
  implicit class StoredIscsiVolumeArgsOps[Self <: StoredIscsiVolumeArgs] (val x: Self) extends AnyVal {
    
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
    def setDiskId(value: Input[String]): Self = this.set("diskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveExistingData(value: Input[Boolean]): Self = this.set("preserveExistingData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: Input[String]): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsEncrypted(value: Input[Boolean]): Self = this.set("kmsEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsEncrypted: Self = this.set("kmsEncrypted", js.undefined)
    
    @scala.inline
    def setKmsKey(value: Input[String]): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: Input[String]): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
