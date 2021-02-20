package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.storagegateway.GatewaySmbActiveDirectorySettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storagegatewayGatewayMod {
  
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
      * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageDownloadRateLimitInBitsPerSec: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageUploadRateLimitInBitsPerSec: Output_[js.UndefOr[Double]] = js.native
    
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
    
    /**
      * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running Pulumi. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
      */
    val gatewayVpcEndpoint: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`.
      */
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
      * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
      */
    val smbSecurityStrategy: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
      */
    val tapeDriveType: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Gateway {
    
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/storagegateway/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID]): Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState): Gateway = js.native
    @JSImport("@pulumi/aws/storagegateway/gateway", "Gateway.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): Gateway = js.native
    
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/storagegateway/gateway", "Gateway.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  @js.native
  trait GatewayArgs extends StObject {
    
    /**
      * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
      */
    val activationKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageDownloadRateLimitInBitsPerSec: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageUploadRateLimitInBitsPerSec: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
    
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
    
    /**
      * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running Pulumi. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
      */
    val gatewayVpcEndpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`.
      */
    val mediumChangerType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
      */
    val smbActiveDirectorySettings: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings]
      ] = js.native
    
    /**
      * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
      */
    val smbGuestPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
      */
    val smbSecurityStrategy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
      */
    val tapeDriveType: js.UndefOr[Input[String]] = js.native
  }
  object GatewayArgs {
    
    @scala.inline
    def apply(gatewayName: Input[String], gatewayTimezone: Input[String]): GatewayArgs = {
      val __obj = js.Dynamic.literal(gatewayName = gatewayName.asInstanceOf[js.Any], gatewayTimezone = gatewayTimezone.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayArgs]
    }
    
    @scala.inline
    implicit class GatewayArgsMutableBuilder[Self <: GatewayArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivationKey(value: Input[String]): Self = StObject.set(x, "activationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationKeyUndefined: Self = StObject.set(x, "activationKey", js.undefined)
      
      @scala.inline
      def setAverageDownloadRateLimitInBitsPerSec(value: Input[Double]): Self = StObject.set(x, "averageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageDownloadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "averageDownloadRateLimitInBitsPerSec", js.undefined)
      
      @scala.inline
      def setAverageUploadRateLimitInBitsPerSec(value: Input[Double]): Self = StObject.set(x, "averageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "averageUploadRateLimitInBitsPerSec", js.undefined)
      
      @scala.inline
      def setCloudwatchLogGroupArn(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogGroupArnUndefined: Self = StObject.set(x, "cloudwatchLogGroupArn", js.undefined)
      
      @scala.inline
      def setGatewayIpAddress(value: Input[String]): Self = StObject.set(x, "gatewayIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIpAddressUndefined: Self = StObject.set(x, "gatewayIpAddress", js.undefined)
      
      @scala.inline
      def setGatewayName(value: Input[String]): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayTimezone(value: Input[String]): Self = StObject.set(x, "gatewayTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayType(value: Input[String]): Self = StObject.set(x, "gatewayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayTypeUndefined: Self = StObject.set(x, "gatewayType", js.undefined)
      
      @scala.inline
      def setGatewayVpcEndpoint(value: Input[String]): Self = StObject.set(x, "gatewayVpcEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayVpcEndpointUndefined: Self = StObject.set(x, "gatewayVpcEndpoint", js.undefined)
      
      @scala.inline
      def setMediumChangerType(value: Input[String]): Self = StObject.set(x, "mediumChangerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumChangerTypeUndefined: Self = StObject.set(x, "mediumChangerType", js.undefined)
      
      @scala.inline
      def setSmbActiveDirectorySettings(value: Input[typings.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings]): Self = StObject.set(x, "smbActiveDirectorySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbActiveDirectorySettingsUndefined: Self = StObject.set(x, "smbActiveDirectorySettings", js.undefined)
      
      @scala.inline
      def setSmbGuestPassword(value: Input[String]): Self = StObject.set(x, "smbGuestPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbGuestPasswordUndefined: Self = StObject.set(x, "smbGuestPassword", js.undefined)
      
      @scala.inline
      def setSmbSecurityStrategy(value: Input[String]): Self = StObject.set(x, "smbSecurityStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbSecurityStrategyUndefined: Self = StObject.set(x, "smbSecurityStrategy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTapeDriveType(value: Input[String]): Self = StObject.set(x, "tapeDriveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapeDriveTypeUndefined: Self = StObject.set(x, "tapeDriveType", js.undefined)
    }
  }
  
  @js.native
  trait GatewayState extends StObject {
    
    /**
      * Gateway activation key during resource creation. Conflicts with `gatewayIpAddress`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
      */
    val activationKey: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the gateway.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageDownloadRateLimitInBitsPerSec: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
      */
    val averageUploadRateLimitInBitsPerSec: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the gateway.
      */
    val gatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activationKey`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
      */
    val gatewayIpAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the gateway.
      */
    val gatewayName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
      */
    val gatewayTimezone: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_S3`, `STORED`, `VTL`.
      */
    val gatewayType: js.UndefOr[Input[String]] = js.native
    
    /**
      * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running Pulumi. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
      */
    val gatewayVpcEndpoint: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`.
      */
    val mediumChangerType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
      */
    val smbActiveDirectorySettings: js.UndefOr[
        Input[typings.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings]
      ] = js.native
    
    /**
      * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` gateway type. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
      */
    val smbGuestPassword: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
      */
    val smbSecurityStrategy: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
      */
    val tapeDriveType: js.UndefOr[Input[String]] = js.native
  }
  object GatewayState {
    
    @scala.inline
    def apply(): GatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayState]
    }
    
    @scala.inline
    implicit class GatewayStateMutableBuilder[Self <: GatewayState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivationKey(value: Input[String]): Self = StObject.set(x, "activationKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationKeyUndefined: Self = StObject.set(x, "activationKey", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAverageDownloadRateLimitInBitsPerSec(value: Input[Double]): Self = StObject.set(x, "averageDownloadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageDownloadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "averageDownloadRateLimitInBitsPerSec", js.undefined)
      
      @scala.inline
      def setAverageUploadRateLimitInBitsPerSec(value: Input[Double]): Self = StObject.set(x, "averageUploadRateLimitInBitsPerSec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageUploadRateLimitInBitsPerSecUndefined: Self = StObject.set(x, "averageUploadRateLimitInBitsPerSec", js.undefined)
      
      @scala.inline
      def setCloudwatchLogGroupArn(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloudwatchLogGroupArnUndefined: Self = StObject.set(x, "cloudwatchLogGroupArn", js.undefined)
      
      @scala.inline
      def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setGatewayIpAddress(value: Input[String]): Self = StObject.set(x, "gatewayIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIpAddressUndefined: Self = StObject.set(x, "gatewayIpAddress", js.undefined)
      
      @scala.inline
      def setGatewayName(value: Input[String]): Self = StObject.set(x, "gatewayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayNameUndefined: Self = StObject.set(x, "gatewayName", js.undefined)
      
      @scala.inline
      def setGatewayTimezone(value: Input[String]): Self = StObject.set(x, "gatewayTimezone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayTimezoneUndefined: Self = StObject.set(x, "gatewayTimezone", js.undefined)
      
      @scala.inline
      def setGatewayType(value: Input[String]): Self = StObject.set(x, "gatewayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayTypeUndefined: Self = StObject.set(x, "gatewayType", js.undefined)
      
      @scala.inline
      def setGatewayVpcEndpoint(value: Input[String]): Self = StObject.set(x, "gatewayVpcEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayVpcEndpointUndefined: Self = StObject.set(x, "gatewayVpcEndpoint", js.undefined)
      
      @scala.inline
      def setMediumChangerType(value: Input[String]): Self = StObject.set(x, "mediumChangerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumChangerTypeUndefined: Self = StObject.set(x, "mediumChangerType", js.undefined)
      
      @scala.inline
      def setSmbActiveDirectorySettings(value: Input[typings.pulumiAws.inputMod.storagegateway.GatewaySmbActiveDirectorySettings]): Self = StObject.set(x, "smbActiveDirectorySettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbActiveDirectorySettingsUndefined: Self = StObject.set(x, "smbActiveDirectorySettings", js.undefined)
      
      @scala.inline
      def setSmbGuestPassword(value: Input[String]): Self = StObject.set(x, "smbGuestPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbGuestPasswordUndefined: Self = StObject.set(x, "smbGuestPassword", js.undefined)
      
      @scala.inline
      def setSmbSecurityStrategy(value: Input[String]): Self = StObject.set(x, "smbSecurityStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmbSecurityStrategyUndefined: Self = StObject.set(x, "smbSecurityStrategy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTapeDriveType(value: Input[String]): Self = StObject.set(x, "tapeDriveType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTapeDriveTypeUndefined: Self = StObject.set(x, "tapeDriveType", js.undefined)
    }
  }
}
