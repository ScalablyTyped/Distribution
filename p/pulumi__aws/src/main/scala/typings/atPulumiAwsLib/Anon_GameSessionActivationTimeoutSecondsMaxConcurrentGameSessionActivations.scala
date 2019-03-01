package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations extends js.Object {
  var gameSessionActivationTimeoutSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var maxConcurrentGameSessionActivations: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var serverProcesses: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ConcurrentExecutionsLaunchPath]]]
  ] = js.undefined
}

object Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations {
  @scala.inline
  def apply(
    gameSessionActivationTimeoutSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    maxConcurrentGameSessionActivations: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    serverProcesses: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_ConcurrentExecutionsLaunchPath]]] = null
  ): Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations = {
    val __obj = js.Dynamic.literal()
    if (gameSessionActivationTimeoutSeconds != null) __obj.updateDynamic("gameSessionActivationTimeoutSeconds")(gameSessionActivationTimeoutSeconds.asInstanceOf[js.Any])
    if (maxConcurrentGameSessionActivations != null) __obj.updateDynamic("maxConcurrentGameSessionActivations")(maxConcurrentGameSessionActivations.asInstanceOf[js.Any])
    if (serverProcesses != null) __obj.updateDynamic("serverProcesses")(serverProcesses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GameSessionActivationTimeoutSecondsMaxConcurrentGameSessionActivations]
  }
}

