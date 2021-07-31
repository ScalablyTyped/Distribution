package typings.sequelize.mod

import typings.sequelize.anon.Field
import typings.sequelize.sequelizeStrings.`foreign key`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddForeignKeyConstraintOptions
  extends StObject
     with AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.undefined
  
  var onDelete: String
  
  var onUpdate: String
  
  var references: js.UndefOr[Field] = js.undefined
  
  var `type`: `foreign key`
}
object AddForeignKeyConstraintOptions {
  
  @scala.inline
  def apply(onDelete: String, onUpdate: String): AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("foreign key")
    __obj.asInstanceOf[AddForeignKeyConstraintOptions]
  }
  
  @scala.inline
  implicit class AddForeignKeyConstraintOptionsMutableBuilder[Self <: AddForeignKeyConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferences(value: Field): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setType(value: `foreign key`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
