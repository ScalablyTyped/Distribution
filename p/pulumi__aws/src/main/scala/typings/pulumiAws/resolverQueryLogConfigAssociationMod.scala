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

object resolverQueryLogConfigAssociationMod {
  
  @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation")
  @js.native
  class ResolverQueryLogConfigAssociation protected () extends CustomResource {
    /**
      * Create a ResolverQueryLogConfigAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs) = this()
    def this(name: String, args: ResolverQueryLogConfigAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
      */
    val resolverQueryLogConfigId: Output_[String] = js.native
    
    /**
      * The ID of a VPC that you want this query logging configuration to log queries for.
      */
    val resourceId: Output_[String] = js.native
  }
  /* static members */
  object ResolverQueryLogConfigAssociation {
    
    /**
      * Get an existing ResolverQueryLogConfigAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverQueryLogConfigAssociationState): ResolverQueryLogConfigAssociation = js.native
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: ResolverQueryLogConfigAssociationState,
      opts: CustomResourceOptions
    ): ResolverQueryLogConfigAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverQueryLogConfigAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/resolverQueryLogConfigAssociation", "ResolverQueryLogConfigAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverQueryLogConfigAssociation.ResolverQueryLogConfigAssociation */ Boolean = js.native
  }
  
  @js.native
  trait ResolverQueryLogConfigAssociationArgs extends StObject {
    
    /**
      * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
      */
    val resolverQueryLogConfigId: Input[String] = js.native
    
    /**
      * The ID of a VPC that you want this query logging configuration to log queries for.
      */
    val resourceId: Input[String] = js.native
  }
  object ResolverQueryLogConfigAssociationArgs {
    
    @scala.inline
    def apply(resolverQueryLogConfigId: Input[String], resourceId: Input[String]): ResolverQueryLogConfigAssociationArgs = {
      val __obj = js.Dynamic.literal(resolverQueryLogConfigId = resolverQueryLogConfigId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverQueryLogConfigAssociationArgs]
    }
    
    @scala.inline
    implicit class ResolverQueryLogConfigAssociationArgsMutableBuilder[Self <: ResolverQueryLogConfigAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolverQueryLogConfigId(value: Input[String]): Self = StObject.set(x, "resolverQueryLogConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolverQueryLogConfigAssociationState extends StObject {
    
    /**
      * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
      */
    val resolverQueryLogConfigId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of a VPC that you want this query logging configuration to log queries for.
      */
    val resourceId: js.UndefOr[Input[String]] = js.native
  }
  object ResolverQueryLogConfigAssociationState {
    
    @scala.inline
    def apply(): ResolverQueryLogConfigAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverQueryLogConfigAssociationState]
    }
    
    @scala.inline
    implicit class ResolverQueryLogConfigAssociationStateMutableBuilder[Self <: ResolverQueryLogConfigAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolverQueryLogConfigId(value: Input[String]): Self = StObject.set(x, "resolverQueryLogConfigId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverQueryLogConfigIdUndefined: Self = StObject.set(x, "resolverQueryLogConfigId", js.undefined)
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    }
  }
}
