package typings.pulumiAws

import typings.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetArgs
import typings.pulumiAws.getRegexPatternSetMod.GetRegexPatternSetResult
import typings.pulumiAws.wafv2GetIpSetMod.GetIpSetArgs
import typings.pulumiAws.wafv2GetIpSetMod.GetIpSetResult
import typings.pulumiAws.wafv2GetWebAclMod.GetWebAclArgs
import typings.pulumiAws.wafv2GetWebAclMod.GetWebAclResult
import typings.pulumiAws.wafv2IpSetMod.IpSetArgs
import typings.pulumiAws.wafv2IpSetMod.IpSetState
import typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetArgs
import typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSetState
import typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationArgs
import typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociationState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafv2", JSImport.Namespace)
@js.native
object wafv2Mod extends js.Object {
  @js.native
  class IpSet protected ()
    extends typings.pulumiAws.wafv2IpSetMod.IpSet {
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
  
  @js.native
  class RegexPatternSet protected ()
    extends typings.pulumiAws.wafv2RegexPatternSetMod.RegexPatternSet {
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
  
  @js.native
  class WebAclAssociation protected ()
    extends typings.pulumiAws.wafv2WebAclAssociationMod.WebAclAssociation {
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
  
  def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = js.native
  def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = js.native
  def getRegexPatternSet(args: GetRegexPatternSetArgs): js.Promise[GetRegexPatternSetResult] = js.native
  def getRegexPatternSet(args: GetRegexPatternSetArgs, opts: InvokeOptions): js.Promise[GetRegexPatternSetResult] = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] = js.native
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
  
}

