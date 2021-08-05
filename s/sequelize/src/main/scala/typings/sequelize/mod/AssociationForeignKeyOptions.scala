package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Foreign Key Options
  *
  * @see AssociationOptions
  */
trait AssociationForeignKeyOptions
  extends StObject
     with ColumnOptions {
  
  /**
    *  Attribute name for the relation
    */
  var name: js.UndefOr[String] = js.undefined
  
  var unique: js.UndefOr[Boolean | String] = js.undefined
}
object AssociationForeignKeyOptions {
  
  inline def apply(): AssociationForeignKeyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationForeignKeyOptions]
  }
  
  extension [Self <: AssociationForeignKeyOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUnique(value: Boolean | String): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
