package typings.pulumiAws.inputMod.gamelift

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetRuntimeConfigurationServerProcess extends js.Object {
  /**
    * Number of server processes using this configuration to run concurrently on an instance.
    */
  var concurrentExecutions: Input[Double] = js.native
  /**
    * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
    */
  var launchPath: Input[String] = js.native
  /**
    * Optional list of parameters to pass to the server executable on launch.
    */
  var parameters: js.UndefOr[Input[String]] = js.native
}

object FleetRuntimeConfigurationServerProcess {
  @scala.inline
  def apply(concurrentExecutions: Input[Double], launchPath: Input[String], parameters: Input[String] = null): FleetRuntimeConfigurationServerProcess = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions.asInstanceOf[js.Any], launchPath = launchPath.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetRuntimeConfigurationServerProcess]
  }
}

