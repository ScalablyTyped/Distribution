package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Foreign Key Options
  *
  * @see AssociationOptions
  */
@js.native
trait AssociationForeignKeyOptions extends ColumnOptions {
  
  /**
    *  Attribute name for the relation
    */
  var name: js.UndefOr[String] = js.native
  
  var unique: js.UndefOr[Boolean | String] = js.native
}
object AssociationForeignKeyOptions {
  
  @scala.inline
  def apply(): AssociationForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationForeignKeyOptions]
  }
  
  @scala.inline
  implicit class AssociationForeignKeyOptionsOps[Self <: AssociationForeignKeyOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean | String): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
