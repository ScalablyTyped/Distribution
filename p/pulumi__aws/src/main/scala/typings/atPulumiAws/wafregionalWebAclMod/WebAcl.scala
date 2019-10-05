package typings.atPulumiAws.wafregionalWebAclMod

import typings.atPulumiAws.typesOutputMod.wafregional.WebAclDefaultAction
import typings.atPulumiAws.typesOutputMod.wafregional.WebAclLoggingConfiguration
import typings.atPulumiAws.typesOutputMod.wafregional.WebAclRule
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl")
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
    * Amazon Resource Name (ARN) of the WAF Regional WebACL.
    */
  val arn: Output[String] = js.native
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: Output[WebAclDefaultAction] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: Output[js.UndefOr[WebAclLoggingConfiguration]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: Output[String] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: Output[String] = js.native
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: Output[js.UndefOr[js.Array[WebAclRule]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl")
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
  def get(name: String, id: Input[ID]): WebAcl = js.native
  def get(name: String, id: Input[ID], state: WebAclState): WebAcl = js.native
  def get(name: String, id: Input[ID], state: WebAclState, opts: CustomResourceOptions): WebAcl = js.native
  /**
    * Returns true if the given object is an instance of WebAcl.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/webAcl.WebAcl */ Boolean = js.native
}

