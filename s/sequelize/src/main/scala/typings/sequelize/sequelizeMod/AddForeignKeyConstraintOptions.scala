package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Field
import typings.sequelize.sequelizeStrings.`foreign key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddForeignKeyConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var onDelete: String
  var onUpdate: String
  var references: js.UndefOr[Anon_Field] = js.undefined
  var `type`: `foreign key`
}

object AddForeignKeyConstraintOptions {
  @scala.inline
  def apply(
    onDelete: String,
    onUpdate: String,
    `type`: `foreign key`,
    name: String = null,
    references: Anon_Field = null
  ): AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete, onUpdate = onUpdate)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[AddForeignKeyConstraintOptions]
  }
}

