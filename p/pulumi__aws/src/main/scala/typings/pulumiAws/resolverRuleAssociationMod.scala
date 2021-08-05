package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverRuleAssociationMod {
  
  @JSImport("@pulumi/aws/route53/resolverRuleAssociation", "ResolverRuleAssociation")
  @js.native
  class ResolverRuleAssociation protected () extends CustomResource {
    /**
      * Create a ResolverRuleAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverRuleAssociationArgs) = this()
    def this(name: String, args: ResolverRuleAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A name for the association that you're creating between a resolver rule and a VPC.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of the resolver rule that you want to associate with the VPC.
      */
    val resolverRuleId: Output_[String] = js.native
    
    /**
      * The ID of the VPC that you want to associate the resolver rule with.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object ResolverRuleAssociation {
    
    @JSImport("@pulumi/aws/route53/resolverRuleAssociation", "ResolverRuleAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverRuleAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResolverRuleAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverRuleAssociation]
    inline def get(name: String, id: Input[ID], state: ResolverRuleAssociationState): ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResolverRuleAssociation]
    inline def get(name: String, id: Input[ID], state: ResolverRuleAssociationState, opts: CustomResourceOptions): ResolverRuleAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverRuleAssociation]
    
    /**
      * Returns true if the given object is an instance of ResolverRuleAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverRuleAssociation.ResolverRuleAssociation */ Boolean]
  }
  
  trait ResolverRuleAssociationArgs extends StObject {
    
    /**
      * A name for the association that you're creating between a resolver rule and a VPC.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the resolver rule that you want to associate with the VPC.
      */
    val resolverRuleId: Input[String]
    
    /**
      * The ID of the VPC that you want to associate the resolver rule with.
      */
    val vpcId: Input[String]
  }
  object ResolverRuleAssociationArgs {
    
    inline def apply(resolverRuleId: Input[String], vpcId: Input[String]): ResolverRuleAssociationArgs = {
      val __obj = js.Dynamic.literal(resolverRuleId = resolverRuleId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverRuleAssociationArgs]
    }
    
    extension [Self <: ResolverRuleAssociationArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResolverRuleId(value: Input[String]): Self = StObject.set(x, "resolverRuleId", value.asInstanceOf[js.Any])
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolverRuleAssociationState extends StObject {
    
    /**
      * A name for the association that you're creating between a resolver rule and a VPC.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the resolver rule that you want to associate with the VPC.
      */
    val resolverRuleId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC that you want to associate the resolver rule with.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object ResolverRuleAssociationState {
    
    inline def apply(): ResolverRuleAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverRuleAssociationState]
    }
    
    extension [Self <: ResolverRuleAssociationState](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResolverRuleId(value: Input[String]): Self = StObject.set(x, "resolverRuleId", value.asInstanceOf[js.Any])
      
      inline def setResolverRuleIdUndefined: Self = StObject.set(x, "resolverRuleId", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
