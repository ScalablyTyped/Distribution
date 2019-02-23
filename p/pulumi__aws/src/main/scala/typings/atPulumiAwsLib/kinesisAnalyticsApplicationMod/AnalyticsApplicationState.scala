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

