package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitResponse defines how to handle requests that can not be executed right now.
  */
trait LimitResponse extends js.Object {
  /**
    * `queuing` holds the configuration parameters for queuing. This field may be non-empty only
    * if `type` is `"Queue"`.
    */
  var queuing: js.UndefOr[Input[QueuingConfiguration]] = js.undefined
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon
    * arrival are held in a queue until they can be executed or a queuing limit is reached.
    * "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  var `type`: Input[String]
}

object LimitResponse {
  @scala.inline
  def apply(`type`: Input[String], queuing: Input[QueuingConfiguration] = null): LimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (queuing != null) __obj.updateDynamic("queuing")(queuing.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitResponse]
  }
}

