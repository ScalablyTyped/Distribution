package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.`foreign key`
import typings.sequelize.sequelizeStrings.`primary key`
import typings.sequelize.sequelizeStrings.check
import typings.sequelize.sequelizeStrings.unique_
import org.scalablytyped.runtime.StObject
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
trait AddConstraintOptions extends StObject
object AddConstraintOptions {
  
  @scala.inline
  def AddCheckConstraintOptions(`type`: check): typings.sequelize.mod.AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sequelize.mod.AddCheckConstraintOptions]
  }
  
  @scala.inline
  def AddDefaultConstraintOptions(`type`: typings.sequelize.sequelizeStrings.default): typings.sequelize.mod.AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sequelize.mod.AddDefaultConstraintOptions]
  }
  
  @scala.inline
  def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String, `type`: `foreign key`): typings.sequelize.mod.AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sequelize.mod.AddForeignKeyConstraintOptions]
  }
  
  @scala.inline
  def AddPrimaryKeyConstraintOptions(`type`: `primary key`): typings.sequelize.mod.AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sequelize.mod.AddPrimaryKeyConstraintOptions]
  }
  
  @scala.inline
  def AddUniqueConstraintOptions(`type`: unique_): typings.sequelize.mod.AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.sequelize.mod.AddUniqueConstraintOptions]
  }
}
