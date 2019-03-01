package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Sequelize
// ~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/sequelize.js
//
/**
  * General column options
  *
  * @see Define
  * @see AssociationForeignKeyOptions
  */
trait ColumnOptions extends js.Object {
  /**
    * If false, the column will have a NOT NULL constraint, and a not null validation will be run before an
    * instance is saved.
    */
  var allowNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A literal default value, a JavaScript function, or an SQL function (see `sequelize.fn`)
    */
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  /**
    *  If set, sequelize will map the attribute name to a different name in the database
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object ColumnOptions {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: js.Any = null,
    field: java.lang.String = null
  ): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[ColumnOptions]
  }
}

