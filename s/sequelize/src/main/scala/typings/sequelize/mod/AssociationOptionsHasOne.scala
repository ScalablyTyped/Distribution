package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options provided when associating models with hasOne relationship
  *
  * @see Association class hasOne method
  */
trait AssociationOptionsHasOne
  extends StObject
     with AssociationOptions {
  
  /**
    * A string or a data type to represent the identifier in the table
    */
  var keyType: js.UndefOr[DataTypeAbstract] = js.undefined
}
object AssociationOptionsHasOne {
  
  @scala.inline
  def apply(): AssociationOptionsHasOne = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationOptionsHasOne]
  }
  
  @scala.inline
  implicit class AssociationOptionsHasOneMutableBuilder[Self <: AssociationOptionsHasOne] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyType(value: DataTypeAbstract): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
  }
}
