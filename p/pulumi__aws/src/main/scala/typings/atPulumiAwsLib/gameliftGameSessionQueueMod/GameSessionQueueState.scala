package typings
package atPulumiAwsLib.gameliftGameSessionQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionQueueState extends js.Object {
  /**
    * Game Session Queue ARN.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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

