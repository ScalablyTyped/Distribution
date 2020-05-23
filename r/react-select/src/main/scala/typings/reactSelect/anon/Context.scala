package typings.reactSelect.anon

import typings.reactSelect.accessibilityMod.ValueEventContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: ValueEventContext
  var event: String
}

object Context {
  @scala.inline
  def apply(context: ValueEventContext, event: String): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

