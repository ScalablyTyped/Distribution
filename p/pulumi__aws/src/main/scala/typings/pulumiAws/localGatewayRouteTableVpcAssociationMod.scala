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

object localGatewayRouteTableVpcAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation", "LocalGatewayRouteTableVpcAssociation")
  @js.native
  class LocalGatewayRouteTableVpcAssociation protected () extends CustomResource {
    /**
      * Create a LocalGatewayRouteTableVpcAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs) = this()
    def this(name: String, args: LocalGatewayRouteTableVpcAssociationArgs, opts: CustomResourceOptions) = this()
    
    val localGatewayId: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object LocalGatewayRouteTableVpcAssociation {
    
    @JSImport("@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation", "LocalGatewayRouteTableVpcAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LocalGatewayRouteTableVpcAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LocalGatewayRouteTableVpcAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LocalGatewayRouteTableVpcAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LocalGatewayRouteTableVpcAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LocalGatewayRouteTableVpcAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: LocalGatewayRouteTableVpcAssociationState): LocalGatewayRouteTableVpcAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LocalGatewayRouteTableVpcAssociation]
    @scala.inline
    def get(
      name: String,
      id: Input[ID],
      state: LocalGatewayRouteTableVpcAssociationState,
      opts: CustomResourceOptions
    ): LocalGatewayRouteTableVpcAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LocalGatewayRouteTableVpcAssociation]
    
    /**
      * Returns true if the given object is an instance of LocalGatewayRouteTableVpcAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation.LocalGatewayRouteTableVpcAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/localGatewayRouteTableVpcAssociation.LocalGatewayRouteTableVpcAssociation */ Boolean]
  }
  
  trait LocalGatewayRouteTableVpcAssociationArgs extends StObject {
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: Input[String]
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: Input[String]
  }
  object LocalGatewayRouteTableVpcAssociationArgs {
    
    @scala.inline
    def apply(localGatewayRouteTableId: Input[String], vpcId: Input[String]): LocalGatewayRouteTableVpcAssociationArgs = {
      val __obj = js.Dynamic.literal(localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociationArgs]
    }
    
    @scala.inline
    implicit class LocalGatewayRouteTableVpcAssociationArgsMutableBuilder[Self <: LocalGatewayRouteTableVpcAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalGatewayRouteTableVpcAssociationState extends StObject {
    
    val localGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Local Gateway Route Table.
      */
    val localGatewayRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object LocalGatewayRouteTableVpcAssociationState {
    
    @scala.inline
    def apply(): LocalGatewayRouteTableVpcAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalGatewayRouteTableVpcAssociationState]
    }
    
    @scala.inline
    implicit class LocalGatewayRouteTableVpcAssociationStateMutableBuilder[Self <: LocalGatewayRouteTableVpcAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocalGatewayId(value: Input[String]): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      @scala.inline
      def setLocalGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "localGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayRouteTableIdUndefined: Self = StObject.set(x, "localGatewayRouteTableId", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
