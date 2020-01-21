package typings.slonik

import typings.slonik.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonField extends js.Object {
  var format: String
  var test: js.UndefOr[js.Function1[/* field */ FieldType, Boolean]] = js.undefined
}

object AnonField {
  @scala.inline
  def apply(format: String, test: /* field */ FieldType => Boolean = null): AnonField = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[AnonField]
  }
}

