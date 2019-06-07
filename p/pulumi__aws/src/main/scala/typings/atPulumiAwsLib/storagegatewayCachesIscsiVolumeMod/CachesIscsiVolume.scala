package typings
package atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/cachesIscsiVolume", "CachesIscsiVolume")
@js.native
class CachesIscsiVolume protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CachesIscsiVolumeArgs) = this()
  def this(name: java.lang.String, args: CachesIscsiVolumeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether mutual CHAP is enabled for the iSCSI target.
    */
  val chapEnabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Logical disk number.
    */
  val lunNumber: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The port used to communicate with iSCSI targets.
    */
  val networkInterfacePort: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  val sourceVolumeArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Target Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
    */
  val targetArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Volume Amazon Resource Name (ARN), e.g. `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
    */
  val volumeArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Volume ID, e.g. `vol-12345678`.
    */
  val volumeId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeState
  ): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolumeState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod.CachesIscsiVolume = js.native
  /**
    * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ scala.Boolean = js.native
}

