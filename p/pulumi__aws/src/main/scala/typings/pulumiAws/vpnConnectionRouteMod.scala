package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpnConnectionRouteMod {
  
  @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute")
  @js.native
  class VpnConnectionRoute protected () extends CustomResource {
    /**
      * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpnConnectionRouteArgs) = this()
    def this(name: String, args: VpnConnectionRouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The CIDR block associated with the local subnet of the customer network.
      */
    val destinationCidrBlock: Output_[String] = js.native
    
    /**
      * The ID of the VPN connection.
      */
    val vpnConnectionId: Output_[String] = js.native
  }
  /* static members */
  object VpnConnectionRoute {
    
    /**
      * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute.get")
    @js.native
    def get(name: String, id: Input[ID]): VpnConnectionRoute = js.native
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnConnectionRoute = js.native
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnConnectionRouteState): VpnConnectionRoute = js.native
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnConnectionRouteState, opts: CustomResourceOptions): VpnConnectionRoute = js.native
    
    /**
      * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ Boolean = js.native
  }
  
  @js.native
  trait VpnConnectionRouteArgs extends StObject {
    
    /**
      * The CIDR block associated with the local subnet of the customer network.
      */
    val destinationCidrBlock: Input[String] = js.native
    
    /**
      * The ID of the VPN connection.
      */
    val vpnConnectionId: Input[String] = js.native
  }
  object VpnConnectionRouteArgs {
    
    @scala.inline
    def apply(destinationCidrBlock: Input[String], vpnConnectionId: Input[String]): VpnConnectionRouteArgs = {
      val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpnConnectionRouteArgs]
    }
    
    @scala.inline
    implicit class VpnConnectionRouteArgsMutableBuilder[Self <: VpnConnectionRouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnConnectionId(value: Input[String]): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpnConnectionRouteState extends StObject {
    
    /**
      * The CIDR block associated with the local subnet of the customer network.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPN connection.
      */
    val vpnConnectionId: js.UndefOr[Input[String]] = js.native
  }
  object VpnConnectionRouteState {
    
    @scala.inline
    def apply(): VpnConnectionRouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnConnectionRouteState]
    }
    
    @scala.inline
    implicit class VpnConnectionRouteStateMutableBuilder[Self <: VpnConnectionRouteState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setVpnConnectionId(value: Input[String]): Self = StObject.set(x, "vpnConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnConnectionIdUndefined: Self = StObject.set(x, "vpnConnectionId", js.undefined)
    }
  }
}
