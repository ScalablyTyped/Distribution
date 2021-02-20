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
    
    /**
      * Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState): VpcAssociationAuthorization = js.native
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcAssociationAuthorizationState, opts: CustomResourceOptions): VpcAssociationAuthorization = js.native
    
    /**
      * Returns true if the given object is an instance of VpcAssociationAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/vpcAssociationAuthorization", "VpcAssociationAuthorization.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/vpcAssociationAuthorization.VpcAssociationAuthorization */ Boolean = js.native
  }
  
  @js.native
  trait VpcAssociationAuthorizationArgs extends StObject {
    
    /**
      * The VPC to authorize for association with the private hosted zone.
      */
    val vpcId: Input[String] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    val zoneId: Input[String] = js.native
  }
  object VpcAssociationAuthorizationArgs {
    
    @scala.inline
    def apply(vpcId: Input[String], zoneId: Input[String]): VpcAssociationAuthorizationArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcAssociationAuthorizationArgs]
    }
    
    @scala.inline
    implicit class VpcAssociationAuthorizationArgsMutableBuilder[Self <: VpcAssociationAuthorizationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpcAssociationAuthorizationState extends StObject {
    
    /**
      * The VPC to authorize for association with the private hosted zone.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the private hosted zone that you want to authorize associating a VPC with.
      */
    val zoneId: js.UndefOr[Input[String]] = js.native
  }
  object VpcAssociationAuthorizationState {
    
    @scala.inline
    def apply(): VpcAssociationAuthorizationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcAssociationAuthorizationState]
    }
    
    @scala.inline
    implicit class VpcAssociationAuthorizationStateMutableBuilder[Self <: VpcAssociationAuthorizationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      @scala.inline
      def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
