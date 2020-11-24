package typings.pulumiAws.kinesisanalyticsv2ApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kinesisanalyticsv2.ApplicationApplicationConfiguration
import typings.pulumiAws.outputMod.kinesisanalyticsv2.ApplicationCloudwatchLoggingOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/kinesisanalyticsv2/application", "Application")
@js.native
class Application protected () extends CustomResource {
  /**
    * Create a Application resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApplicationArgs) = this()
  def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The application's configuration
    */
  val applicationConfiguration: Output_[ApplicationApplicationConfiguration] = js.native
  
  /**
    * The ARN of the application.
    */
  val arn: Output_[String] = js.native
  
  /**
    * A [CloudWatch log stream](https://www.terraform.io/docs/providers/aws/r/cloudwatch_log_stream.html) to monitor application configuration errors.
    */
  val cloudwatchLoggingOptions: Output_[js.UndefOr[ApplicationCloudwatchLoggingOptions]] = js.native
  
  /**
    * The current timestamp when the application was created.
    */
  val createTimestamp: Output_[String] = js.native
  
  /**
    * A summary description of the application.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The current timestamp when the application was last updated.
    */
  val lastUpdateTimestamp: Output_[String] = js.native
  
  /**
    * The name of the application.
    */
  val name: Output_[String] = js.native
  
  /**
    * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`.
    */
  val runtimeEnvironment: Output_[String] = js.native
  
  /**
    * The ARN of the [IAM role](https://www.terraform.io/docs/providers/aws/r/iam_role.html) used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
    */
  val serviceExecutionRole: Output_[String] = js.native
  
  /**
    * The status of the application.
    */
  val status: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the application.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The current application version. Kinesis Data Analytics updates the `versionId` each time the application is updated.
    */
  val versionId: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/kinesisanalyticsv2/application", "Application")
@js.native
object Application extends js.Object {
  
  /**
    * Get an existing Application resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Application = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = js.native
  
  /**
    * Returns true if the given object is an instance of Application.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesisanalyticsv2/application.Application */ Boolean = js.native
}
