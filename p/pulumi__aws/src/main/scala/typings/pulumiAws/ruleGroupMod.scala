package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.networkfirewall.RuleGroupRuleGroup
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleGroupMod {
  
  @JSImport("@pulumi/aws/networkfirewall/ruleGroup", "RuleGroup")
  @js.native
  class RuleGroup protected () extends CustomResource {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the rule group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
      */
    val capacity: Output_[Double] = js.native
    
    /**
      * A friendly description of the rule group.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A friendly name of the rule group.
      */
    val name: Output_[String] = js.native
    
    /**
      * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
      */
    val ruleGroup: Output_[RuleGroupRuleGroup] = js.native
    
    /**
      * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `ruleGroup` is specified.
      */
    val rules: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
      */
    val `type`: Output_[String] = js.native
    
    /**
      * A string token used when updating the rule group.
      */
    val updateToken: Output_[String] = js.native
  }
  /* static members */
  object RuleGroup {
    
    @JSImport("@pulumi/aws/networkfirewall/ruleGroup", "RuleGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleGroupState): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RuleGroup]
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/ruleGroup.RuleGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/networkfirewall/ruleGroup.RuleGroup */ Boolean]
  }
  
  trait RuleGroupArgs extends StObject {
    
    /**
      * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
      */
    val capacity: Input[Double]
    
    /**
      * A friendly description of the rule group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the rule group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
      */
    val ruleGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.networkfirewall.RuleGroupRuleGroup]] = js.undefined
    
    /**
      * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `ruleGroup` is specified.
      */
    val rules: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
      */
    val `type`: Input[String]
  }
  object RuleGroupArgs {
    
    @scala.inline
    def apply(capacity: Input[Double], `type`: Input[String]): RuleGroupArgs = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleGroupArgs]
    }
    
    @scala.inline
    implicit class RuleGroupArgsMutableBuilder[Self <: RuleGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: Input[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRuleGroup(value: Input[typings.pulumiAws.inputMod.networkfirewall.RuleGroupRuleGroup]): Self = StObject.set(x, "ruleGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleGroupUndefined: Self = StObject.set(x, "ruleGroup", js.undefined)
      
      @scala.inline
      def setRules(value: Input[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleGroupState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the rule group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of operating resources that this rule group can use. For a stateless rule group, the capacity required is the sum of the capacity requirements of the individual rules. For a stateful rule group, the minimum capacity required is the number of individual rules.
      */
    val capacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * A friendly description of the rule group.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name of the rule group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A configuration block that defines the rule group rules. Required unless `rules` is specified. See Rule Group below for details.
      */
    val ruleGroup: js.UndefOr[Input[typings.pulumiAws.inputMod.networkfirewall.RuleGroupRuleGroup]] = js.undefined
    
    /**
      * The stateful rule group rules specifications in Suricata file format, with one rule per line. Use this to import your existing Suricata compatible rule groups. Required unless `ruleGroup` is specified.
      */
    val rules: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether the rule group is stateless (containing stateless rules) or stateful (containing stateful rules). Valid values include: `STATEFUL` or `STATELESS`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A string token used when updating the rule group.
      */
    val updateToken: js.UndefOr[Input[String]] = js.undefined
  }
  object RuleGroupState {
    
    @scala.inline
    def apply(): RuleGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleGroupState]
    }
    
    @scala.inline
    implicit class RuleGroupStateMutableBuilder[Self <: RuleGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCapacity(value: Input[Double]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRuleGroup(value: Input[typings.pulumiAws.inputMod.networkfirewall.RuleGroupRuleGroup]): Self = StObject.set(x, "ruleGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleGroupUndefined: Self = StObject.set(x, "ruleGroup", js.undefined)
      
      @scala.inline
      def setRules(value: Input[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUpdateToken(value: Input[String]): Self = StObject.set(x, "updateToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTokenUndefined: Self = StObject.set(x, "updateToken", js.undefined)
    }
  }
}
