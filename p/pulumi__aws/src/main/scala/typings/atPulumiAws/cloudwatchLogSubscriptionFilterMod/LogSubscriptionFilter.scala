package typings.atPulumiAws.cloudwatchLogSubscriptionFilterMod

import typings.atPulumiAws.cloudwatchLogGroupMod.LogGroup
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter")
@js.native
class LogSubscriptionFilter protected () extends CustomResource {
  /**
    * Create a LogSubscriptionFilter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogSubscriptionFilterArgs) = this()
  def this(name: String, args: LogSubscriptionFilterArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
    */
  val destinationArn: Output[String] = js.native
  /**
    * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are "Random" and "ByLogStream".
    */
  val distribution: Output[js.UndefOr[String]] = js.native
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
    */
  val filterPattern: Output[String] = js.native
  /**
    * The name of the log group to associate the subscription filter with
    */
  val logGroup: Output[LogGroup] = js.native
  /**
    * A name for the subscription filter
    */
  val name: Output[String] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws_lambda_permission` resource for granting access from CloudWatch logs to the destination Lambda function.
    */
  val roleArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/logSubscriptionFilter", "LogSubscriptionFilter")
@js.native
object LogSubscriptionFilter extends js.Object {
  /**
    * Get an existing LogSubscriptionFilter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LogSubscriptionFilter = js.native
  def get(name: String, id: Input[ID], state: LogSubscriptionFilterState): LogSubscriptionFilter = js.native
  def get(name: String, id: Input[ID], state: LogSubscriptionFilterState, opts: CustomResourceOptions): LogSubscriptionFilter = js.native
  /**
    * Returns true if the given object is an instance of LogSubscriptionFilter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logSubscriptionFilter.LogSubscriptionFilter */ Boolean = js.native
}

