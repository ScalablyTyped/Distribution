package typings.pulumiAws.logServiceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogServiceArgs extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: Input[String] = js.native
  /**
    * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
    */
  val logGroupName: Input[String] = js.native
}

object LogServiceArgs {
  @scala.inline
  def apply(directoryId: Input[String], logGroupName: Input[String]): LogServiceArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogServiceArgs]
  }
}

