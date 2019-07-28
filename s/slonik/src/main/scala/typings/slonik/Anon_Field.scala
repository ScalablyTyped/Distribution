package typings.slonik

import typings.slonik.slonikMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var format: String
  var test: js.UndefOr[js.Function1[/* field */ FieldType, Boolean]] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(format: String, test: /* field */ FieldType => Boolean = null): Anon_Field = {
    val __obj = js.Dynamic.literal(format = format)
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[Anon_Field]
  }
}

