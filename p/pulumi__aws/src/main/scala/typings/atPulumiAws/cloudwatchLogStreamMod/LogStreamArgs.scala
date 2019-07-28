package typings.atPulumiAws.cloudwatchLogStreamMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogStreamArgs extends js.Object {
  /**
    * The name of the log group under which the log stream is to be created.
    */
  val logGroupName: Input[String]
  /**
    * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object LogStreamArgs {
  @scala.inline
  def apply(logGroupName: Input[String], name: Input[String] = null): LogStreamArgs = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogStreamArgs]
  }
}

