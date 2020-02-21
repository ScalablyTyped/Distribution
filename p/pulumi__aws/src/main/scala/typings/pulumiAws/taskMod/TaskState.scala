package typings.pulumiAws.taskMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.TaskOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Name of the DataSync Task.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: js.UndefOr[Input[TaskOptions]] = js.native
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object TaskState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    cloudwatchLogGroupArn: Input[ARN] = null,
    destinationLocationArn: Input[ARN] = null,
    name: Input[String] = null,
    options: Input[TaskOptions] = null,
    sourceLocationArn: Input[ARN] = null,
    tags: Input[StringDictionary[_]] = null
  ): TaskState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (cloudwatchLogGroupArn != null) __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    if (destinationLocationArn != null) __obj.updateDynamic("destinationLocationArn")(destinationLocationArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (sourceLocationArn != null) __obj.updateDynamic("sourceLocationArn")(sourceLocationArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskState]
  }
}

