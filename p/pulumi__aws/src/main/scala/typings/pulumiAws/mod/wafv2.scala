package typings.pulumiAws.mod

import typings.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetArgs
import typings.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetResult
import typings.pulumiAws.getRuleGroupMod.GetRuleGroupArgs
import typings.pulumiAws.getRuleGroupMod.GetRuleGroupResult
import typings.pulumiAws.wafv2GetIpSetMod.GetIpSetArgs
import typings.pulumiAws.wafv2GetIpSetMod.GetIpSetResult
import typings.pulumiAws.wafv2GetWebAclMod.GetWebAclArgs
import typings.pulumiAws.wafv2GetWebAclMod.GetWebAclResult
import typings.pulumiAws.wafv2IpSetMod.IpSetArgs
import typings.pulumiAws.wafv2IpSetMod.IpSetState
import typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetArgs
import typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetState
import typings.pulumiAws.wafv2RuleGroupMod.RuleGroupArgs
import typings.pulumiAws.wafv2RuleGroupMod.RuleGroupState
import typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationArgs
import typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationState
import typings.pulumiAws.wafv2WebAclMod.WebAclArgs
import typings.pulumiAws.wafv2WebAclMod.WebAclState
import typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfigurationArgs
import typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfigurationState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "wafv2")
@js.native
object wafv2 extends js.Object {
  
  def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = js.native
  def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = js.native
  
  def getRegexPatternSet(args: GetRegexPatternSetArgs): js.Promise[GetRegexPatternSetResult] = js.native
  def getRegexPatternSet(args: GetRegexPatternSetArgs, opts: InvokeOptions): js.Promise[GetRegexPatternSetResult] = js.native
  
  def getRuleGroup(args: GetRuleGroupArgs): js.Promise[GetRuleGroupResult] = js.native
  def getRuleGroup(args: GetRuleGroupArgs, opts: InvokeOptions): js.Promise[GetRuleGroupResult] = js.native
  
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
  
  @js.native
  class IpSet protected ()
    extends typings.pulumiAws.wafv2Mod.IpSet {
    /**
      * Create a IpSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IpSetArgs) = this()
    def this(name: String, args: IpSetArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState): typings.pulumiAws.wafv2IpSetMod.IpSet = js.native
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typings.pulumiAws.wafv2IpSetMod.IpSet = js.native
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean = js.native
  }
  
  @js.native
  class RegexPatternSet protected ()
    extends typings.pulumiAws.wafv2Mod.RegexPatternSet {
    /**
      * Create a RegexPatternSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RegexPatternSetArgs) = this()
    def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = js.native
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = js.native
  }
  
  @js.native
  class RuleGroup protected ()
    extends typings.pulumiAws.wafv2Mod.RuleGroup {
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
  @js.native
  object RuleGroup extends js.Object {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean = js.native
  }
  
  @js.native
  class WebAcl protected ()
    extends typings.pulumiAws.wafv2Mod.WebAcl {
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
  @js.native
  object WebAcl extends js.Object {
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2WebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState): typings.pulumiAws.wafv2WebAclMod.WebAcl = js.native
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclMod.WebAcl = js.native
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAcl.WebAcl */ Boolean = js.native
  }
  
  @js.native
  class WebAclAssociation protected ()
    extends typings.pulumiAws.wafv2Mod.WebAclAssociation {
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
  @js.native
  object WebAclAssociation extends js.Object {
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclAssociation.WebAclAssociation */ Boolean = js.native
  }
  
  @js.native
  class WebAclLoggingConfiguration protected ()
    extends typings.pulumiAws.wafv2Mod.WebAclLoggingConfiguration {
    /**
      * Create a WebAclLoggingConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebAclLoggingConfigurationArgs) = this()
    def this(name: String, args: WebAclLoggingConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object WebAclLoggingConfiguration extends js.Object {
    
    /**
      * Get an existing WebAclLoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = js.native
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of WebAclLoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclLoggingConfiguration.WebAclLoggingConfiguration */ Boolean = js.native
  }
}
