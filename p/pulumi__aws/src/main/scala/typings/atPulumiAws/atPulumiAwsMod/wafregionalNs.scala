package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSetArgs
import typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSetState
import typings.atPulumiAws.wafregionalGeoMatchSetMod.GeoMatchSetArgs
import typings.atPulumiAws.wafregionalGeoMatchSetMod.GeoMatchSetState
import typings.atPulumiAws.wafregionalGetRuleMod.GetRuleArgs
import typings.atPulumiAws.wafregionalGetRuleMod.GetRuleResult
import typings.atPulumiAws.wafregionalGetWebAclMod.GetWebAclArgs
import typings.atPulumiAws.wafregionalGetWebAclMod.GetWebAclResult
import typings.atPulumiAws.wafregionalIpSetMod.IpSetArgs
import typings.atPulumiAws.wafregionalIpSetMod.IpSetState
import typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRuleArgs
import typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRuleState
import typings.atPulumiAws.wafregionalRegexMatchSetMod.RegexMatchSetArgs
import typings.atPulumiAws.wafregionalRegexMatchSetMod.RegexMatchSetState
import typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSetArgs
import typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSetState
import typings.atPulumiAws.wafregionalRuleGroupMod.RuleGroupArgs
import typings.atPulumiAws.wafregionalRuleGroupMod.RuleGroupState
import typings.atPulumiAws.wafregionalRuleMod.RuleArgs
import typings.atPulumiAws.wafregionalRuleMod.RuleState
import typings.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSetArgs
import typings.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSetState
import typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typings.atPulumiAws.wafregionalWebAclAssociationMod.WebAclAssociationArgs
import typings.atPulumiAws.wafregionalWebAclAssociationMod.WebAclAssociationState
import typings.atPulumiAws.wafregionalWebAclMod.WebAclArgs
import typings.atPulumiAws.wafregionalWebAclMod.WebAclState
import typings.atPulumiAws.wafregionalXssMatchSetMod.XssMatchSetArgs
import typings.atPulumiAws.wafregionalXssMatchSetMod.XssMatchSetState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional")
@js.native
object wafregionalNs extends js.Object {
  @js.native
  class ByteMatchSet protected ()
    extends typings.atPulumiAws.wafregionalMod.ByteMatchSet {
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
    extends typings.atPulumiAws.wafregionalMod.GeoMatchSet {
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
    extends typings.atPulumiAws.wafregionalMod.IpSet {
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
    extends typings.atPulumiAws.wafregionalMod.RateBasedRule {
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
    extends typings.atPulumiAws.wafregionalMod.RegexMatchSet {
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
    extends typings.atPulumiAws.wafregionalMod.RegexPatternSet {
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
    extends typings.atPulumiAws.wafregionalMod.Rule {
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
    extends typings.atPulumiAws.wafregionalMod.RuleGroup {
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
    extends typings.atPulumiAws.wafregionalMod.SizeConstraintSet {
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
    extends typings.atPulumiAws.wafregionalMod.SqlInjectionMatchSet {
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
    extends typings.atPulumiAws.wafregionalMod.WebAcl {
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
  class WebAclAssociation protected ()
    extends typings.atPulumiAws.wafregionalMod.WebAclAssociation {
    /**
      * Create a WebAclAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclAssociationArgs) = this()
    def this(name: String, args: WebAclAssociationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class XssMatchSet protected ()
    extends typings.atPulumiAws.wafregionalMod.XssMatchSet {
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalByteMatchSetMod.ByteMatchSet = js.native
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalGeoMatchSetMod.GeoMatchSet = js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): typings.atPulumiAws.wafregionalGeoMatchSetMod.GeoMatchSet = js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalGeoMatchSetMod.GeoMatchSet = js.native
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/geoMatchSet.GeoMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalIpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState): typings.atPulumiAws.wafregionalIpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalIpSetMod.IpSet = js.native
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ipSet.IpSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRateBasedRuleMod.RateBasedRule = js.native
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRegexMatchSetMod.RegexMatchSet = js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): typings.atPulumiAws.wafregionalRegexMatchSetMod.RegexMatchSet = js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRegexMatchSetMod.RegexMatchSet = js.native
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexMatchSet.RegexMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRegexPatternSetMod.RegexPatternSet = js.native
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState): typings.atPulumiAws.wafregionalRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRuleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.atPulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): typings.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalSizeConstraintSetMod.SizeConstraintSet = js.native
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalWebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState): typings.atPulumiAws.wafregionalWebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalWebAclMod.WebAcl = js.native
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAcl.WebAcl */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WebAclAssociation extends js.Object {
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typings.atPulumiAws.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalWebAclAssociationMod.WebAclAssociation = js.native
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.wafregionalXssMatchSetMod.XssMatchSet = js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState): typings.atPulumiAws.wafregionalXssMatchSetMod.XssMatchSet = js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typings.atPulumiAws.wafregionalXssMatchSetMod.XssMatchSet = js.native
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean = js.native
  }
  
}

