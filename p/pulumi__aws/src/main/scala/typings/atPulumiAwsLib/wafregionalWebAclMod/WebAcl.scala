package typings
package atPulumiAwsLib.wafregionalWebAclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/webAcl", "WebAcl")
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
  /**
    * Amazon Resource Name (ARN) of the WAF Regional WebACL.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The action that you want AWS WAF Regional to take when a request doesn't match the criteria in any of the rules that are associated with the web ACL.
    */
  val defaultAction: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_TypeString] = js.native
  /**
    * Configuration block to enable WAF logging. Detailed below.
    */
  val loggingConfiguration: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_LogDestination]] = js.native
  /**
    * The name or description for the Amazon CloudWatch metric of this web ACL.
    */
  val metricName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name or description of the web ACL.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Set of configuration blocks containing rules for the web ACL. Detailed below.
    */
  val rules: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_ActionOverrideAction]]] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafregionalWebAclMod.WebAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalWebAclMod.WebAclState
  ): atPulumiAwsLib.wafregionalWebAclMod.WebAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalWebAclMod.WebAclState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafregionalWebAclMod.WebAcl = js.native
}

