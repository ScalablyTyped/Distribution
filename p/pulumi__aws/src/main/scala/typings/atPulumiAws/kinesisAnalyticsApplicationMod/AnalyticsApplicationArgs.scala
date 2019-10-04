package typings.atPulumiAws.kinesisAnalyticsApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.kinesisNs.AnalyticsApplicationCloudwatchLoggingOptions
import typings.atPulumiAws.typesInputMod.kinesisNs.AnalyticsApplicationInputs
import typings.atPulumiAws.typesInputMod.kinesisNs.AnalyticsApplicationOutput
import typings.atPulumiAws.typesInputMod.kinesisNs.AnalyticsApplicationReferenceDataSources
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationArgs extends js.Object {
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[AnalyticsApplicationCloudwatchLoggingOptions]] = js.undefined
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[Input[String]] = js.undefined
  /**
    * Description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[Input[AnalyticsApplicationInputs]] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationOutput]]]] = js.undefined
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[Input[AnalyticsApplicationReferenceDataSources]] = js.undefined
  /**
    * Key-value mapping of tags for the Kinesis Analytics Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object AnalyticsApplicationArgs {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: Input[AnalyticsApplicationCloudwatchLoggingOptions] = null,
    code: Input[String] = null,
    description: Input[String] = null,
    inputs: Input[AnalyticsApplicationInputs] = null,
    name: Input[String] = null,
    outputs: Input[js.Array[Input[AnalyticsApplicationOutput]]] = null,
    referenceDataSources: Input[AnalyticsApplicationReferenceDataSources] = null,
    tags: Input[StringDictionary[_]] = null
  ): AnalyticsApplicationArgs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (referenceDataSources != null) __obj.updateDynamic("referenceDataSources")(referenceDataSources.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationArgs]
  }
}

