package typings.sequelize.mod

import typings.sequelize.anon.Field
import typings.sequelize.sequelizeStrings.`foreign key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddForeignKeyConstraintOptions extends AddConstraintOptions {
  
  var name: js.UndefOr[String] = js.native
  
  var onDelete: String = js.native
  
  var onUpdate: String = js.native
  
  var references: js.UndefOr[Field] = js.native
  
  var `type`: `foreign key` = js.native
}
object AddForeignKeyConstraintOptions {
  
  @scala.inline
  def apply(onDelete: String, onUpdate: String, `type`: `foreign key`): AddForeignKeyConstraintOptions = {
    val __obj = js.Dynamic.literal(onDelete = onDelete.asInstanceOf[js.Any], onUpdate = onUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddForeignKeyConstraintOptions]
  }
  
  @scala.inline
  implicit class AddForeignKeyConstraintOptionsOps[Self <: AddForeignKeyConstraintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnDelete(value: String): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `foreign key`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReferences(value: Field): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
  }
}
