package typings.pulumiAws.wafv2RegexPatternSetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.wafv2.RegexPatternSetRegularExpression
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet")
@js.native
class RegexPatternSet protected () extends CustomResource {
  /**
    * Create a RegexPatternSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RegexPatternSetArgs) = this()
  def this(name: String, args: RegexPatternSetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) that identifies the cluster.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A friendly description of the regular expression pattern set.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  val lockToken: Output_[String] = js.native
  
  /**
    * A friendly name of the regular expression pattern set.
    */
  val name: Output_[String] = js.native
  
  /**
    * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
    */
  val regularExpressions: Output_[js.UndefOr[js.Array[RegexPatternSetRegularExpression]]] = js.native
  
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
    */
  val scope: Output_[String] = js.native
  
  /**
    * An array of key:value pairs to associate with the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/wafv2/regexPatternSet", "RegexPatternSet")
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
  def get(name: String, id: Input[ID]): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState): RegexPatternSet = js.native
  def get(name: String, id: Input[ID], state: RegexPatternSetState, opts: CustomResourceOptions): RegexPatternSet = js.native
  
  /**
    * Returns true if the given object is an instance of RegexPatternSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafv2/regexPatternSet.RegexPatternSet */ Boolean = js.native
}
