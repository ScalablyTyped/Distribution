package typings.reactDayPicker.modifiersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterModifier extends _Modifier {
  var after: Date
}

object AfterModifier {
  @scala.inline
  def apply(after: Date): AfterModifier = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterModifier]
  }
}

