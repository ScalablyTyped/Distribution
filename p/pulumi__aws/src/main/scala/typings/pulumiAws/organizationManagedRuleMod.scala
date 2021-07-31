package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationManagedRuleMod {
  
  @JSImport("@pulumi/aws/cfg/organizationManagedRule", "OrganizationManagedRule")
  @js.native
  class OrganizationManagedRule protected () extends CustomResource {
    /**
      * Create a OrganizationManagedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationManagedRuleArgs) = this()
    def this(name: String, args: OrganizationManagedRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the rule
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of the rule
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the rule
      */
    val name: Output_[String] = js.native
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: Output_[js.UndefOr[String]] = js.native
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
      */
    val ruleIdentifier: Output_[String] = js.native
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object OrganizationManagedRule {
    
    @JSImport("@pulumi/aws/cfg/organizationManagedRule", "OrganizationManagedRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationManagedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[OrganizationManagedRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationManagedRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[OrganizationManagedRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[OrganizationManagedRule]
    
    /**
      * Returns true if the given object is an instance of OrganizationManagedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean]
  }
  
  trait OrganizationManagedRuleArgs extends StObject {
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
      */
    val ruleIdentifier: Input[String]
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationManagedRuleArgs {
    
    @scala.inline
    def apply(ruleIdentifier: Input[String]): OrganizationManagedRuleArgs = {
      val __obj = js.Dynamic.literal(ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationManagedRuleArgs]
    }
    
    @scala.inline
    implicit class OrganizationManagedRuleArgsMutableBuilder[Self <: OrganizationManagedRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedAccounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedAccountsUndefined: Self = StObject.set(x, "excludedAccounts", js.undefined)
      
      @scala.inline
      def setExcludedAccountsVarargs(value: Input[String]*): Self = StObject.set(x, "excludedAccounts", js.Array(value :_*))
      
      @scala.inline
      def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      @scala.inline
      def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceIdScope(value: Input[String]): Self = StObject.set(x, "resourceIdScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdScopeUndefined: Self = StObject.set(x, "resourceIdScope", js.undefined)
      
      @scala.inline
      def setResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypesScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesScopesUndefined: Self = StObject.set(x, "resourceTypesScopes", js.undefined)
      
      @scala.inline
      def setResourceTypesScopesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypesScopes", js.Array(value :_*))
      
      @scala.inline
      def setRuleIdentifier(value: Input[String]): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyScope(value: Input[String]): Self = StObject.set(x, "tagKeyScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyScopeUndefined: Self = StObject.set(x, "tagKeyScope", js.undefined)
      
      @scala.inline
      def setTagValueScope(value: Input[String]): Self = StObject.set(x, "tagValueScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValueScopeUndefined: Self = StObject.set(x, "tagValueScope", js.undefined)
    }
  }
  
  trait OrganizationManagedRuleState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the rule
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the rule
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of AWS account identifiers to exclude from the rule
      */
    val excludedAccounts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A string in JSON format that is passed to the AWS Config Rule Lambda Function
      */
    val inputParameters: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
      */
    val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the rule
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the AWS resource to evaluate
      */
    val resourceIdScope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of types of AWS resources to evaluate
      */
    val resourceTypesScopes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
      */
    val ruleIdentifier: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tag key of AWS resources to evaluate
      */
    val tagKeyScope: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Tag value of AWS resources to evaluate
      */
    val tagValueScope: js.UndefOr[Input[String]] = js.undefined
  }
  object OrganizationManagedRuleState {
    
    @scala.inline
    def apply(): OrganizationManagedRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrganizationManagedRuleState]
    }
    
    @scala.inline
    implicit class OrganizationManagedRuleStateMutableBuilder[Self <: OrganizationManagedRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExcludedAccounts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "excludedAccounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedAccountsUndefined: Self = StObject.set(x, "excludedAccounts", js.undefined)
      
      @scala.inline
      def setExcludedAccountsVarargs(value: Input[String]*): Self = StObject.set(x, "excludedAccounts", js.Array(value :_*))
      
      @scala.inline
      def setInputParameters(value: Input[String]): Self = StObject.set(x, "inputParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputParametersUndefined: Self = StObject.set(x, "inputParameters", js.undefined)
      
      @scala.inline
      def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResourceIdScope(value: Input[String]): Self = StObject.set(x, "resourceIdScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdScopeUndefined: Self = StObject.set(x, "resourceIdScope", js.undefined)
      
      @scala.inline
      def setResourceTypesScopes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypesScopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesScopesUndefined: Self = StObject.set(x, "resourceTypesScopes", js.undefined)
      
      @scala.inline
      def setResourceTypesScopesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypesScopes", js.Array(value :_*))
      
      @scala.inline
      def setRuleIdentifier(value: Input[String]): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleIdentifierUndefined: Self = StObject.set(x, "ruleIdentifier", js.undefined)
      
      @scala.inline
      def setTagKeyScope(value: Input[String]): Self = StObject.set(x, "tagKeyScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyScopeUndefined: Self = StObject.set(x, "tagKeyScope", js.undefined)
      
      @scala.inline
      def setTagValueScope(value: Input[String]): Self = StObject.set(x, "tagValueScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValueScopeUndefined: Self = StObject.set(x, "tagValueScope", js.undefined)
    }
  }
}
