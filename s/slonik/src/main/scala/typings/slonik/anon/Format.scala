package typings.slonik.anon

import typings.slonik.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: String
  var test: js.UndefOr[js.Function1[/* field */ FieldType, Boolean]] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: String, test: /* field */ FieldType => Boolean = null): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[Format]
  }
}

