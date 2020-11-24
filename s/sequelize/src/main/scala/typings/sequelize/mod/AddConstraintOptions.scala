package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.`foreign key`
import typings.sequelize.sequelizeStrings.`primary key`
import typings.sequelize.sequelizeStrings.check
import typings.sequelize.sequelizeStrings.default
import typings.sequelize.sequelizeStrings.unique_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sequelize.mod.AddUniqueConstraintOptions
  - typings.sequelize.mod.AddDefaultConstraintOptions
  - typings.sequelize.mod.AddCheckConstraintOptions
  - typings.sequelize.mod.AddPrimaryKeyConstraintOptions
  - typings.sequelize.mod.AddForeignKeyConstraintOptions
*/
trait AddConstraintOptions extends js.Object
object AddConstraintOptions {
  
  @scala.inline
  def AddDefaultConstraintOptions(`type`: default): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  
  @scala.inline
  def AddCheckConstraintOptions(`type`: check): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`): AddConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
  
  @scala.inline
  def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String, `type`: `foreign key`): AddConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConstraintOptions]
  }
}
