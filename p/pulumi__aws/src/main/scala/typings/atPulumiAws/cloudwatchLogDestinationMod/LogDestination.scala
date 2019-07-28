package typings.atPulumiAws.cloudwatchLogDestinationMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logDestination", "LogDestination")
@js.native
class LogDestination protected () extends CustomResource {
  /**
    * Create a LogDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LogDestinationArgs) = this()
  def this(name: String, args: LogDestinationArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) specifying the log destination.
    */
  val arn: Output[String] = js.native
  /**
    * A name for the log destination
    */
  val name: Output[String] = js.native
  /**
    * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to put data into the target
    */
  val roleArn: Output[String] = js.native
  /**
    * The ARN of the target Amazon Kinesis stream or Amazon Lambda resource for the destination
    */
  val targetArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/logDestination", "LogDestination")
@js.native
object LogDestination extends js.Object {
  /**
    * Get an existing LogDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): LogDestination = js.native
  def get(name: String, id: Input[ID], state: LogDestinationState): LogDestination = js.native
  def get(name: String, id: Input[ID], state: LogDestinationState, opts: CustomResourceOptions): LogDestination = js.native
  /**
    * Returns true if the given object is an instance of LogDestination.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logDestination.LogDestination */ Boolean = js.native
}

