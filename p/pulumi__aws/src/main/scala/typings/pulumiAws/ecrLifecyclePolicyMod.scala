package typings.pulumiAws

import typings.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ecrLifecyclePolicyMod {
  
  @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy")
  @js.native
  class LifecyclePolicy protected () extends CustomResource {
    /**
      * Create a LifecyclePolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LifecyclePolicyArgs) = this()
    def this(name: String, args: LifecyclePolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
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
  object LifecyclePolicy {
    
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): LifecyclePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
  @js.native
  trait LifecyclePolicyArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
      */
    val policy: Input[String | LifecyclePolicyDocument] = js.native
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: Input[String] = js.native
  }
  object LifecyclePolicyArgs {
    
    @scala.inline
    def apply(policy: Input[String | LifecyclePolicyDocument], repository: Input[String]): LifecyclePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyArgs]
    }
    
    @scala.inline
    implicit class LifecyclePolicyArgsMutableBuilder[Self <: LifecyclePolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | LifecyclePolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LifecyclePolicyState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
      */
    val policy: js.UndefOr[Input[String | LifecyclePolicyDocument]] = js.native
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: js.UndefOr[Input[String]] = js.native
  }
  object LifecyclePolicyState {
    
    @scala.inline
    def apply(): LifecyclePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecyclePolicyState]
    }
    
    @scala.inline
    implicit class LifecyclePolicyStateMutableBuilder[Self <: LifecyclePolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: Input[String | LifecyclePolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
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
