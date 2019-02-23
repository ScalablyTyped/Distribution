package typings
package atPulumiAwsLib.storagegatewayGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway/gateway", "Gateway")
@js.native
class Gateway protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Gateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GatewayArgs) = this()
  def this(name: java.lang.String, args: GatewayArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the gateway.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Identifier of the gateway.
    */
  val gatewayId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where Terraform is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the gateway.
    */
  val gatewayName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val mediumChangerType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_DomainNamePassword]] = js.native
  /**
    * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. Terraform can only detect drift of the existence of a guest password, not its actual value from the gateway. Terraform can however update the password with changing the argument.
    */
  val smbGuestPassword: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Type of tape drive to use for tape gateway. Terraform cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayGatewayMod.GatewayState
  ): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayGatewayMod.GatewayState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.storagegatewayGatewayMod.Gateway = js.native
}

