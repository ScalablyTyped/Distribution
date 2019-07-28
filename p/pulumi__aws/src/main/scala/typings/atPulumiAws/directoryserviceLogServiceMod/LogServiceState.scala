package typings.atPulumiAws.directoryserviceLogServiceMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogServiceState extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the cloudwatch log group to which the logs should be published. The log group should be already created and the directory service principal should be provided with required permission to create stream and publish logs. Changing this value would delete the current subscription and create a new one. A directory can only have one log subscription at a time.
    */
  val logGroupName: js.UndefOr[Input[String]] = js.undefined
}

object LogServiceState {
  @scala.inline
  def apply(directoryId: Input[String] = null, logGroupName: Input[String] = null): LogServiceState = {
    val __obj = js.Dynamic.literal()
    if (directoryId != null) __obj.updateDynamic("directoryId")(directoryId.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogServiceState]
  }
}

