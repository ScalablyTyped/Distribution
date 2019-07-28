package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledEventsArray extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var events: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_EnabledEventsArray {
  @scala.inline
  def apply(enabled: Input[Boolean] = null, events: Input[js.Array[Input[String]]] = null): Anon_EnabledEventsArray = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledEventsArray]
  }
}

