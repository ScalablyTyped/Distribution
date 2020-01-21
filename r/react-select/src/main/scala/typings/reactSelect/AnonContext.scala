package typings.reactSelect

import typings.reactSelect.accessibilityMod.ValueEventContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: ValueEventContext
  var event: String
}

object AnonContext {
  @scala.inline
  def apply(context: ValueEventContext, event: String): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContext]
  }
}

