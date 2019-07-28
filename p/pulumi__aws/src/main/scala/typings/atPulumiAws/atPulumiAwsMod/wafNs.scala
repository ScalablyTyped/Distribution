package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.wafByteMatchSetMod.ByteMatchSetArgs
import typings.atPulumiAws.wafByteMatchSetMod.ByteMatchSetState
import typings.atPulumiAws.wafGeoMatchSetMod.GeoMatchSetArgs
import typings.atPulumiAws.wafGeoMatchSetMod.GeoMatchSetState
import typings.atPulumiAws.wafGetRuleMod.GetRuleArgs
import typings.atPulumiAws.wafGetRuleMod.GetRuleResult
import typings.atPulumiAws.wafGetWebAclMod.GetWebAclArgs
import typings.atPulumiAws.wafGetWebAclMod.GetWebAclResult
import typings.atPulumiAws.wafIpSetMod.IpSetArgs
import typings.atPulumiAws.wafIpSetMod.IpSetState
import typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRuleArgs
import typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRuleState
import typings.atPulumiAws.wafRegexMatchSetMod.RegexMatchSetArgs
import typings.atPulumiAws.wafRegexMatchSetMod.RegexMatchSetState
import typings.atPulumiAws.wafRegexPatternSetMod.RegexPatternSetArgs
import typings.atPulumiAws.wafRegexPatternSetMod.RegexPatternSetState
import typings.atPulumiAws.wafRuleGroupMod.RuleGroupArgs
import typings.atPulumiAws.wafRuleGroupMod.RuleGroupState
import typings.atPulumiAws.wafRuleMod.RuleArgs
import typings.atPulumiAws.wafRuleMod.RuleState
import typings.atPulumiAws.wafSizeConstraintSetMod.SizeConstraintSetArgs
import typings.atPulumiAws.wafSizeConstraintSetMod.SizeConstraintSetState
import typings.atPulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typings.atPulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typings.atPulumiAws.wafWebAclMod.WebAclArgs
import typings.atPulumiAws.wafWebAclMod.WebAclState
import typings.atPulumiAws.wafXssMatchSetMod.XssMatchSetArgs
import typings.atPulumiAws.wafXssMatchSetMod.XssMatchSetState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "waf")
@js.native
object wafNs extends js.Object {
  @js.native
  class ByteMatchSet protected ()
    extends typings.atPulumiAws.wafMod.ByteMatchSet {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ByteMatchSetArgs) = this()
    def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class GeoMatchSet protected ()
    extends typings.atPulumiAws.wafMod.GeoMatchSet {
    /**
      * Create a GeoMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GeoMatchSetArgs) = this()
    def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IpSet protected ()
    extends typings.atPulumiAws.wafMod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RateBasedRule protected ()
    extends typings.atPulumiAws.wafMod.RateBasedRule {
    /**
      * Create a RateBasedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RateBasedRuleArgs) = this()
    def this(name: String, args: RateBasedRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RegexMatchSet protected ()
    extends typings.atPulumiAws.wafMod.RegexMatchSet {
    /**
      * Create a RegexMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexMatchSetArgs) = this()
    def this(name: String, args: RegexMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RegexPatternSet protected ()
    extends typings.atPulumiAws.wafMod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Rule protected ()
    extends typings.atPulumiAws.wafMod.Rule {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleArgs) = this()
    def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RuleGroup protected ()
    extends typings.atPulumiAws.wafMod.RuleGroup {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SizeConstraintSet protected ()
    extends typings.atPulumiAws.wafMod.SizeConstraintSet {
    /**
      * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SizeConstraintSetArgs) = this()
    def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SqlInjectionMatchSet protected ()
    extends typings.atPulumiAws.wafMod.SqlInjectionMatchSet {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WebAcl protected ()
    extends typings.atPulumiAws.wafMod.WebAcl {
    /**
      * Create a WebAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclArgs) = this()
    def this(name: String, args: WebAclArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class XssMatchSet protected ()
    extends typings.atPulumiAws.wafMod.XssMatchSet {
    /**
      * Create a XssMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: XssMatchSetArgs) = this()
    def this(name: String, args: XssMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): typings.atPulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafByteMatchSetMod.ByteMatchSet = js.native
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/byteMatchSet.ByteMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): typings.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafGeoMatchSetMod.GeoMatchSet = js.native
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/geoMatchSet.GeoMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafIpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState): typings.atPulumiAws.wafIpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafIpSetMod.IpSet = js.native
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ipSet.IpSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafRateBasedRuleMod.RateBasedRule = js.native
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rateBasedRule.RateBasedRule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): typings.atPulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafRegexMatchSetMod.RegexMatchSet = js.native
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexMatchSet.RegexMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.atPulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafRegexPatternSetMod.RegexPatternSet = js.native
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexPatternSet.RegexPatternSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState): typings.atPulumiAws.wafRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafRuleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/rule.Rule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.atPulumiAws.wafRuleGroupMod.RuleGroup = js.native
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/ruleGroup.RuleGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): typings.atPulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafSizeConstraintSetMod.SizeConstraintSet = js.native
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typings.atPulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafWebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState): typings.atPulumiAws.wafWebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typings.atPulumiAws.wafWebAclMod.WebAcl = js.native
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/webAcl.WebAcl */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState): typings.atPulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafXssMatchSetMod.XssMatchSet = js.native
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/xssMatchSet.XssMatchSet */ Boolean = js.native
  }
  
}

