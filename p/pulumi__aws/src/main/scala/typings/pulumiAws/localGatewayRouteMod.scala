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

object localGatewayRouteMod {
  
  @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute")
  @js.native
  class LocalGatewayRoute protected () extends CustomResource {
    /**
      * Create a LocalGatewayRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocalGatewayRouteArgs) = this()
    def this(name: String, args: LocalGatewayRouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface Group.
      */
    val localGatewayVirtualInterfaceGroupId: Output_[String] = js.native
  }
  /* static members */
  object LocalGatewayRoute {
    
    /**
      * Get an existing LocalGatewayRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID]): LocalGatewayRoute = js.native
    @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LocalGatewayRoute = js.native
    @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocalGatewayRouteState): LocalGatewayRoute = js.native
    @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute.get")
    @js.native
    def get(name: String, id: Input[ID], state: LocalGatewayRouteState, opts: CustomResourceOptions): LocalGatewayRoute = js.native
    
    /**
      * Returns true if the given object is an instance of LocalGatewayRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/localGatewayRoute", "LocalGatewayRoute.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/localGatewayRoute.LocalGatewayRoute */ Boolean = js.native
  }
  
  @js.native
  trait LocalGatewayRouteArgs extends StObject {
    
    /**
      * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: Input[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: Input[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface Group.
      */
    val localGatewayVirtualInterfaceGroupId: Input[String] = js.native
  }
  object LocalGatewayRouteArgs {
    
    @scala.inline
    def apply(
      destinationCidrBlock: Input[String],
      localGatewayRouteTableId: Input[String],
      localGatewayVirtualInterfaceGroupId: Input[String]
    ): LocalGatewayRouteArgs = {
      val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalGatewayRouteArgs]
    }
    
    @scala.inline
    implicit class LocalGatewayRouteArgsMutableBuilder[Self <: LocalGatewayRouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceGroupId(value: Input[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalGatewayRouteState extends StObject {
    
    /**
      * IPv4 CIDR range used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Virtual Interface Group.
      */
    val localGatewayVirtualInterfaceGroupId: js.UndefOr[Input[String]] = js.native
  }
  object LocalGatewayRouteState {
    
    @scala.inline
    def apply(): LocalGatewayRouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalGatewayRouteState]
    }
    
    @scala.inline
    implicit class LocalGatewayRouteStateMutableBuilder[Self <: LocalGatewayRouteState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "localGatewayRouteTableId", js.undefined)
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceGroupId(value: Input[String]): Self = StObject.set(x, "localGatewayVirtualInterfaceGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayVirtualInterfaceGroupIdUndefined: Self = StObject.set(x, "localGatewayVirtualInterfaceGroupId", js.undefined)
    }
  }
}
