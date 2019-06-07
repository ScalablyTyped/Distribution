package typings
package atPulumiAwsLib.wafWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/webAcl", "WebAcl")
@js.native
class WebAcl protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a WebAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: WebAclArgs) = this()
  def this(name: java.lang.String, args: WebAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration block with action that you want AWS WAF to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL. Detailed below.
    */
  val defaultAction: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_TypeString] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_LogDestination]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Configuration blocks containing rules to associate with the web ACL and the settings for each rule. Detailed below.
    */
  val rules: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ActionOverrideAction]]] = js.native
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

