package typings.atPulumiAws.typesInputMod.glue

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: Input[String] = js.native
}

object JobCommand {
  @scala.inline
  def apply(scriptLocation: Input[String], name: Input[String] = null, pythonVersion: Input[String] = null): JobCommand = {
    val __obj = js.Dynamic.literal(scriptLocation = scriptLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pythonVersion != null) __obj.updateDynamic("pythonVersion")(pythonVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
}

