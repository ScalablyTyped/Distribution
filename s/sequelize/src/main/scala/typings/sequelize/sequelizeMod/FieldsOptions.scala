package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsOptions extends js.Object {
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object FieldsOptions {
  @scala.inline
  def apply(fields: js.Array[String] = null, validate: js.UndefOr[Boolean] = js.undefined): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsOptions]
  }
}

