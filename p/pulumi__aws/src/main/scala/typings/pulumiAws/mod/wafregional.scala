package typings.pulumiAws.mod

import typings.pulumiAws.byteMatchSetMod.ByteMatchSetArgs
import typings.pulumiAws.byteMatchSetMod.ByteMatchSetState
import typings.pulumiAws.geoMatchSetMod.GeoMatchSetArgs
import typings.pulumiAws.geoMatchSetMod.GeoMatchSetState
import typings.pulumiAws.getIpsetMod.GetIpsetArgs
import typings.pulumiAws.getIpsetMod.GetIpsetResult
import typings.pulumiAws.getRateBasedModMod.GetRateBasedModArgs
import typings.pulumiAws.getRateBasedModMod.GetRateBasedModResult
import typings.pulumiAws.getRuleMod.GetRuleArgs
import typings.pulumiAws.getRuleMod.GetRuleResult
import typings.pulumiAws.getWebAclMod.GetWebAclArgs
import typings.pulumiAws.getWebAclMod.GetWebAclResult
import typings.pulumiAws.rateBasedRuleMod.RateBasedRuleArgs
import typings.pulumiAws.rateBasedRuleMod.RateBasedRuleState
import typings.pulumiAws.regexMatchSetMod.RegexMatchSetArgs
import typings.pulumiAws.regexMatchSetMod.RegexMatchSetState
import typings.pulumiAws.regexPatternSetMod.RegexPatternSetArgs
import typings.pulumiAws.regexPatternSetMod.RegexPatternSetState
import typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSetArgs
import typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSetState
import typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSetArgs
import typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSetState
import typings.pulumiAws.wafregionalIpSetMod.IpSetArgs
import typings.pulumiAws.wafregionalIpSetMod.IpSetState
import typings.pulumiAws.wafregionalRuleGroupMod.RuleGroupArgs
import typings.pulumiAws.wafregionalRuleGroupMod.RuleGroupState
import typings.pulumiAws.wafregionalRuleMod.RuleArgs
import typings.pulumiAws.wafregionalRuleMod.RuleState
import typings.pulumiAws.webAclAssociationMod.WebAclAssociationArgs
import typings.pulumiAws.webAclAssociationMod.WebAclAssociationState
import typings.pulumiAws.webAclMod.WebAclArgs
import typings.pulumiAws.webAclMod.WebAclState
import typings.pulumiAws.xssMatchSetMod.XssMatchSetArgs
import typings.pulumiAws.xssMatchSetMod.XssMatchSetState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafregional {
  
  @JSImport("@pulumi/aws", "wafregional.ByteMatchSet")
  @js.native
  class ByteMatchSet protected ()
    extends typings.pulumiAws.wafregionalMod.ByteMatchSet {
    /**
      * Create a ByteMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ByteMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ByteMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ByteMatchSet {
    
    /**
      * Get an existing ByteMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState): typings.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.ByteMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: ByteMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.byteMatchSetMod.ByteMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of ByteMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.ByteMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/byteMatchSet.ByteMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.GeoMatchSet")
  @js.native
  class GeoMatchSet protected ()
    extends typings.pulumiAws.wafregionalMod.GeoMatchSet {
    /**
      * Create a GeoMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: GeoMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: GeoMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object GeoMatchSet {
    
    /**
      * Get an existing GeoMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState): typings.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.GeoMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: GeoMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.geoMatchSetMod.GeoMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of GeoMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.GeoMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/geoMatchSet.GeoMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.IpSet")
  @js.native
  class IpSet protected ()
    extends typings.pulumiAws.wafregionalMod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object IpSet {
    
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "wafregional.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "wafregional.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState): typings.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    @JSImport("@pulumi/aws", "wafregional.IpSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typings.pulumiAws.wafregionalIpSetMod.IpSet = js.native
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.IpSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ipSet.IpSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.RateBasedRule")
  @js.native
  class RateBasedRule protected ()
    extends typings.pulumiAws.wafregionalMod.RateBasedRule {
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
  /* static members */
  object RateBasedRule {
    
    /**
      * Get an existing RateBasedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "wafregional.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "wafregional.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState): typings.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    @JSImport("@pulumi/aws", "wafregional.RateBasedRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RateBasedRuleState, opts: CustomResourceOptions): typings.pulumiAws.rateBasedRuleMod.RateBasedRule = js.native
    
    /**
      * Returns true if the given object is an instance of RateBasedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.RateBasedRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rateBasedRule.RateBasedRule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.RegexMatchSet")
  @js.native
  class RegexMatchSet protected ()
    extends typings.pulumiAws.wafregionalMod.RegexMatchSet {
    /**
      * Create a RegexMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RegexMatchSet {
    
    /**
      * Get an existing RegexMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState): typings.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.regexMatchSetMod.RegexMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.RegexMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexMatchSet.RegexMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.RegexPatternSet")
  @js.native
  class RegexPatternSet protected ()
    extends typings.pulumiAws.wafregionalMod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RegexPatternSet {
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    @JSImport("@pulumi/aws", "wafregional.RegexPatternSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.pulumiAws.regexPatternSetMod.RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.RegexPatternSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.Rule")
  @js.native
  class Rule protected ()
    extends typings.pulumiAws.wafregionalMod.Rule {
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
  /* static members */
  object Rule {
    
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.Rule.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "wafregional.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "wafregional.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState): typings.pulumiAws.wafregionalRuleMod.Rule = js.native
    @JSImport("@pulumi/aws", "wafregional.Rule.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.pulumiAws.wafregionalRuleMod.Rule = js.native
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.Rule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/rule.Rule */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.RuleGroup")
  @js.native
  class RuleGroup protected ()
    extends typings.pulumiAws.wafregionalMod.RuleGroup {
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
  /* static members */
  object RuleGroup {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "wafregional.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "wafregional.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws", "wafregional.RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.pulumiAws.wafregionalRuleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.RuleGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/ruleGroup.RuleGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet")
  @js.native
  class SizeConstraintSet protected ()
    extends typings.pulumiAws.wafregionalMod.SizeConstraintSet {
    /**
      * Create a SizeConstraintSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SizeConstraintSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SizeConstraintSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SizeConstraintSet {
    
    /**
      * Get an existing SizeConstraintSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SizeConstraintSetState, opts: CustomResourceOptions): typings.pulumiAws.sizeConstraintSetMod.SizeConstraintSet = js.native
    
    /**
      * Returns true if the given object is an instance of SizeConstraintSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.SizeConstraintSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sizeConstraintSet.SizeConstraintSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet")
  @js.native
  class SqlInjectionMatchSet protected ()
    extends typings.pulumiAws.wafregionalMod.SqlInjectionMatchSet {
    /**
      * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SqlInjectionMatchSet {
    
    /**
      * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.sqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.SqlInjectionMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.WebAcl")
  @js.native
  class WebAcl protected ()
    extends typings.pulumiAws.wafregionalMod.WebAcl {
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
  /* static members */
  object WebAcl {
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState): typings.pulumiAws.webAclMod.WebAcl = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAcl.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typings.pulumiAws.webAclMod.WebAcl = js.native
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.WebAcl.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAcl.WebAcl */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.WebAclAssociation")
  @js.native
  class WebAclAssociation protected ()
    extends typings.pulumiAws.wafregionalMod.WebAclAssociation {
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
  /* static members */
  object WebAclAssociation {
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    @JSImport("@pulumi/aws", "wafregional.WebAclAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typings.pulumiAws.webAclAssociationMod.WebAclAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.WebAclAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAclAssociation.WebAclAssociation */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.XssMatchSet")
  @js.native
  class XssMatchSet protected ()
    extends typings.pulumiAws.wafregionalMod.XssMatchSet {
    /**
      * Create a XssMatchSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: XssMatchSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: XssMatchSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object XssMatchSet {
    
    /**
      * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "wafregional.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    @JSImport("@pulumi/aws", "wafregional.XssMatchSet.get")
    @js.native
    def get(name: String, id: Input[ID], state: XssMatchSetState, opts: CustomResourceOptions): typings.pulumiAws.xssMatchSetMod.XssMatchSet = js.native
    
    /**
      * Returns true if the given object is an instance of XssMatchSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "wafregional.XssMatchSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/xssMatchSet.XssMatchSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "wafregional.getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] = js.native
  @JSImport("@pulumi/aws", "wafregional.getIpset")
  @js.native
  def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] = js.native
  
  @JSImport("@pulumi/aws", "wafregional.getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs): js.Promise[GetRateBasedModResult] = js.native
  @JSImport("@pulumi/aws", "wafregional.getRateBasedMod")
  @js.native
  def getRateBasedMod(args: GetRateBasedModArgs, opts: InvokeOptions): js.Promise[GetRateBasedModResult] = js.native
  
  @JSImport("@pulumi/aws", "wafregional.getRule")
  @js.native
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] = js.native
  @JSImport("@pulumi/aws", "wafregional.getRule")
  @js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] = js.native
  
  @JSImport("@pulumi/aws", "wafregional.getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  @JSImport("@pulumi/aws", "wafregional.getWebAcl")
  @js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
}
