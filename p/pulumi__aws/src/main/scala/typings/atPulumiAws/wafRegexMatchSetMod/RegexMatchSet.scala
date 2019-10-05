package typings.atPulumiAws.wafRegexMatchSetMod

import typings.atPulumiAws.typesOutputMod.waf.RegexMatchSetRegexMatchTuple
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf/regexMatchSet", "RegexMatchSet")
@js.native
class RegexMatchSet protected () extends CustomResource {
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
  /**
    * The name or description of the Regex Match Set.
    */
  val name: Output[String] = js.native
  /**
    * The regular expression pattern that you want AWS WAF to search for in web requests,
    * the location in requests that you want AWS WAF to search, and other settings. See below.
    */
  val regexMatchTuples: Output[js.UndefOr[js.Array[RegexMatchSetRegexMatchTuple]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/waf/regexMatchSet", "RegexMatchSet")
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
  def get(name: String, id: Input[ID]): RegexMatchSet = js.native
  def get(name: String, id: Input[ID], state: RegexMatchSetState): RegexMatchSet = js.native
  def get(name: String, id: Input[ID], state: RegexMatchSetState, opts: CustomResourceOptions): RegexMatchSet = js.native
  /**
    * Returns true if the given object is an instance of RegexMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/waf/regexMatchSet.RegexMatchSet */ Boolean = js.native
}

