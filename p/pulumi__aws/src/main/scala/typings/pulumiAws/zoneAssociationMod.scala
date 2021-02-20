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

object zoneAssociationMod {
  
  @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation")
  @js.native
  class ZoneAssociation protected () extends CustomResource {
    /**
      * Create a ZoneAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ZoneAssociationArgs) = this()
    def this(name: String, args: ZoneAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The account ID of the account that created the hosted zone.
      */
    val owningAccount: Output_[String] = js.native
    
    /**
      * The VPC to associate with the private hosted zone.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: Output_[String] = js.native
    
    /**
      * The private hosted zone to associate.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object ZoneAssociation {
    
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): ZoneAssociation = js.native
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ZoneAssociation = js.native
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState): ZoneAssociation = js.native
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): ZoneAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = js.native
  }
  
  @js.native
  trait ZoneAssociationArgs extends StObject {
    
    /**
      * The VPC to associate with the private hosted zone.
      */
    val vpcId: Input[String] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The private hosted zone to associate.
      */
    val zoneId: Input[String] = js.native
  }
  object ZoneAssociationArgs {
    
    @scala.inline
    def apply(vpcId: Input[String], zoneId: Input[String]): ZoneAssociationArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoneAssociationArgs]
    }
    
    @scala.inline
    implicit class ZoneAssociationArgsMutableBuilder[Self <: ZoneAssociationArgs] (val x: Self) extends AnyVal {
      
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
  trait ZoneAssociationState extends StObject {
    
    /**
      * The account ID of the account that created the hosted zone.
      */
    val owningAccount: js.UndefOr[Input[String]] = js.native
    
    /**
      * The VPC to associate with the private hosted zone.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The private hosted zone to associate.
      */
    val zoneId: js.UndefOr[Input[String]] = js.native
  }
  object ZoneAssociationState {
    
    @scala.inline
    def apply(): ZoneAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneAssociationState]
    }
    
    @scala.inline
    implicit class ZoneAssociationStateMutableBuilder[Self <: ZoneAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwningAccount(value: Input[String]): Self = StObject.set(x, "owningAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwningAccountUndefined: Self = StObject.set(x, "owningAccount", js.undefined)
      
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
