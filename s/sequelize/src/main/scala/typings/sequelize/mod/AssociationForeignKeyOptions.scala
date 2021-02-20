package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
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
  implicit class AssociationForeignKeyOptionsMutableBuilder[Self <: AssociationForeignKeyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean | String): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
