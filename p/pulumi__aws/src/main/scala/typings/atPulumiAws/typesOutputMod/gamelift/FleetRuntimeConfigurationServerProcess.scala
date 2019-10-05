package typings.atPulumiAws.typesOutputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetRuntimeConfigurationServerProcess extends js.Object {
  /**
    * Number of server processes using this configuration to run concurrently on an instance.
    */
  var concurrentExecutions: Double
  /**
    * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances `C:\game`, and for Linux instances `/local/game`.
    */
  var launchPath: String
  /**
    * Optional list of parameters to pass to the server executable on launch.
    */
  var parameters: js.UndefOr[String] = js.undefined
}

object FleetRuntimeConfigurationServerProcess {
  @scala.inline
  def apply(concurrentExecutions: Double, launchPath: String, parameters: String = null): FleetRuntimeConfigurationServerProcess = {
    val __obj = js.Dynamic.literal(concurrentExecutions = concurrentExecutions, launchPath = launchPath)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[FleetRuntimeConfigurationServerProcess]
  }
}

