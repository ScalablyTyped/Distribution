package typings.sequelize.mod

import typings.sequelize.AnonField
import typings.sequelize.sequelizeStrings.`foreign key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddForeignKeyConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var onDelete: String
  var onUpdate: String
  var references: js.UndefOr[AnonField] = js.undefined
  var `type`: `foreign key`
}

object AddForeignKeyConstraintOptions {
  @scala.inline
  def apply(
    onDelete: String,
    onUpdate: String,
    `type`: `foreign key`,
    name: String = null,
    references: AnonField = null
  ): AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddForeignKeyConstraintOptions]
  }
}

