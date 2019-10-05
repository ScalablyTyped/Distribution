package typings.atPulumiKubernetes.typesInputMod.discovery.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
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
  var ready: js.UndefOr[Input[Boolean]] = js.undefined
}

object EndpointConditions {
  @scala.inline
  def apply(ready: Input[Boolean] = null): EndpointConditions = {
    val __obj = js.Dynamic.literal()
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConditions]
  }
}

