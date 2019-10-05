package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var component: js.UndefOr[Input[String]] = js.undefined
  /**
    * Node name on which the event is generated.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
}

object EventSource {
  @scala.inline
  def apply(component: Input[String] = null, host: Input[String] = null): EventSource = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
}

