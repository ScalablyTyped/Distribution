package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.dlm.LifecyclePolicyPolicyDetails
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lifecyclePolicyMod {
  
  @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy")
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
      * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A description for the DLM lifecycle policy.
      */
    val description: Output_[String] = js.native
    
    /**
      * The ARN of an IAM role that is able to be assumed by the DLM service.
      */
    val executionRoleArn: Output_[String] = js.native
    
    /**
      * See the `policyDetails` configuration block. Max of 1.
      */
    val policyDetails: Output_[LifecyclePolicyPolicyDetails] = js.native
    
    /**
      * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
      */
    val state: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
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
    @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState): LifecyclePolicy = js.native
    @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LifecyclePolicyState, opts: CustomResourceOptions): LifecyclePolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LifecyclePolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/dlm/lifecyclePolicy", "LifecyclePolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dlm/lifecyclePolicy.LifecyclePolicy */ Boolean = js.native
  }
  
  @js.native
  trait LifecyclePolicyArgs extends StObject {
    
    /**
      * A description for the DLM lifecycle policy.
      */
    val description: Input[String] = js.native
    
    /**
      * The ARN of an IAM role that is able to be assumed by the DLM service.
      */
    val executionRoleArn: Input[String] = js.native
    
    /**
      * See the `policyDetails` configuration block. Max of 1.
      */
    val policyDetails: Input[typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails] = js.native
    
    /**
      * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object LifecyclePolicyArgs {
    
    @scala.inline
    def apply(
      description: Input[String],
      executionRoleArn: Input[String],
      policyDetails: Input[typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails]
    ): LifecyclePolicyArgs = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], executionRoleArn = executionRoleArn.asInstanceOf[js.Any], policyDetails = policyDetails.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyArgs]
    }
    
    @scala.inline
    implicit class LifecyclePolicyArgsMutableBuilder[Self <: LifecyclePolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDetails(value: Input[typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails]): Self = StObject.set(x, "policyDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait LifecyclePolicyState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A description for the DLM lifecycle policy.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of an IAM role that is able to be assumed by the DLM service.
      */
    val executionRoleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * See the `policyDetails` configuration block. Max of 1.
      */
    val policyDetails: js.UndefOr[Input[typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails]] = js.native
    
    /**
      * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExecutionRoleArn(value: Input[String]): Self = StObject.set(x, "executionRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutionRoleArnUndefined: Self = StObject.set(x, "executionRoleArn", js.undefined)
      
      @scala.inline
      def setPolicyDetails(value: Input[typings.pulumiAws.inputMod.dlm.LifecyclePolicyPolicyDetails]): Self = StObject.set(x, "policyDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyDetailsUndefined: Self = StObject.set(x, "policyDetails", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
