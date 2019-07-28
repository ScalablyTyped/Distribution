package typings.atPulumiAws.datasyncTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AtimeBytesPerSecond
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: Input[ARN]
  /**
    * Name of the DataSync Task.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: js.UndefOr[Input[Anon_AtimeBytesPerSecond]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: Input[ARN]
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object TaskArgs {
  @scala.inline
  def apply(
    destinationLocationArn: Input[ARN],
    sourceLocationArn: Input[ARN],
    cloudwatchLogGroupArn: Input[ARN] = null,
    name: Input[String] = null,
    options: Input[Anon_AtimeBytesPerSecond] = null,
    tags: Input[StringDictionary[Input[String]]] = null
  ): TaskArgs = {
    val __obj = js.Dynamic.literal(destinationLocationArn = destinationLocationArn.asInstanceOf[js.Any], sourceLocationArn = sourceLocationArn.asInstanceOf[js.Any])
    if (cloudwatchLogGroupArn != null) __obj.updateDynamic("cloudwatchLogGroupArn")(cloudwatchLogGroupArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskArgs]
  }
}

