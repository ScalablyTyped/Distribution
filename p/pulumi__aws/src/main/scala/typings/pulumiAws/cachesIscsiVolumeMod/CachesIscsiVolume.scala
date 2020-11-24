package typings.pulumiAws.cachesIscsiVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume")
@js.native
class CachesIscsiVolume protected () extends CustomResource {
  /**
    * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CachesIscsiVolumeArgs) = this()
  def this(name: String, args: CachesIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Whether mutual CHAP is enabled for the iSCSI target.
    */
  val chapEnabled: Output_[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Output_[String] = js.native
  
  /**
    * Set to `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3.
    */
  val kmsEncrypted: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. Is required when `kmsEncrypted` is set.
    */
  val kmsKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Logical disk number.
    */
  val lunNumber: Output_[Double] = js.native
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: Output_[String] = js.native
  
  /**
    * The port used to communicate with iSCSI targets.
    */
  val networkInterfacePort: Output_[Double] = js.native
  
  /**
    * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volumeSizeInBytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  val sourceVolumeArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
    */
  val targetArn: Output_[String] = js.native
  
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: Output_[String] = js.native
  
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val volumeArn: Output_[String] = js.native
  
  /**
    * Volume ID, e.g. `vol-12345678`.
    */
  val volumeId: Output_[String] = js.native
  
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume")
@js.native
object CachesIscsiVolume extends js.Object {
  
  /**
    * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CachesIscsiVolume = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): CachesIscsiVolume = js.native
  def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): CachesIscsiVolume = js.native
  def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): CachesIscsiVolume = js.native
  
  /**
    * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
}
