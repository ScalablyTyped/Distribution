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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2 {
  
  @JSImport("@pulumi/aws", "wafv2")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "wafv2.IpSet")
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
  object IpSet {
    
    @JSImport("@pulumi/aws", "wafv2.IpSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IpSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2IpSetMod.IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2IpSetMod.IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.wafv2IpSetMod.IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2IpSetMod.IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpSetState): typings.pulumiAws.wafv2IpSetMod.IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2IpSetMod.IpSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: IpSetState, opts: CustomResourceOptions): typings.pulumiAws.wafv2IpSetMod.IpSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2IpSetMod.IpSet]
    
    /**
      * Returns true if the given object is an instance of IpSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/ipSet.IpSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "wafv2.RegexPatternSet")
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
  object RegexPatternSet {
    
    @JSImport("@pulumi/aws", "wafv2.RegexPatternSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RegexPatternSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: RegexPatternSetState): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet]
    @scala.inline
    def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet]
    
    /**
      * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "wafv2.RuleGroup")
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
  object RuleGroup {
    
    @JSImport("@pulumi/aws", "wafv2.RuleGroup")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RuleGroupMod.RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RuleGroupMod.RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RuleGroupMod.RuleGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.pulumiAws.wafv2RuleGroupMod.RuleGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2RuleGroupMod.RuleGroup]
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/ruleGroup.RuleGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "wafv2.WebAcl")
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
  object WebAcl {
    
    @JSImport("@pulumi/aws", "wafv2.WebAcl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2WebAclMod.WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclMod.WebAcl]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclMod.WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclMod.WebAcl]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclState): typings.pulumiAws.wafv2WebAclMod.WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclMod.WebAcl]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclMod.WebAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclMod.WebAcl]
    
    /**
      * Returns true if the given object is an instance of WebAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAcl.WebAcl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/webAcl.WebAcl */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "wafv2.WebAclAssociation")
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
  object WebAclAssociation {
    
    @JSImport("@pulumi/aws", "wafv2.WebAclAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebAclAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclAssociationState): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclAssociationState, opts: CustomResourceOptions): typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation]
    
    /**
      * Returns true if the given object is an instance of WebAclAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclAssociation.WebAclAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/webAclAssociation.WebAclAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "wafv2.WebAclLoggingConfiguration")
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
  object WebAclLoggingConfiguration {
    
    @JSImport("@pulumi/aws", "wafv2.WebAclLoggingConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebAclLoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration]
    @scala.inline
    def get(name: String, id: Input[ID], state: WebAclLoggingConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.webAclLoggingConfigurationMod.WebAclLoggingConfiguration]
    
    /**
      * Returns true if the given object is an instance of WebAclLoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/webAclLoggingConfiguration.WebAclLoggingConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/wafv2/webAclLoggingConfiguration.WebAclLoggingConfiguration */ Boolean]
  }
  
  @scala.inline
  def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetIpSetResult]]
  @scala.inline
  def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIpSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIpSetResult]]
  
  @scala.inline
  def getRegexPatternSet(args: GetRegexPatternSetArgs): js.Promise[GetRegexPatternSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegexPatternSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRegexPatternSetResult]]
  @scala.inline
  def getRegexPatternSet(args: GetRegexPatternSetArgs, opts: InvokeOptions): js.Promise[GetRegexPatternSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegexPatternSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegexPatternSetResult]]
  
  @scala.inline
  def getRuleGroup(args: GetRuleGroupArgs): js.Promise[GetRuleGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuleGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRuleGroupResult]]
  @scala.inline
  def getRuleGroup(args: GetRuleGroupArgs, opts: InvokeOptions): js.Promise[GetRuleGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRuleGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRuleGroupResult]]
  
  @scala.inline
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebAcl")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetWebAclResult]]
  @scala.inline
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebAcl")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetWebAclResult]]
}
