package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Field
import typings.sequelize.sequelizeStrings.`foreign key`
import typings.sequelize.sequelizeStrings.`primary key`
import typings.sequelize.sequelizeStrings.check
import typings.sequelize.sequelizeStrings.default
import typings.sequelize.sequelizeStrings.unique_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sequelize.sequelizeMod.AddUniqueConstraintOptions
  - typings.sequelize.sequelizeMod.AddDefaultConstraintOptions
  - typings.sequelize.sequelizeMod.AddCheckConstraintOptions
  - typings.sequelize.sequelizeMod.AddPrimaryKeyConstraintOptions
  - typings.sequelize.sequelizeMod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends js.Object

object AddConstraintOptions {
  @scala.inline
  def AddDefaultConstraintOptions(`type`: default, defaultValue: js.Any = null, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddForeignKeyConstraintOptions(
    onDelete: String,
    onUpdate: String,
    `type`: `foreign key`,
    name: String = null,
    references: Anon_Field = null
  ): AddConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddCheckConstraintOptions(`type`: check, name: String = null, where: AnyWhereOptions = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_, name: String = null): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
}

