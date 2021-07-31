package typings.pulumiAws

import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryPolicyMod {
  
  @JSImport("@pulumi/aws/ecr/repositoryPolicy", "RepositoryPolicy")
  @js.native
  class RepositoryPolicy protected () extends CustomResource {
    /**
      * Create a RepositoryPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RepositoryPolicyArgs) = this()
    def this(name: String, args: RepositoryPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: Output_[String] = js.native
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: Output_[String] = js.native
  }
  /* static members */
  object RepositoryPolicy {
    
    @JSImport("@pulumi/aws/ecr/repositoryPolicy", "RepositoryPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RepositoryPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RepositoryPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RepositoryPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: RepositoryPolicyState): RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RepositoryPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: RepositoryPolicyState, opts: CustomResourceOptions): RepositoryPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RepositoryPolicy]
    
    /**
      * Returns true if the given object is an instance of RepositoryPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/repositoryPolicy.RepositoryPolicy */ Boolean]
  }
  
  trait RepositoryPolicyArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: Input[String | PolicyDocument]
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: Input[String]
  }
  object RepositoryPolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String | PolicyDocument], repository: Input[String]): RepositoryPolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepositoryPolicyArgs]
    }
    
    @scala.inline
    implicit class RepositoryPolicyArgsMutableBuilder[Self <: RepositoryPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  trait RepositoryPolicyState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string.
      */
    val policy: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: js.UndefOr[Input[String]] = js.undefined
  }
  object RepositoryPolicyState {
    
    @scala.inline
    def apply(): RepositoryPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepositoryPolicyState]
    }
    
    @scala.inline
    implicit class RepositoryPolicyStateMutableBuilder[Self <: RepositoryPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | PolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setRegistryId(value: Input[String]): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    }
  }
}
