package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

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
  val queuing: QueuingConfiguration
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon
    * arrival are held in a queue until they can be executed or a queuing limit is reached.
    * "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  val `type`: String
}

object LimitResponse {
  @scala.inline
  def apply(queuing: QueuingConfiguration, `type`: String): LimitResponse = {
    val __obj = js.Dynamic.literal(queuing = queuing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitResponse]
  }
}

