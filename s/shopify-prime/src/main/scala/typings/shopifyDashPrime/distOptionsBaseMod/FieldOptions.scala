package typings.shopifyDashPrime.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOptions extends js.Object {
  /**
    * A comma-separated list of fields that will be returned instead of the whole object.
    */
  var fields: js.UndefOr[String] = js.undefined
}

object FieldOptions {
  @scala.inline
  def apply(fields: String = null): FieldOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOptions]
  }
}

