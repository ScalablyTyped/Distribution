package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpnConnectionRoute
import typings.pulumiAws.outputMod.ec2.VpnConnectionVgwTelemetry
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpnConnectionMod {
  
  @JSImport("@pulumi/aws/ec2/vpnConnection", "VpnConnection")
  @js.native
  class VpnConnection protected () extends CustomResource {
    /**
      * Create a VpnConnection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpnConnectionArgs) = this()
    def this(name: String, args: VpnConnectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the VPN Connection.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The configuration information for the VPN connection's customer gateway (in the native XML format).
      */
    val customerGatewayConfiguration: Output_[String] = js.native
    
    /**
      * The ID of the customer gateway.
      */
    val customerGatewayId: Output_[String] = js.native
    
    val routes: Output_[js.Array[VpnConnectionRoute]] = js.native
    
    /**
      * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
      */
    val staticRoutesOnly: Output_[Boolean] = js.native
    
    /**
      * Tags to apply to the connection.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * When associated with an EC2 Transit Gateway (`transitGatewayId` argument), the attachment ID.
      */
    val transitGatewayAttachmentId: Output_[String] = js.native
    
    /**
      * The ID of the EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The public IP address of the first VPN tunnel.
      */
    val tunnel1Address: Output_[String] = js.native
    
    /**
      * The bgp asn number of the first VPN tunnel.
      */
    val tunnel1BgpAsn: Output_[String] = js.native
    
    /**
      * The bgp holdtime of the first VPN tunnel.
      */
    val tunnel1BgpHoldtime: Output_[Double] = js.native
    
    /**
      * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
      */
    val tunnel1CgwInsideAddress: Output_[String] = js.native
    
    /**
      * The CIDR block of the inside IP addresses for the first VPN tunnel.
      */
    val tunnel1InsideCidr: Output_[String] = js.native
    
    /**
      * The preshared key of the first VPN tunnel.
      */
    val tunnel1PresharedKey: Output_[String] = js.native
    
    /**
      * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
      */
    val tunnel1VgwInsideAddress: Output_[String] = js.native
    
    /**
      * The public IP address of the second VPN tunnel.
      */
    val tunnel2Address: Output_[String] = js.native
    
    /**
      * The bgp asn number of the second VPN tunnel.
      */
    val tunnel2BgpAsn: Output_[String] = js.native
    
    /**
      * The bgp holdtime of the second VPN tunnel.
      */
    val tunnel2BgpHoldtime: Output_[Double] = js.native
    
    /**
      * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
      */
    val tunnel2CgwInsideAddress: Output_[String] = js.native
    
    /**
      * The CIDR block of the inside IP addresses for the second VPN tunnel.
      */
    val tunnel2InsideCidr: Output_[String] = js.native
    
    /**
      * The preshared key of the second VPN tunnel.
      */
    val tunnel2PresharedKey: Output_[String] = js.native
    
    /**
      * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
      */
    val tunnel2VgwInsideAddress: Output_[String] = js.native
    
    /**
      * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
      */
    val `type`: Output_[String] = js.native
    
    val vgwTelemetries: Output_[js.Array[VpnConnectionVgwTelemetry]] = js.native
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object VpnConnection {
    
    @JSImport("@pulumi/aws/ec2/vpnConnection", "VpnConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpnConnection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpnConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpnConnection]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpnConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpnConnection]
    inline def get(name: String, id: Input[ID], state: VpnConnectionState): VpnConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpnConnection]
    inline def get(name: String, id: Input[ID], state: VpnConnectionState, opts: CustomResourceOptions): VpnConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpnConnection]
    
    /**
      * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ Boolean]
  }
  
  trait VpnConnectionArgs extends StObject {
    
    /**
      * The ID of the customer gateway.
      */
    val customerGatewayId: Input[String]
    
    /**
      * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
      */
    val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CIDR block of the inside IP addresses for the first VPN tunnel.
      */
    val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The preshared key of the first VPN tunnel.
      */
    val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CIDR block of the inside IP addresses for the second VPN tunnel.
      */
    val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The preshared key of the second VPN tunnel.
      */
    val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
      */
    val `type`: Input[String]
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpnConnectionArgs {
    
    inline def apply(customerGatewayId: Input[String], `type`: Input[String]): VpnConnectionArgs = {
      val __obj = js.Dynamic.literal(customerGatewayId = customerGatewayId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpnConnectionArgs]
    }
    
    extension [Self <: VpnConnectionArgs](x: Self) {
      
      inline def setCustomerGatewayId(value: Input[String]): Self = StObject.set(x, "customerGatewayId", value.asInstanceOf[js.Any])
      
      inline def setStaticRoutesOnly(value: Input[Boolean]): Self = StObject.set(x, "staticRoutesOnly", value.asInstanceOf[js.Any])
      
      inline def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "staticRoutesOnly", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setTunnel1InsideCidr(value: Input[String]): Self = StObject.set(x, "tunnel1InsideCidr", value.asInstanceOf[js.Any])
      
      inline def setTunnel1InsideCidrUndefined: Self = StObject.set(x, "tunnel1InsideCidr", js.undefined)
      
      inline def setTunnel1PresharedKey(value: Input[String]): Self = StObject.set(x, "tunnel1PresharedKey", value.asInstanceOf[js.Any])
      
      inline def setTunnel1PresharedKeyUndefined: Self = StObject.set(x, "tunnel1PresharedKey", js.undefined)
      
      inline def setTunnel2InsideCidr(value: Input[String]): Self = StObject.set(x, "tunnel2InsideCidr", value.asInstanceOf[js.Any])
      
      inline def setTunnel2InsideCidrUndefined: Self = StObject.set(x, "tunnel2InsideCidr", js.undefined)
      
      inline def setTunnel2PresharedKey(value: Input[String]): Self = StObject.set(x, "tunnel2PresharedKey", value.asInstanceOf[js.Any])
      
      inline def setTunnel2PresharedKeyUndefined: Self = StObject.set(x, "tunnel2PresharedKey", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
  
  trait VpnConnectionState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the VPN Connection.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The configuration information for the VPN connection's customer gateway (in the native XML format).
      */
    val customerGatewayConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the customer gateway.
      */
    val customerGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    val routes: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpnConnectionRoute]]]] = js.undefined
    
    /**
      * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
      */
    val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Tags to apply to the connection.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * When associated with an EC2 Transit Gateway (`transitGatewayId` argument), the attachment ID.
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public IP address of the first VPN tunnel.
      */
    val tunnel1Address: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bgp asn number of the first VPN tunnel.
      */
    val tunnel1BgpAsn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bgp holdtime of the first VPN tunnel.
      */
    val tunnel1BgpHoldtime: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
      */
    val tunnel1CgwInsideAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CIDR block of the inside IP addresses for the first VPN tunnel.
      */
    val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The preshared key of the first VPN tunnel.
      */
    val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
      */
    val tunnel1VgwInsideAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The public IP address of the second VPN tunnel.
      */
    val tunnel2Address: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bgp asn number of the second VPN tunnel.
      */
    val tunnel2BgpAsn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The bgp holdtime of the second VPN tunnel.
      */
    val tunnel2BgpHoldtime: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
      */
    val tunnel2CgwInsideAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The CIDR block of the inside IP addresses for the second VPN tunnel.
      */
    val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The preshared key of the second VPN tunnel.
      */
    val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
      */
    val tunnel2VgwInsideAddress: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
    
    val vgwTelemetries: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpnConnectionVgwTelemetry]]]] = js.undefined
    
    /**
      * The ID of the Virtual Private Gateway.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpnConnectionState {
    
    inline def apply(): VpnConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnConnectionState]
    }
    
    extension [Self <: VpnConnectionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCustomerGatewayConfiguration(value: Input[String]): Self = StObject.set(x, "customerGatewayConfiguration", value.asInstanceOf[js.Any])
      
      inline def setCustomerGatewayConfigurationUndefined: Self = StObject.set(x, "customerGatewayConfiguration", js.undefined)
      
      inline def setCustomerGatewayId(value: Input[String]): Self = StObject.set(x, "customerGatewayId", value.asInstanceOf[js.Any])
      
      inline def setCustomerGatewayIdUndefined: Self = StObject.set(x, "customerGatewayId", js.undefined)
      
      inline def setRoutes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpnConnectionRoute]]]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.VpnConnectionRoute]*): Self = StObject.set(x, "routes", js.Array(value :_*))
      
      inline def setStaticRoutesOnly(value: Input[Boolean]): Self = StObject.set(x, "staticRoutesOnly", value.asInstanceOf[js.Any])
      
      inline def setStaticRoutesOnlyUndefined: Self = StObject.set(x, "staticRoutesOnly", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setTunnel1Address(value: Input[String]): Self = StObject.set(x, "tunnel1Address", value.asInstanceOf[js.Any])
      
      inline def setTunnel1AddressUndefined: Self = StObject.set(x, "tunnel1Address", js.undefined)
      
      inline def setTunnel1BgpAsn(value: Input[String]): Self = StObject.set(x, "tunnel1BgpAsn", value.asInstanceOf[js.Any])
      
      inline def setTunnel1BgpAsnUndefined: Self = StObject.set(x, "tunnel1BgpAsn", js.undefined)
      
      inline def setTunnel1BgpHoldtime(value: Input[Double]): Self = StObject.set(x, "tunnel1BgpHoldtime", value.asInstanceOf[js.Any])
      
      inline def setTunnel1BgpHoldtimeUndefined: Self = StObject.set(x, "tunnel1BgpHoldtime", js.undefined)
      
      inline def setTunnel1CgwInsideAddress(value: Input[String]): Self = StObject.set(x, "tunnel1CgwInsideAddress", value.asInstanceOf[js.Any])
      
      inline def setTunnel1CgwInsideAddressUndefined: Self = StObject.set(x, "tunnel1CgwInsideAddress", js.undefined)
      
      inline def setTunnel1InsideCidr(value: Input[String]): Self = StObject.set(x, "tunnel1InsideCidr", value.asInstanceOf[js.Any])
      
      inline def setTunnel1InsideCidrUndefined: Self = StObject.set(x, "tunnel1InsideCidr", js.undefined)
      
      inline def setTunnel1PresharedKey(value: Input[String]): Self = StObject.set(x, "tunnel1PresharedKey", value.asInstanceOf[js.Any])
      
      inline def setTunnel1PresharedKeyUndefined: Self = StObject.set(x, "tunnel1PresharedKey", js.undefined)
      
      inline def setTunnel1VgwInsideAddress(value: Input[String]): Self = StObject.set(x, "tunnel1VgwInsideAddress", value.asInstanceOf[js.Any])
      
      inline def setTunnel1VgwInsideAddressUndefined: Self = StObject.set(x, "tunnel1VgwInsideAddress", js.undefined)
      
      inline def setTunnel2Address(value: Input[String]): Self = StObject.set(x, "tunnel2Address", value.asInstanceOf[js.Any])
      
      inline def setTunnel2AddressUndefined: Self = StObject.set(x, "tunnel2Address", js.undefined)
      
      inline def setTunnel2BgpAsn(value: Input[String]): Self = StObject.set(x, "tunnel2BgpAsn", value.asInstanceOf[js.Any])
      
      inline def setTunnel2BgpAsnUndefined: Self = StObject.set(x, "tunnel2BgpAsn", js.undefined)
      
      inline def setTunnel2BgpHoldtime(value: Input[Double]): Self = StObject.set(x, "tunnel2BgpHoldtime", value.asInstanceOf[js.Any])
      
      inline def setTunnel2BgpHoldtimeUndefined: Self = StObject.set(x, "tunnel2BgpHoldtime", js.undefined)
      
      inline def setTunnel2CgwInsideAddress(value: Input[String]): Self = StObject.set(x, "tunnel2CgwInsideAddress", value.asInstanceOf[js.Any])
      
      inline def setTunnel2CgwInsideAddressUndefined: Self = StObject.set(x, "tunnel2CgwInsideAddress", js.undefined)
      
      inline def setTunnel2InsideCidr(value: Input[String]): Self = StObject.set(x, "tunnel2InsideCidr", value.asInstanceOf[js.Any])
      
      inline def setTunnel2InsideCidrUndefined: Self = StObject.set(x, "tunnel2InsideCidr", js.undefined)
      
      inline def setTunnel2PresharedKey(value: Input[String]): Self = StObject.set(x, "tunnel2PresharedKey", value.asInstanceOf[js.Any])
      
      inline def setTunnel2PresharedKeyUndefined: Self = StObject.set(x, "tunnel2PresharedKey", js.undefined)
      
      inline def setTunnel2VgwInsideAddress(value: Input[String]): Self = StObject.set(x, "tunnel2VgwInsideAddress", value.asInstanceOf[js.Any])
      
      inline def setTunnel2VgwInsideAddressUndefined: Self = StObject.set(x, "tunnel2VgwInsideAddress", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVgwTelemetries(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpnConnectionVgwTelemetry]]]): Self = StObject.set(x, "vgwTelemetries", value.asInstanceOf[js.Any])
      
      inline def setVgwTelemetriesUndefined: Self = StObject.set(x, "vgwTelemetries", js.undefined)
      
      inline def setVgwTelemetriesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.VpnConnectionVgwTelemetry]*): Self = StObject.set(x, "vgwTelemetries", js.Array(value :_*))
      
      inline def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      inline def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
}
