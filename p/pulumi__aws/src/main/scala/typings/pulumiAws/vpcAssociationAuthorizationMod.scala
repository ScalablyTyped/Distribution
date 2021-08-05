package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcAssociationAuthorizationMod {
  
  @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization")
  @js.native
  class VpcAssociationAuthorization protected () extends CustomResource {
    /**
      * Create a VpcAssociationAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAssociationAuthorizationArgs) = this()
    def this(name: String, args: VpcAssociationAuthorizationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The VPC to authorize for association with the private hosted zone.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: Output_[String] = js.native
    
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object VpcAssociationAuthorization {
    
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcAssociationAuthorization]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAssociationAuthorization]
    inline def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState): VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcAssociationAuthorization]
    inline def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState, opts: CustomResourceOptions): VpcAssociationAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAssociationAuthorization]
    
    /**
      * Returns true if the given object is an instance of VpcAssociationAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean]
  }
  
  trait VpcAssociationAuthorizationArgs extends StObject {
    
    /**
      * The VPC to authorize for association with the private hosted zone.
      */
    val vpcId: Input[String]
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    val zoneId: Input[String]
  }
  object VpcAssociationAuthorizationArgs {
    
    inline def apply(vpcId: Input[String], zoneId: Input[String]): VpcAssociationAuthorizationArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcAssociationAuthorizationArgs]
    }
    
    extension [Self <: VpcAssociationAuthorizationArgs](x: Self) {
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      inline def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      inline def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcAssociationAuthorizationState extends StObject {
    
    /**
      * The VPC to authorize for association with the private hosted zone.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    val zoneId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcAssociationAuthorizationState {
    
    inline def apply(): VpcAssociationAuthorizationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcAssociationAuthorizationState]
    }
    
    extension [Self <: VpcAssociationAuthorizationState](x: Self) {
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      inline def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      inline def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
