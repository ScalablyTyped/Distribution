package typings.pulumiAws.logStreamMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogStreamArgs extends js.Object {
  /**
    * The name of the log group under which the log stream is to be created.
    */
  val logGroupName: Input[String] = js.native
  /**
    * The name of the log stream. Must not be longer than 512 characters and must not contain `:`
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object LogStreamArgs {
  @scala.inline
  def apply(logGroupName: Input[String]): LogStreamArgs = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogStreamArgs]
  }
  @scala.inline
  implicit class LogStreamArgsOps[Self <: LogStreamArgs] (val x: Self) extends AnyVal {
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
    def setLogGroupName(value: Input[String]): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

