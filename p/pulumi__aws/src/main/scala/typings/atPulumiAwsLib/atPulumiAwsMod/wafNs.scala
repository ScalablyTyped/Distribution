package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "waf")
@js.native
object wafNs extends js.Object {
  @js.native
  class ByteMatchSet protected ()
    extends atPulumiAwsLib.wafMod.ByteMatchSet {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class GeoMatchSet protected ()
    extends atPulumiAwsLib.wafMod.GeoMatchSet {
    /**
      * Create a GeoMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class IpSet protected ()
    extends atPulumiAwsLib.wafMod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafIpSetMod.IpSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafIpSetMod.IpSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RateBasedRule protected ()
    extends atPulumiAwsLib.wafMod.RateBasedRule {
    /**
      * Create a RateBasedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RegexMatchSet protected ()
    extends atPulumiAwsLib.wafMod.RegexMatchSet {
    /**
      * Create a RegexMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RegexPatternSet protected ()
    extends atPulumiAwsLib.wafMod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Rule protected ()
    extends atPulumiAwsLib.wafMod.Rule {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleMod.RuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleMod.RuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RuleGroup protected ()
    extends atPulumiAwsLib.wafMod.RuleGroup {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleGroupMod.RuleGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafRuleGroupMod.RuleGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SizeConstraintSet protected ()
    extends atPulumiAwsLib.wafMod.SizeConstraintSet {
    /**
      * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SqlInjectionMatchSet protected ()
    extends atPulumiAwsLib.wafMod.SqlInjectionMatchSet {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class WebAcl protected ()
    extends atPulumiAwsLib.wafMod.WebAcl {
    /**
      * Create a WebAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.wafWebAclMod.WebAclArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafWebAclMod.WebAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class XssMatchSet protected ()
    extends atPulumiAwsLib.wafMod.XssMatchSet {
    /**
      * Create a XssMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafXssMatchSetMod.XssMatchSetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.wafXssMatchSetMod.XssMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object ByteMatchSet extends js.Object {
    /**
      * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSetState
    ): atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafByteMatchSetMod.ByteMatchSet = js.native
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object GeoMatchSet extends js.Object {
    /**
      * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSetState
    ): atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafGeoMatchSetMod.GeoMatchSet = js.native
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/geoMatchSet.GeoMatchSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IpSet extends js.Object {
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafIpSetMod.IpSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafIpSetMod.IpSetState
    ): atPulumiAwsLib.wafIpSetMod.IpSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafIpSetMod.IpSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafIpSetMod.IpSet = js.native
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ipSet.IpSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RateBasedRule extends js.Object {
    /**
      * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleState
    ): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafRateBasedRuleMod.RateBasedRule = js.native
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RegexMatchSet extends js.Object {
    /**
      * Get an existing RegexMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSetState
    ): atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafRegexMatchSetMod.RegexMatchSet = js.native
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexMatchSet.RegexMatchSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RegexPatternSet extends js.Object {
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSetState
    ): atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafRegexPatternSetMod.RegexPatternSet = js.native
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexPatternSet.RegexPatternSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRuleMod.Rule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRuleMod.RuleState
    ): atPulumiAwsLib.wafRuleMod.Rule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRuleMod.RuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafRuleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rule.Rule */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RuleGroup extends js.Object {
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRuleGroupMod.RuleGroupState
    ): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafRuleGroupMod.RuleGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafRuleGroupMod.RuleGroup = js.native
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ruleGroup.RuleGroup */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SizeConstraintSet extends js.Object {
    /**
      * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSetState
    ): atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sizeConstraintSet.SizeConstraintSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SqlInjectionMatchSet extends js.Object {
    /**
      * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState
    ): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sqlInjectionMatchSet.SqlInjectionMatchSet */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WebAcl extends js.Object {
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafWebAclMod.WebAclState
    ): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafWebAclMod.WebAclState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/webAcl.WebAcl */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object XssMatchSet extends js.Object {
    /**
      * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafXssMatchSetMod.XssMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafXssMatchSetMod.XssMatchSetState
    ): atPulumiAwsLib.wafXssMatchSetMod.XssMatchSet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.wafXssMatchSetMod.XssMatchSetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.wafXssMatchSetMod.XssMatchSet = js.native
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/xssMatchSet.XssMatchSet */ scala.Boolean = js.native
  }
  
}

