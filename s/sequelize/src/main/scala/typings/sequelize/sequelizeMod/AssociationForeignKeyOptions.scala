package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Foreign Key Options
  *
  * @see AssociationOptions
  */
trait AssociationForeignKeyOptions extends ColumnOptions {
  /**
    *  Attribute name for the relation
    */
  var name: js.UndefOr[String] = js.undefined
  var unique: js.UndefOr[Boolean | String] = js.undefined
}

object AssociationForeignKeyOptions {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[Boolean] = js.undefined,
    defaultValue: js.Any = null,
    field: String = null,
    name: String = null,
    unique: Boolean | String = null
  ): AssociationForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (field != null) __obj.updateDynamic("field")(field)
    if (name != null) __obj.updateDynamic("name")(name)
    if (unique != null) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationForeignKeyOptions]
  }
}

