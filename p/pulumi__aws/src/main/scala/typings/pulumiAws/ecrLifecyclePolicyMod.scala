package typings.pulumiAws

import typings.pulumiAws.lifecyclePolicyDocumentMod.LifecyclePolicyDocument
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ecr/lifecyclePolicy", "LifecyclePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LifecyclePolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: LifecyclePolicyState): LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LifecyclePolicy]
    inline def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): LifecyclePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LifecyclePolicy]
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ecr/lifecyclePolicy.LifecyclePolicy */ Boolean]
  }
  
  trait LifecyclePolicyArgs extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
      */
    val policy: Input[String | LifecyclePolicyDocument]
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: Input[String]
  }
  object LifecyclePolicyArgs {
    
    inline def apply(policy: Input[String | LifecyclePolicyDocument], repository: Input[String]): LifecyclePolicyArgs = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyArgs]
    }
    
    extension [Self <: LifecyclePolicyArgs](x: Self) {
      
      inline def setPolicy(value: Input[String | LifecyclePolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    }
  }
  
  trait LifecyclePolicyState extends StObject {
    
    /**
      * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
      */
    val policy: js.UndefOr[Input[String | LifecyclePolicyDocument]] = js.undefined
    
    /**
      * The registry ID where the repository was created.
      */
    val registryId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the repository to apply the policy.
      */
    val repository: js.UndefOr[Input[String]] = js.undefined
  }
  object LifecyclePolicyState {
    
    inline def apply(): LifecyclePolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LifecyclePolicyState]
    }
    
    extension [Self <: LifecyclePolicyState](x: Self) {
      
      inline def setPolicy(value: Input[String | LifecyclePolicyDocument]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setRegistryId(value: Input[String]): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
      
      inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
      
      inline def setRepository(value: Input[String]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    }
  }
}
