package typings.atPulumiAws.typesOutputMod.gameliftNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetRuntimeConfiguration extends js.Object {
  /**
    * Maximum amount of time (in seconds) that a game session can remain in status `ACTIVATING`.
    */
  var gameSessionActivationTimeoutSeconds: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of game sessions with status `ACTIVATING` to allow on an instance simultaneously.
    */
  var maxConcurrentGameSessionActivations: js.UndefOr[Double] = js.undefined
  /**
    * Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
    */
  var serverProcesses: js.UndefOr[js.Array[FleetRuntimeConfigurationServerProcess]] = js.undefined
}

object FleetRuntimeConfiguration {
  @scala.inline
  def apply(
    gameSessionActivationTimeoutSeconds: Int | Double = null,
    maxConcurrentGameSessionActivations: Int | Double = null,
    serverProcesses: js.Array[FleetRuntimeConfigurationServerProcess] = null
  ): FleetRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    if (gameSessionActivationTimeoutSeconds != null) __obj.updateDynamic("gameSessionActivationTimeoutSeconds")(gameSessionActivationTimeoutSeconds.asInstanceOf[js.Any])
    if (maxConcurrentGameSessionActivations != null) __obj.updateDynamic("maxConcurrentGameSessionActivations")(maxConcurrentGameSessionActivations.asInstanceOf[js.Any])
    if (serverProcesses != null) __obj.updateDynamic("serverProcesses")(serverProcesses)
    __obj.asInstanceOf[FleetRuntimeConfiguration]
  }
}

