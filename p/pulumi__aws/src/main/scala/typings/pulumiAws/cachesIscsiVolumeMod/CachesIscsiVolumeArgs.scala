package typings.pulumiAws.cachesIscsiVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CachesIscsiVolumeArgs extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String] = js.native
  
  /**
    * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
    */
  val kmsEncrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kmsEncrypted` is set.
    */
  val kmsKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: Input[String] = js.native
  
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
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: Input[String] = js.native
  
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: Input[Double] = js.native
}
object CachesIscsiVolumeArgs {
  
  @scala.inline
  def apply(
    gatewayArn: Input[String],
    networkInterfaceId: Input[String],
    targetName: Input[String],
    volumeSizeInBytes: Input[Double]
  ): CachesIscsiVolumeArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], volumeSizeInBytes = volumeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachesIscsiVolumeArgs]
  }
  
  @scala.inline
  implicit class CachesIscsiVolumeArgsOps[Self <: CachesIscsiVolumeArgs] (val x: Self) extends AnyVal {
    
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
    def setGatewayArn(value: Input[String]): Self = this.set("gatewayArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: Input[String]): Self = this.set("targetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeInBytes(value: Input[Double]): Self = this.set("volumeSizeInBytes", value.asInstanceOf[js.Any])
    
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
    def setSourceVolumeArn(value: Input[String]): Self = this.set("sourceVolumeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceVolumeArn: Self = this.set("sourceVolumeArn", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
