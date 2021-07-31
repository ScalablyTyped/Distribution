package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2/vpnConnectionRoute", "VpnConnectionRoute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpnConnectionRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpnConnectionRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpnConnectionRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpnConnectionRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpnConnectionRouteState): VpnConnectionRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpnConnectionRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpnConnectionRouteState, opts: CustomResourceOptions): VpnConnectionRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpnConnectionRoute]
    
    /**
      * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ Boolean]
  }
  
  trait VpnConnectionRouteArgs extends StObject {
    
    /**
      * The CIDR block associated with the local subnet of the customer network.
      */
    val destinationCidrBlock: Input[String]
    
    /**
      * The ID of the VPN connection.
      */
    val vpnConnectionId: Input[String]
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
  
  trait VpnConnectionRouteState extends StObject {
    
    /**
      * The CIDR block associated with the local subnet of the customer network.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPN connection.
      */
    val vpnConnectionId: js.UndefOr[Input[String]] = js.undefined
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
