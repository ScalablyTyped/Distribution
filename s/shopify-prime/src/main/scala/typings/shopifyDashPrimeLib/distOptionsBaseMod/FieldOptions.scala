package typings
package shopifyDashPrimeLib.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldOptions extends js.Object {
  /**
    * A comma-separated list of fields that will be returned instead of the whole object.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
}

object FieldOptions {
  @scala.inline
  def apply(fields: java.lang.String = null): FieldOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[FieldOptions]
  }
}

