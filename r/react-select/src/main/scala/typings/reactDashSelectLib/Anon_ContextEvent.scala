package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextEvent extends js.Object {
  var context: js.UndefOr[reactDashSelectLib.srcAccessibilityMod.InstructionsContext] = js.undefined
  var event: java.lang.String
}

object Anon_ContextEvent {
  @scala.inline
  def apply(
    event: java.lang.String,
    context: reactDashSelectLib.srcAccessibilityMod.InstructionsContext = null
  ): Anon_ContextEvent = {
    val __obj = js.Dynamic.literal(event = event)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Anon_ContextEvent]
  }
}

