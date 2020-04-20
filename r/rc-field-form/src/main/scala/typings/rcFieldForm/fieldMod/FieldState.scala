package typings.rcFieldForm.fieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldState extends js.Object {
  var resetCount: Double
}

object FieldState {
  @scala.inline
  def apply(resetCount: Double): FieldState = {
    val __obj = js.Dynamic.literal(resetCount = resetCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldState]
  }
}

