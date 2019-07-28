package typings.atPulumiAws.kinesisAnalyticsApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_IdKinesisFirehoseKinesisStreamLambda
import typings.atPulumiAws.Anon_IdKinesisFirehoseKinesisStreamNamePrefix
import typings.atPulumiAws.Anon_IdLogStreamArnRoleArn
import typings.atPulumiAws.Anon_IdS3Schema
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationState extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Appliation.
    */
  val arn: js.UndefOr[Input[ARN]] = js.undefined
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[Anon_IdLogStreamArnRoleArn]] = js.undefined
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Timestamp when the application version was created.
    */
  val createTimestamp: js.UndefOr[Input[String]] = js.undefined
  /**
    * Description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[Input[Anon_IdKinesisFirehoseKinesisStreamNamePrefix]] = js.undefined
  /**
    * The Timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[Input[js.Array[Input[Anon_IdKinesisFirehoseKinesisStreamLambda]]]] = js.undefined
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[Input[Anon_IdS3Schema]] = js.undefined
  /**
    * The Status of the application.
    */
  val status: js.UndefOr[Input[String]] = js.undefined
  /**
    * Key-value mapping of tags for the Kinesis Analytics Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The Version of the application.
    */
  val version: js.UndefOr[Input[Double]] = js.undefined
}

object AnalyticsApplicationState {
  @scala.inline
  def apply(
    arn: Input[ARN] = null,
    cloudwatchLoggingOptions: Input[Anon_IdLogStreamArnRoleArn] = null,
    code: Input[String] = null,
    createTimestamp: Input[String] = null,
    description: Input[String] = null,
    inputs: Input[Anon_IdKinesisFirehoseKinesisStreamNamePrefix] = null,
    lastUpdateTimestamp: Input[String] = null,
    name: Input[String] = null,
    outputs: Input[js.Array[Input[Anon_IdKinesisFirehoseKinesisStreamLambda]]] = null,
    referenceDataSources: Input[Anon_IdS3Schema] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    version: Input[Double] = null
  ): AnalyticsApplicationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (createTimestamp != null) __obj.updateDynamic("createTimestamp")(createTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (lastUpdateTimestamp != null) __obj.updateDynamic("lastUpdateTimestamp")(lastUpdateTimestamp.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (referenceDataSources != null) __obj.updateDynamic("referenceDataSources")(referenceDataSources.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationState]
  }
}

