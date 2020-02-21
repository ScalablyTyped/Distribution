package typings.pulumiAws.storagegatewayGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.storagegateway.GatewaySmbActiveDirectorySettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/gateway", "Gateway")
@js.native
class Gateway protected () extends CustomResource {
  /**
    * Create a Gateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GatewayArgs) = this()
  def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the gateway.
    */
  val arn: Output_[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
    */
  val cloudwatchLogGroupArn: Output_[js.UndefOr[String]] = js.native
  /**
    * Identifier of the gateway.
    */
  val gatewayId: Output_[String] = js.native
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: Output_[String] = js.native
  /**
    * Name of the gateway.
    */
  val gatewayName: Output_[String] = js.native
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: Output_[String] = js.native
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: Output_[js.UndefOr[String]] = js.native
  val mediumChangerType: Output_[js.UndefOr[String]] = js.native
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: Output_[js.UndefOr[GatewaySmbActiveDirectorySettings]] = js.native
  /**
    * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
    */
  val smbGuestPassword: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/storagegateway/gateway", "Gateway")
@js.native
object Gateway extends js.Object {
  /**
    * Get an existing Gateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState): Gateway = js.native
  def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): Gateway = js.native
  /**
    * Returns true if the given object is an instance of Gateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
}

