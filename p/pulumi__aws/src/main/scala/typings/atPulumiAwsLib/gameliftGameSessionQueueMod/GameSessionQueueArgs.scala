package typings
package atPulumiAwsLib.gameliftGameSessionQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueueArgs extends js.Object {
  /**
    * List of fleet/alias ARNs used by session queue for placing game sessions.
    */
  val destinations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Name of the session queue.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more policies used to choose fleet based on player latency. See below.
    */
  val playerLatencyPolicies: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[
          atPulumiAwsLib.Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds
        ]
      ]
    ]
  ] = js.undefined
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object GameSessionQueueArgs {
  @scala.inline
  def apply(
    destinations: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    playerLatencyPolicies: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[
          atPulumiAwsLib.Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds
        ]
      ]
    ] = null,
    timeoutInSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): GameSessionQueueArgs = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (playerLatencyPolicies != null) __obj.updateDynamic("playerLatencyPolicies")(playerLatencyPolicies.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueueArgs]
  }
}

