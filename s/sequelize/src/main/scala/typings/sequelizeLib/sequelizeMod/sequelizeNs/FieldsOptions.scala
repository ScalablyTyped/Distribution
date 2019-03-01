package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsOptions extends js.Object {
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object FieldsOptions {
  @scala.inline
  def apply(fields: js.Array[java.lang.String] = null, validate: js.UndefOr[scala.Boolean] = js.undefined): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[FieldsOptions]
  }
}

