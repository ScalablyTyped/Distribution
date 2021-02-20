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

object vpnGatewayRoutePropagationMod {
  
  @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation")
  @js.native
  class VpnGatewayRoutePropagation protected () extends CustomResource {
    /**
      * Create a VpnGatewayRoutePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpnGatewayRoutePropagationArgs) = this()
    def this(name: String, args: VpnGatewayRoutePropagationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The id of the `aws.ec2.RouteTable` to propagate routes into.
      */
    val routeTableId: Output_[String] = js.native
    
    /**
      * The id of the `aws.ec2.VpnGateway` to propagate routes from.
      */
    val vpnGatewayId: Output_[String] = js.native
  }
  /* static members */
  object VpnGatewayRoutePropagation {
    
    /**
      * Get an existing VpnGatewayRoutePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation.get")
    @js.native
    def get(name: String, id: Input[ID]): VpnGatewayRoutePropagation = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnGatewayRoutePropagation = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayRoutePropagationState): VpnGatewayRoutePropagation = js.native
    @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpnGatewayRoutePropagationState, opts: CustomResourceOptions): VpnGatewayRoutePropagation = js.native
    
    /**
      * Returns true if the given object is an instance of VpnGatewayRoutePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpnGatewayRoutePropagation", "VpnGatewayRoutePropagation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnGatewayRoutePropagation.VpnGatewayRoutePropagation */ Boolean = js.native
  }
  
  @js.native
  trait VpnGatewayRoutePropagationArgs extends StObject {
    
    /**
      * The id of the `aws.ec2.RouteTable` to propagate routes into.
      */
    val routeTableId: Input[String] = js.native
    
    /**
      * The id of the `aws.ec2.VpnGateway` to propagate routes from.
      */
    val vpnGatewayId: Input[String] = js.native
  }
  object VpnGatewayRoutePropagationArgs {
    
    @scala.inline
    def apply(routeTableId: Input[String], vpnGatewayId: Input[String]): VpnGatewayRoutePropagationArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpnGatewayId = vpnGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpnGatewayRoutePropagationArgs]
    }
    
    @scala.inline
    implicit class VpnGatewayRoutePropagationArgsMutableBuilder[Self <: VpnGatewayRoutePropagationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpnGatewayRoutePropagationState extends StObject {
    
    /**
      * The id of the `aws.ec2.RouteTable` to propagate routes into.
      */
    val routeTableId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The id of the `aws.ec2.VpnGateway` to propagate routes from.
      */
    val vpnGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object VpnGatewayRoutePropagationState {
    
    @scala.inline
    def apply(): VpnGatewayRoutePropagationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpnGatewayRoutePropagationState]
    }
    
    @scala.inline
    implicit class VpnGatewayRoutePropagationStateMutableBuilder[Self <: VpnGatewayRoutePropagationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      @scala.inline
      def setVpnGatewayId(value: Input[String]): Self = StObject.set(x, "vpnGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpnGatewayIdUndefined: Self = StObject.set(x, "vpnGatewayId", js.undefined)
    }
  }
}
