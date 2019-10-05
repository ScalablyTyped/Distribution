package typings.atPulumiAws.kinesisAnalyticsApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.typesOutputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions
import typings.atPulumiAws.typesOutputMod.kinesis.AnalyticsApplicationInputs
import typings.atPulumiAws.typesOutputMod.kinesis.AnalyticsApplicationOutput
import typings.atPulumiAws.typesOutputMod.kinesis.AnalyticsApplicationReferenceDataSources
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication")
@js.native
class AnalyticsApplication protected () extends CustomResource {
  /**
    * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AnalyticsApplicationArgs) = this()
  def this(name: String, args: AnalyticsApplicationArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Kinesis Analytics Appliation.
    */
  val arn: Output[ARN] = js.native
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: Output[js.UndefOr[AnalyticsApplicationCloudwatchLoggingOptions]] = js.native
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: Output[js.UndefOr[String]] = js.native
  /**
    * The Timestamp when the application version was created.
    */
  val createTimestamp: Output[String] = js.native
  /**
    * Description of the application.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: Output[js.UndefOr[AnalyticsApplicationInputs]] = js.native
  /**
    * The Timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: Output[String] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: Output[String] = js.native
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: Output[js.UndefOr[js.Array[AnalyticsApplicationOutput]]] = js.native
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: Output[js.UndefOr[AnalyticsApplicationReferenceDataSources]] = js.native
  /**
    * The Status of the application.
    */
  val status: Output[String] = js.native
  /**
    * Key-value mapping of tags for the Kinesis Analytics Application.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The Version of the application.
    */
  val version: Output[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication")
@js.native
object AnalyticsApplication extends js.Object {
  /**
    * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): AnalyticsApplication = js.native
  def get(name: String, id: Input[ID], state: AnalyticsApplicationState): AnalyticsApplication = js.native
  def get(name: String, id: Input[ID], state: AnalyticsApplicationState, opts: CustomResourceOptions): AnalyticsApplication = js.native
  /**
    * Returns true if the given object is an instance of AnalyticsApplication.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/analyticsApplication.AnalyticsApplication */ Boolean = js.native
}

