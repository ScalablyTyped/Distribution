package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcEndpointRouteTableAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation")
  @js.native
  class VpcEndpointRouteTableAssociation protected () extends CustomResource {
    /**
      * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointRouteTableAssociationArgs) = this()
    def this(name: String, args: VpcEndpointRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: Output_[String] = js.native
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: Output_[String] = js.native
  }
  /* static members */
  object VpcEndpointRouteTableAssociation {
    
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcEndpointRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointRouteTableAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcEndpointRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointRouteTableAssociation]
    inline def get(name: String, id: Input[ID], state: VpcEndpointRouteTableAssociationState): VpcEndpointRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointRouteTableAssociation]
    inline def get(
      name: String,
      id: Input[ID],
      state: VpcEndpointRouteTableAssociationState,
      opts: CustomResourceOptions
    ): VpcEndpointRouteTableAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointRouteTableAssociation]
    
    /**
      * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean]
  }
  
  trait VpcEndpointRouteTableAssociationArgs extends StObject {
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: Input[String]
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: Input[String]
  }
  object VpcEndpointRouteTableAssociationArgs {
    
    inline def apply(routeTableId: Input[String], vpcEndpointId: Input[String]): VpcEndpointRouteTableAssociationArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointRouteTableAssociationArgs]
    }
    
    extension [Self <: VpcEndpointRouteTableAssociationArgs](x: Self) {
      
      inline def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcEndpointRouteTableAssociationState extends StObject {
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcEndpointRouteTableAssociationState {
    
    inline def apply(): VpcEndpointRouteTableAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointRouteTableAssociationState]
    }
    
    extension [Self <: VpcEndpointRouteTableAssociationState](x: Self) {
      
      inline def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      inline def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    }
  }
}
