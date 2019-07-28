package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var values: js.UndefOr[String] = js.undefined
}

object Anon_Field {
  @scala.inline
  def apply(field: String = null, values: String = null): Anon_Field = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_Field]
  }
}

