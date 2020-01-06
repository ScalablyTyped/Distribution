package typings.atPulumiAws.gameliftGameSessionQueueMod

import typings.atPulumiAws.typesInputMod.gamelift.GameSessionQueuePlayerLatencyPolicy
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameSessionQueueArgs extends js.Object {
  /**
    * List of fleet/alias ARNs used by session queue for placing game sessions.
    */
  val destinations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Name of the session queue.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * One or more policies used to choose fleet based on player latency. See below.
    */
  val playerLatencyPolicies: js.UndefOr[Input[js.Array[Input[GameSessionQueuePlayerLatencyPolicy]]]] = js.native
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: js.UndefOr[Input[Double]] = js.native
}

object GameSessionQueueArgs {
  @scala.inline
  def apply(
    destinations: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    playerLatencyPolicies: Input[js.Array[Input[GameSessionQueuePlayerLatencyPolicy]]] = null,
    timeoutInSeconds: Input[Double] = null
  ): GameSessionQueueArgs = {
    val __obj = js.Dynamic.literal()
    if (destinations != null) __obj.updateDynamic("destinations")(destinations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (playerLatencyPolicies != null) __obj.updateDynamic("playerLatencyPolicies")(playerLatencyPolicies.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionQueueArgs]
  }
}

