package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeTableMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable")
  @js.native
  class RouteTable protected () extends CustomResource {
    /**
      * Create a RouteTable resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableArgs) = this()
    def this(name: String, args: RouteTableArgs, opts: CustomResourceOptions) = this()
    
    /**
      * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
      */
    val arn: Output_[String] = js.native
    
    /**
      * Boolean whether this is the default association route table for the EC2 Transit Gateway.
      */
    val defaultAssociationRouteTable: Output_[Boolean] = js.native
    
    /**
      * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
      */
    val defaultPropagationRouteTable: Output_[Boolean] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[String] = js.native
  }
  /* static members */
  object RouteTable {
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID]): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState): RouteTable = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): RouteTable = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = js.native
  }
  
  @js.native
  trait RouteTableArgs extends StObject {
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Input[String] = js.native
  }
  object RouteTableArgs {
    
    @scala.inline
    def apply(transitGatewayId: Input[String]): RouteTableArgs = {
      val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTableArgs]
    }
    
    @scala.inline
    implicit class RouteTableArgsMutableBuilder[Self <: RouteTableArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteTableState extends StObject {
    
    /**
      * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean whether this is the default association route table for the EC2 Transit Gateway.
      */
    val defaultAssociationRouteTable: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
      */
    val defaultPropagationRouteTable: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.native
  }
  object RouteTableState {
    
    @scala.inline
    def apply(): RouteTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteTableState]
    }
    
    @scala.inline
    implicit class RouteTableStateMutableBuilder[Self <: RouteTableState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDefaultAssociationRouteTable(value: Input[Boolean]): Self = StObject.set(x, "defaultAssociationRouteTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAssociationRouteTableUndefined: Self = StObject.set(x, "defaultAssociationRouteTable", js.undefined)
      
      @scala.inline
      def setDefaultPropagationRouteTable(value: Input[Boolean]): Self = StObject.set(x, "defaultPropagationRouteTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPropagationRouteTableUndefined: Self = StObject.set(x, "defaultPropagationRouteTable", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
