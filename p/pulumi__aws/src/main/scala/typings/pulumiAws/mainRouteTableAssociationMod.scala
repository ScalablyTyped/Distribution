package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainRouteTableAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/mainRouteTableAssociation", "MainRouteTableAssociation")
  @js.native
  class MainRouteTableAssociation protected () extends CustomResource {
    /**
      * Create a MainRouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MainRouteTableAssociationArgs) = this()
    def this(name: String, args: MainRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Used internally, see __Notes__ below
      */
    val originalRouteTableId: Output_[String] = js.native
    
    /**
      * The ID of the Route Table to set as the new
      * main route table for the target VPC
      */
    val routeTableId: Output_[String] = js.native
    
    /**
      * The ID of the VPC whose main route table should be set
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object MainRouteTableAssociation {
    
    @JSImport("@pulumi/aws/ec2/mainRouteTableAssociation", "MainRouteTableAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MainRouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): MainRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MainRouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MainRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MainRouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MainRouteTableAssociationState): MainRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MainRouteTableAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: MainRouteTableAssociationState, opts: CustomResourceOptions): MainRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MainRouteTableAssociation]
    
    /**
      * Returns true if the given object is an instance of MainRouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/mainRouteTableAssociation.MainRouteTableAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/mainRouteTableAssociation.MainRouteTableAssociation */ Boolean]
  }
  
  trait MainRouteTableAssociationArgs extends StObject {
    
    /**
      * The ID of the Route Table to set as the new
      * main route table for the target VPC
      */
    val routeTableId: Input[String]
    
    /**
      * The ID of the VPC whose main route table should be set
      */
    val vpcId: Input[String]
  }
  object MainRouteTableAssociationArgs {
    
    @scala.inline
    def apply(routeTableId: Input[String], vpcId: Input[String]): MainRouteTableAssociationArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainRouteTableAssociationArgs]
    }
    
    @scala.inline
    implicit class MainRouteTableAssociationArgsMutableBuilder[Self <: MainRouteTableAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MainRouteTableAssociationState extends StObject {
    
    /**
      * Used internally, see __Notes__ below
      */
    val originalRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Route Table to set as the new
      * main route table for the target VPC
      */
    val routeTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC whose main route table should be set
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object MainRouteTableAssociationState {
    
    @scala.inline
    def apply(): MainRouteTableAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MainRouteTableAssociationState]
    }
    
    @scala.inline
    implicit class MainRouteTableAssociationStateMutableBuilder[Self <: MainRouteTableAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalRouteTableId(value: Input[String]): Self = StObject.set(x, "originalRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalRouteTableIdUndefined: Self = StObject.set(x, "originalRouteTableId", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
