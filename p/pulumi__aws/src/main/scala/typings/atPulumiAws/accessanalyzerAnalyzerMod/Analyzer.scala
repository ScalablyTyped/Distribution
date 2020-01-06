package typings.atPulumiAws.accessanalyzerAnalyzerMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/accessanalyzer/analyzer", "Analyzer")
@js.native
class Analyzer protected () extends CustomResource {
  /**
    * Create a Analyzer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AnalyzerArgs) = this()
  def this(name: String, args: AnalyzerArgs, opts: CustomResourceOptions) = this()
  /**
    * Name of the Analyzer.
    */
  val analyzerName: Output[String] = js.native
  val arn: Output[String] = js.native
  /**
    * Key-value mapping of resource tags.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Type of Analyzer. Valid value is currently only `ACCOUNT`. Defaults to `ACCOUNT`.
    */
  val `type`: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/accessanalyzer/analyzer", "Analyzer")
@js.native
object Analyzer extends js.Object {
  /**
    * Get an existing Analyzer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Analyzer = js.native
  def get(name: String, id: Input[ID], state: AnalyzerState): Analyzer = js.native
  def get(name: String, id: Input[ID], state: AnalyzerState, opts: CustomResourceOptions): Analyzer = js.native
  /**
    * Returns true if the given object is an instance of Analyzer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/accessanalyzer/analyzer.Analyzer */ Boolean = js.native
}

