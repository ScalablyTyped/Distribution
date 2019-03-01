package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var format: java.lang.String
  var test: js.UndefOr[js.Function1[/* field */ slonikLib.slonikMod.FieldType, scala.Boolean]] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(
    format: java.lang.String,
    test: js.Function1[/* field */ slonikLib.slonikMod.FieldType, scala.Boolean] = null
  ): Anon_Field = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_Field]
  }
}

