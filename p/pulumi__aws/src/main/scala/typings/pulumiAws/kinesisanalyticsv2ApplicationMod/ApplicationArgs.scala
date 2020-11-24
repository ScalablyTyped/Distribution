package typings.pulumiAws.kinesisanalyticsv2ApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
import typings.pulumiAws.inputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationArgs extends js.Object {
  
  /**
    * The application's configuration
    */
  val applicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfiguration]] = js.native
  
  /**
    * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
    */
  val cloudwatchLoggingOptions: js.UndefOr[Input[ApplicationCloudwatchLoggingOptions]] = js.native
  
  /**
    * A summary description of the application.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the application.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
    */
  val runtimeEnvironment: Input[String] = js.native
  
  /**
    * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  val serviceExecutionRole: Input[String] = js.native
  
  /**
    * A map of tags to assign to the application.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ApplicationArgs {
  
  @scala.inline
  def apply(runtimeEnvironment: Input[String], serviceExecutionRole: Input[String]): ApplicationArgs = {
    val __obj = js.Dynamic.literal(runtimeEnvironment = runtimeEnvironment.asInstanceOf[js.Any], serviceExecutionRole = serviceExecutionRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationArgs]
  }
  
  @scala.inline
  implicit class ApplicationArgsOps[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
    
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
    def setRuntimeEnvironment(value: Input[String]): Self = this.set("runtimeEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceExecutionRole(value: Input[String]): Self = this.set("serviceExecutionRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationConfiguration(value: Input[ApplicationApplicationConfiguration]): Self = this.set("applicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationConfiguration: Self = this.set("applicationConfiguration", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[ApplicationCloudwatchLoggingOptions]): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLoggingOptions: Self = this.set("cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
