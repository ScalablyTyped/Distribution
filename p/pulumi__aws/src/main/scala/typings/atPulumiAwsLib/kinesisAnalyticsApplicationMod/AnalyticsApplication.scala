package typings
package atPulumiAwsLib.kinesisAnalyticsApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis/analyticsApplication", "AnalyticsApplication")
@js.native
class AnalyticsApplication protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AnalyticsApplicationArgs) = this()
  def this(name: java.lang.String, args: AnalyticsApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the Kinesis Analytics Appliation.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_IdLogStreamArn]] = js.native
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Timestamp when the application version was created.
    */
  val createTimestamp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Description of the application.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_IdKinesisFirehose]] = js.native
  /**
    * The Timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStream]]] = js.native
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_IdS3]] = js.native
  /**
    * The Status of the application.
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Version of the application.
    */
  val version: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState
  ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
}

