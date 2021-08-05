package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/route53/zoneAssociation", "ZoneAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ZoneAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ZoneAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ZoneAssociation]
    inline def get(name: String, id: Input[ID], state: ZoneAssociationState): ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ZoneAssociation]
    inline def get(name: String, id: Input[ID], state: ZoneAssociationState, opts: CustomResourceOptions): ZoneAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ZoneAssociation]
    
    /**
      * Returns true if the given object is an instance of ZoneAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/zoneAssociation.ZoneAssociation */ Boolean]
  }
  
  trait ZoneAssociationArgs extends StObject {
    
    /**
      * The VPC to associate with the private hosted zone.
      */
    val vpcId: Input[String]
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private hosted zone to associate.
      */
    val zoneId: Input[String]
  }
  object ZoneAssociationArgs {
    
    inline def apply(vpcId: Input[String], zoneId: Input[String]): ZoneAssociationArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoneAssociationArgs]
    }
    
    extension [Self <: ZoneAssociationArgs](x: Self) {
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      inline def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      inline def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoneAssociationState extends StObject {
    
    /**
      * The account ID of the account that created the hosted zone.
      */
    val owningAccount: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC to associate with the private hosted zone.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The VPC's region. Defaults to the region of the AWS provider.
      */
    val vpcRegion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The private hosted zone to associate.
      */
    val zoneId: js.UndefOr[Input[String]] = js.undefined
  }
  object ZoneAssociationState {
    
    inline def apply(): ZoneAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneAssociationState]
    }
    
    extension [Self <: ZoneAssociationState](x: Self) {
      
      inline def setOwningAccount(value: Input[String]): Self = StObject.set(x, "owningAccount", value.asInstanceOf[js.Any])
      
      inline def setOwningAccountUndefined: Self = StObject.set(x, "owningAccount", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setVpcRegion(value: Input[String]): Self = StObject.set(x, "vpcRegion", value.asInstanceOf[js.Any])
      
      inline def setVpcRegionUndefined: Self = StObject.set(x, "vpcRegion", js.undefined)
      
      inline def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
