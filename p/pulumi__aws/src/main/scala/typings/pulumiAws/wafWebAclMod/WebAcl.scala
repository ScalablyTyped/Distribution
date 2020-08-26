package typings.pulumiAws.wafWebAclMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.waf.WebAclDefaultAction
import typings.pulumiAws.outputMod.waf.WebAclLoggingConfiguration
import typings.pulumiAws.outputMod.waf.WebAclRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/webAcl", "WebAcl")
@js.native
class WebAcl protected () extends CustomResource {
  /**
    * Create a WebAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WebAclArgs) = this()
  def this(name: String, args: WebAclArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the WAF WebACL.
    */
  val arn: Output_[String] = js.native
  /**
    * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
    */
  val defaultAction: Output_[WebAclDefaultAction] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: Output_[js.UndefOr[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: Output_[String] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: Output_[String] = js.native
  /**
    * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
    */
  val rules: Output_[js.UndefOr[js.Array[WebAclRule]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/waf/webAcl", "WebAcl")
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
  def get(name: String, id: Input[ID]): WebAcl = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebAcl = js.native
  def get(name: String, id: Input[ID], state: WebAclState): WebAcl = js.native
  def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): WebAcl = js.native
  /**
    * Returns true if the given object is an instance of WebAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/webAcl.WebAcl */ Boolean = js.native
}

