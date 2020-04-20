package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSource contains information for an event.
  */
trait EventSource extends js.Object {
  /**
    * Component from which the event is generated.
    */
  val component: String
  /**
    * Node name on which the event is generated.
    */
  val host: String
}

object EventSource {
  @scala.inline
  def apply(component: String, host: String): EventSource = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
}

