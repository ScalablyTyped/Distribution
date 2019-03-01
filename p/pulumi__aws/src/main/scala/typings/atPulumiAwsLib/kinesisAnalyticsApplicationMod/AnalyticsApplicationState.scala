package typings
package atPulumiAwsLib.kinesisAnalyticsApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationState extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Appliation.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdLogStreamArnRoleArn]] = js.undefined
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Timestamp when the application version was created.
    */
  val createTimestamp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the application.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamNamePrefix]
  ] = js.undefined
  /**
    * The Timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamLambda]
      ]
    ]
  ] = js.undefined
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdS3Schema]] = js.undefined
  /**
    * The Status of the application.
    */
  val status: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Version of the application.
    */
  val version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object AnalyticsApplicationState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdLogStreamArnRoleArn] = null,
    code: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    createTimestamp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    inputs: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamNamePrefix] = null,
    lastUpdateTimestamp: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    outputs: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamLambda]
      ]
    ] = null,
    referenceDataSources: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IdS3Schema] = null,
    status: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    version: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
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
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationState]
  }
}

