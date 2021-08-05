package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  inline def AddCheckConstraintOptions(): typings.sequelize.mod.AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("check")
    __obj.asInstanceOf[typings.sequelize.mod.AddCheckConstraintOptions]
  }
  
  inline def AddDefaultConstraintOptions(): typings.sequelize.mod.AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typings.sequelize.mod.AddDefaultConstraintOptions]
  }
  
  inline def AddForeignKeyConstraintOptions(onDelete: String, onUpdate: String): typings.sequelize.mod.AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("foreign key")
    __obj.asInstanceOf[typings.sequelize.mod.AddForeignKeyConstraintOptions]
  }
  
  inline def AddPrimaryKeyConstraintOptions(): typings.sequelize.mod.AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("primary key")
    __obj.asInstanceOf[typings.sequelize.mod.AddPrimaryKeyConstraintOptions]
  }
  
  inline def AddUniqueConstraintOptions(): typings.sequelize.mod.AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("unique")
    __obj.asInstanceOf[typings.sequelize.mod.AddUniqueConstraintOptions]
  }
}
