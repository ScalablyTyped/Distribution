package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2transitgateway/routeTable", "RouteTable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteTable resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RouteTable]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteTable]
    inline def get(name: String, id: Input[ID], state: RouteTableState): RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouteTable]
    inline def get(name: String, id: Input[ID], state: RouteTableState, opts: CustomResourceOptions): RouteTable = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteTable]
    
    /**
      * Returns true if the given object is an instance of RouteTable.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTable.RouteTable */ Boolean]
  }
  
  trait RouteTableArgs extends StObject {
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Input[String]
  }
  object RouteTableArgs {
    
    inline def apply(transitGatewayId: Input[String]): RouteTableArgs = {
      val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTableArgs]
    }
    
    extension [Self <: RouteTableArgs](x: Self) {
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteTableState extends StObject {
    
    /**
      * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean whether this is the default association route table for the EC2 Transit Gateway.
      */
    val defaultAssociationRouteTable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
      */
    val defaultPropagationRouteTable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway Route Table.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteTableState {
    
    inline def apply(): RouteTableState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteTableState]
    }
    
    extension [Self <: RouteTableState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDefaultAssociationRouteTable(value: Input[Boolean]): Self = StObject.set(x, "defaultAssociationRouteTable", value.asInstanceOf[js.Any])
      
      inline def setDefaultAssociationRouteTableUndefined: Self = StObject.set(x, "defaultAssociationRouteTable", js.undefined)
      
      inline def setDefaultPropagationRouteTable(value: Input[Boolean]): Self = StObject.set(x, "defaultPropagationRouteTable", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropagationRouteTableUndefined: Self = StObject.set(x, "defaultPropagationRouteTable", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    }
  }
}
