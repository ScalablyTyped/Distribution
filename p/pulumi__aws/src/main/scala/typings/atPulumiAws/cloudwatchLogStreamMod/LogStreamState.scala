package typings.atPulumiAws.cloudwatchLogStreamMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogStreamState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the log stream.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the log group under which the log stream is to be created.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object LogStreamState {
  @scala.inline
  def apply(arn: Input[String] = null, logGroupName: Input[String] = null, name: Input[String] = null): LogStreamState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogStreamState]
  }
}

