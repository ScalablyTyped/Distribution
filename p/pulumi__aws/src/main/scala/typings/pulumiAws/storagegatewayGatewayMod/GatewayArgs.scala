package typings.pulumiAws.storagegatewayGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayArgs extends js.Object {
  /**
    * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: js.UndefOr[Input[String]] = js.native
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the gateway.
    */
  val gatewayName: Input[String] = js.native
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: Input[String] = js.native
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: js.UndefOr[Input[String]] = js.native
  val mediumChangerType: js.UndefOr[Input[String]] = js.native
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: js.UndefOr[Input[GatewaySmbActiveDirectorySettings]] = js.native
  /**
    * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
    */
  val smbGuestPassword: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: js.UndefOr[Input[String]] = js.native
}

object GatewayArgs {
  @scala.inline
  def apply(
    gatewayName: Input[String],
    gatewayTimezone: Input[String],
    activationKey: Input[String] = null,
    gatewayIpAddress: Input[String] = null,
    gatewayType: Input[String] = null,
    mediumChangerType: Input[String] = null,
    smbActiveDirectorySettings: Input[GatewaySmbActiveDirectorySettings] = null,
    smbGuestPassword: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    tapeDriveType: Input[String] = null
  ): GatewayArgs = {
    val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayTimezone = gatewayTimezone.asInstanceOf[js.Any])
    if (activationKey != null) __obj.updateDynamic("activationKey")(activationKey.asInstanceOf[js.Any])
    if (gatewayIpAddress != null) __obj.updateDynamic("gatewayIpAddress")(gatewayIpAddress.asInstanceOf[js.Any])
    if (gatewayType != null) __obj.updateDynamic("gatewayType")(gatewayType.asInstanceOf[js.Any])
    if (mediumChangerType != null) __obj.updateDynamic("mediumChangerType")(mediumChangerType.asInstanceOf[js.Any])
    if (smbActiveDirectorySettings != null) __obj.updateDynamic("smbActiveDirectorySettings")(smbActiveDirectorySettings.asInstanceOf[js.Any])
    if (smbGuestPassword != null) __obj.updateDynamic("smbGuestPassword")(smbGuestPassword.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tapeDriveType != null) __obj.updateDynamic("tapeDriveType")(tapeDriveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayArgs]
  }
}

