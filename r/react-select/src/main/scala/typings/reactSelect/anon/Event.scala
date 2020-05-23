package typings.reactSelect.anon

import typings.reactSelect.accessibilityMod.InstructionsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var context: js.UndefOr[InstructionsContext] = js.undefined
  var event: String
}

object Event {
  @scala.inline
  def apply(event: String, context: InstructionsContext = null): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

