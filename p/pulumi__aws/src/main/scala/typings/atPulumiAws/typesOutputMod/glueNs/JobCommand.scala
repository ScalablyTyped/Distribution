package typings.atPulumiAws.typesOutputMod.glueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCommand extends js.Object {
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
    */
  var pythonVersion: String
  /**
    * Specifies the S3 path to a script that executes a job.
    */
  var scriptLocation: String
}

object JobCommand {
  @scala.inline
  def apply(pythonVersion: String, scriptLocation: String, name: String = null): JobCommand = {
    val __obj = js.Dynamic.literal(pythonVersion = pythonVersion, scriptLocation = scriptLocation)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[JobCommand]
  }
}

