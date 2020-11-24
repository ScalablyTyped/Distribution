package typings.pulumiAws.kinesisanalyticsv2ApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
import typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationState extends js.Object {
  
  /**
    * The application's configuration
    */
  val applicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfiguration]] = js.native
  
  /**
    * The ARN of the application.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[ApplicationCloudwatchLoggingOptions]] = js.native
  
  /**
    * The current timestamp when the application was created.
    */
  val createTimestamp: js.UndefOr[Input[String]] = js.native
  
  /**
    * A summary description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The current timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
    */
  val runtimeEnvironment: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  val serviceExecutionRole: js.UndefOr[Input[String]] = js.native
  
  /**
    * The status of the application.
    */
  val status: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the application.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The current application version. Kinesis Data Analytics updates the `versionId` each time the application is updated.
    */
  val versionId: js.UndefOr[Input[Double]] = js.native
}
object ApplicationState {
  
  @scala.inline
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  
  @scala.inline
  implicit class ApplicationStateOps[Self <: ApplicationState] (val x: Self) extends AnyVal {
    
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
    def setApplicationConfiguration(value: Input[ApplicationApplicationConfiguration]): Self = this.set("applicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationConfiguration: Self = this.set("applicationConfiguration", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[ApplicationCloudwatchLoggingOptions]): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLoggingOptions: Self = this.set("cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setCreateTimestamp(value: Input[String]): Self = this.set("createTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("createTimestamp", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLastUpdateTimestamp(value: Input[String]): Self = this.set("lastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("lastUpdateTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRuntimeEnvironment(value: Input[String]): Self = this.set("runtimeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeEnvironment: Self = this.set("runtimeEnvironment", js.undefined)
    
    @scala.inline
    def setServiceExecutionRole(value: Input[String]): Self = this.set("serviceExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceExecutionRole: Self = this.set("serviceExecutionRole", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersionId(value: Input[Double]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
