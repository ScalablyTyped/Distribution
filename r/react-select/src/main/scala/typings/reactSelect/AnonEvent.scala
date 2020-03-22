package typings.reactSelect

import typings.reactSelect.accessibilityMod.InstructionsContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var context: js.UndefOr[InstructionsContext] = js.undefined
  var event: String
}

object AnonEvent {
  @scala.inline
  def apply(event: String, context: InstructionsContext = null): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

