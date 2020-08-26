package typings.pulumiAws.gameSessionQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.gamelift.GameSessionQueuePlayerLatencyPolicy
import typings.pulumiPulumi.outputMod.Input
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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Maximum time a game session request can remain in the queue.
    */
  val timeoutInSeconds: js.UndefOr[Input[Double]] = js.native
}

object GameSessionQueueArgs {
  @scala.inline
  def apply(): GameSessionQueueArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionQueueArgs]
  }
  @scala.inline
  implicit class GameSessionQueueArgsOps[Self <: GameSessionQueueArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationsVarargs(value: Input[String]*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: Input[js.Array[Input[String]]]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPlayerLatencyPoliciesVarargs(value: Input[GameSessionQueuePlayerLatencyPolicy]*): Self = this.set("playerLatencyPolicies", js.Array(value :_*))
    @scala.inline
    def setPlayerLatencyPolicies(value: Input[js.Array[Input[GameSessionQueuePlayerLatencyPolicy]]]): Self = this.set("playerLatencyPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerLatencyPolicies: Self = this.set("playerLatencyPolicies", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeoutInSeconds(value: Input[Double]): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
  }
  
}

