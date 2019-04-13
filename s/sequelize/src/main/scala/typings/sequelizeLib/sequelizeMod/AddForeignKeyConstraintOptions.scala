package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddForeignKeyConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onDelete: java.lang.String
  var onUpdate: java.lang.String
  var references: js.UndefOr[sequelizeLib.Anon_Field] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.`foreign key`
}

object AddForeignKeyConstraintOptions {
  @scala.inline
  def apply(
    onDelete: java.lang.String,
    onUpdate: java.lang.String,
    `type`: sequelizeLib.sequelizeLibStrings.`foreign key`,
    name: java.lang.String = null,
    references: sequelizeLib.Anon_Field = null
  ): AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete, onUpdate = onUpdate)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (references != null) __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[AddForeignKeyConstraintOptions]
  }
}

