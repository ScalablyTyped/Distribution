package typings.pulumiAws.analyticsApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationCloudwatchLoggingOptions
import typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationInputs
import typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationOutput
import typings.pulumiAws.inputMod.kinesis.AnalyticsApplicationReferenceDataSources
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationState extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Appliation.
    */
  val arn: js.UndefOr[Input[ARN]] = js.native
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[AnalyticsApplicationCloudwatchLoggingOptions]] = js.native
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[Input[String]] = js.native
  /**
    * The Timestamp when the application version was created.
    */
  val createTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[Input[AnalyticsApplicationInputs]] = js.native
  /**
    * The Timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationOutput]]]] = js.native
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[Input[AnalyticsApplicationReferenceDataSources]] = js.native
  /**
    * The Status of the application.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value map of tags for the Kinesis Analytics Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The Version of the application.
    */
  val version: js.UndefOr[Input[Double]] = js.native
}

object AnalyticsApplicationState {
  @scala.inline
  def apply(): AnalyticsApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationState]
  }
  @scala.inline
  implicit class AnalyticsApplicationStateOps[Self <: AnalyticsApplicationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[ARN]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[AnalyticsApplicationCloudwatchLoggingOptions]): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLoggingOptions: Self = this.set("cloudwatchLoggingOptions", js.undefined)
    @scala.inline
    def setCode(value: Input[String]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setCreateTimestamp(value: Input[String]): Self = this.set("createTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("createTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInputs(value: Input[AnalyticsApplicationInputs]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    @scala.inline
    def setLastUpdateTimestamp(value: Input[String]): Self = this.set("lastUpdateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("lastUpdateTimestamp", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOutputsVarargs(value: Input[AnalyticsApplicationOutput]*): Self = this.set("outputs", js.Array(value :_*))
    @scala.inline
    def setOutputs(value: Input[js.Array[Input[AnalyticsApplicationOutput]]]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
    @scala.inline
    def setReferenceDataSources(value: Input[AnalyticsApplicationReferenceDataSources]): Self = this.set("referenceDataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceDataSources: Self = this.set("referenceDataSources", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVersion(value: Input[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

