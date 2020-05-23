package typings.pulumiAws.outputMod.gamelift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetRuntimeConfiguration extends js.Object {
  /**
    * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
    */
  var gameSessionActivationTimeoutSeconds: js.UndefOr[Double] = js.native
  /**
    * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
    */
  var maxConcurrentGameSessionActivations: js.UndefOr[Double] = js.native
  /**
    * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
    */
  var serverProcesses: js.UndefOr[js.Array[FleetRuntimeConfigurationServerProcess]] = js.native
}

object FleetRuntimeConfiguration {
  @scala.inline
  def apply(
    gameSessionActivationTimeoutSeconds: js.UndefOr[Double] = js.undefined,
    maxConcurrentGameSessionActivations: js.UndefOr[Double] = js.undefined,
    serverProcesses: js.Array[FleetRuntimeConfigurationServerProcess] = null
  ): FleetRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gameSessionActivationTimeoutSeconds)) __obj.updateDynamic("gameSessionActivationTimeoutSeconds")(gameSessionActivationTimeoutSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentGameSessionActivations)) __obj.updateDynamic("maxConcurrentGameSessionActivations")(maxConcurrentGameSessionActivations.get.asInstanceOf[js.Any])
    if (serverProcesses != null) __obj.updateDynamic("serverProcesses")(serverProcesses.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetRuntimeConfiguration]
  }
}

