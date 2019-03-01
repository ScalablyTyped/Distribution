package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GameSessionActivationTimeoutSeconds extends js.Object {
  var gameSessionActivationTimeoutSeconds: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentGameSessionActivations: js.UndefOr[scala.Double] = js.undefined
  var serverProcesses: js.UndefOr[js.Array[Anon_ConcurrentExecutions]] = js.undefined
}

object Anon_GameSessionActivationTimeoutSeconds {
  @scala.inline
  def apply(
    gameSessionActivationTimeoutSeconds: scala.Int | scala.Double = null,
    maxConcurrentGameSessionActivations: scala.Int | scala.Double = null,
    serverProcesses: js.Array[Anon_ConcurrentExecutions] = null
  ): Anon_GameSessionActivationTimeoutSeconds = {
    val __obj = js.Dynamic.literal()
    if (gameSessionActivationTimeoutSeconds != null) __obj.updateDynamic("gameSessionActivationTimeoutSeconds")(gameSessionActivationTimeoutSeconds.asInstanceOf[js.Any])
    if (maxConcurrentGameSessionActivations != null) __obj.updateDynamic("maxConcurrentGameSessionActivations")(maxConcurrentGameSessionActivations.asInstanceOf[js.Any])
    if (serverProcesses != null) __obj.updateDynamic("serverProcesses")(serverProcesses)
    __obj.asInstanceOf[Anon_GameSessionActivationTimeoutSeconds]
  }
}

