package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with hasMany relationship
  *
  * @see Association class hasMany method
  */
trait AssociationOptionsHasMany
  extends StObject
     with AssociationOptionsManyToMany {
  
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
  
  /**
    * A string to represent the name of the field to use as the key for an 1 to many association in the source table.
    *
    * @see http://docs.sequelizejs.com/class/lib/model.js~Model.html#static-method-hasMany
    * @see https://github.com/sequelize/sequelize/blob/b4fd46426db9cdbb97074bea121203d565e4195d/lib/associations/has-many.js#L81
    */
  var sourceKey: js.UndefOr[String] = js.undefined
}
object AssociationOptionsHasMany {
  
  inline def apply(): AssociationOptionsHasMany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsHasMany]
  }
  
  extension [Self <: AssociationOptionsHasMany](x: Self) {
    
    inline def setKeyType(value: DataTypeAbstract): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    inline def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
    
    inline def setSourceKeyUndefined: Self = StObject.set(x, "sourceKey", js.undefined)
  }
}
