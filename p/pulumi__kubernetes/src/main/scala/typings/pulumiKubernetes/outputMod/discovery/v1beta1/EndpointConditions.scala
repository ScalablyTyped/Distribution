package typings.pulumiKubernetes.outputMod.discovery.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EndpointConditions represents the current condition of an endpoint.
  */
trait EndpointConditions extends js.Object {
  /**
    * ready indicates that this endpoint is prepared to receive traffic, according to whatever
    * system is managing the endpoint. A nil value indicates an unknown state. In most cases
    * consumers should interpret this unknown state as ready.
    */
  val ready: Boolean
}

object EndpointConditions {
  @scala.inline
  def apply(ready: Boolean): EndpointConditions = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EndpointConditions]
  }
}

