package typings.atPulumiAws.storagegatewayGatewayMod

import typings.atPulumiAws.Anon_DomainNamePasswordUsername
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayState extends js.Object {
  /**
    * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val activationKey: js.UndefOr[Input[String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the gateway.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Identifier of the gateway.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
    */
  val gatewayIpAddress: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the gateway.
    */
  val gatewayName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
    */
  val gatewayTimezone: js.UndefOr[Input[String]] = js.undefined
  /**
    * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
    */
  val gatewayType: js.UndefOr[Input[String]] = js.undefined
  val mediumChangerType: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
    */
  val smbActiveDirectorySettings: js.UndefOr[Input[Anon_DomainNamePasswordUsername]] = js.undefined
  /**
    * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
    */
  val smbGuestPassword: js.UndefOr[Input[String]] = js.undefined
  /**
    * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
    */
  val tapeDriveType: js.UndefOr[Input[String]] = js.undefined
}

object GatewayState {
  @scala.inline
  def apply(
    activationKey: Input[String] = null,
    arn: Input[String] = null,
    gatewayId: Input[String] = null,
    gatewayIpAddress: Input[String] = null,
    gatewayName: Input[String] = null,
    gatewayTimezone: Input[String] = null,
    gatewayType: Input[String] = null,
    mediumChangerType: Input[String] = null,
    smbActiveDirectorySettings: Input[Anon_DomainNamePasswordUsername] = null,
    smbGuestPassword: Input[String] = null,
    tapeDriveType: Input[String] = null
  ): GatewayState = {
    val __obj = js.Dynamic.literal()
    if (activationKey != null) __obj.updateDynamic("activationKey")(activationKey.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (gatewayId != null) __obj.updateDynamic("gatewayId")(gatewayId.asInstanceOf[js.Any])
    if (gatewayIpAddress != null) __obj.updateDynamic("gatewayIpAddress")(gatewayIpAddress.asInstanceOf[js.Any])
    if (gatewayName != null) __obj.updateDynamic("gatewayName")(gatewayName.asInstanceOf[js.Any])
    if (gatewayTimezone != null) __obj.updateDynamic("gatewayTimezone")(gatewayTimezone.asInstanceOf[js.Any])
    if (gatewayType != null) __obj.updateDynamic("gatewayType")(gatewayType.asInstanceOf[js.Any])
    if (mediumChangerType != null) __obj.updateDynamic("mediumChangerType")(mediumChangerType.asInstanceOf[js.Any])
    if (smbActiveDirectorySettings != null) __obj.updateDynamic("smbActiveDirectorySettings")(smbActiveDirectorySettings.asInstanceOf[js.Any])
    if (smbGuestPassword != null) __obj.updateDynamic("smbGuestPassword")(smbGuestPassword.asInstanceOf[js.Any])
    if (tapeDriveType != null) __obj.updateDynamic("tapeDriveType")(tapeDriveType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayState]
  }
}

