package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with belongsTo relationship
  *
  * @see Association class belongsTo method
  */
@js.native
trait AssociationOptionsBelongsTo extends AssociationOptions {
  
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.native
  
  /**
    * The name of the field to use as the key for the association in the target table. Defaults to the primary
    * key of the target table
    */
  var targetKey: js.UndefOr[String] = js.native
}
object AssociationOptionsBelongsTo {
  
  @scala.inline
  def apply(): AssociationOptionsBelongsTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsBelongsTo]
  }
  
  @scala.inline
  implicit class AssociationOptionsBelongsToMutableBuilder[Self <: AssociationOptionsBelongsTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: DataTypeAbstract): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
    
    @scala.inline
    def setTargetKey(value: String): Self = StObject.set(x, "targetKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyUndefined: Self = StObject.set(x, "targetKey", js.undefined)
  }
}
