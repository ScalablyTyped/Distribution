package typings.reactDayPicker.modifiersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeModifier extends _Modifier {
  var before: Date
}

object BeforeModifier {
  @scala.inline
  def apply(before: Date): BeforeModifier = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeModifier]
  }
}

