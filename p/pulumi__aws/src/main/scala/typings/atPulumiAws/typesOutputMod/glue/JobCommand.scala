package typings.atPulumiAws.typesOutputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobCommand extends js.Object {
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: String = js.native
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: String = js.native
}

object JobCommand {
  @scala.inline
  def apply(pythonVersion: String, scriptLocation: String, name: String = null): JobCommand = {
    val __obj = js.Dynamic.literal(pythonVersion = pythonVersion.asInstanceOf[js.Any], scriptLocation = scriptLocation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobCommand]
  }
}

