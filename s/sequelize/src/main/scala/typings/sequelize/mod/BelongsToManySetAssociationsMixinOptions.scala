package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the setAssociations mixin of the belongsToMany association.
  * @see BelongsToManySetAssociationsMixin
  */
trait BelongsToManySetAssociationsMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object BelongsToManySetAssociationsMixinOptions {
  
  inline def apply(): BelongsToManySetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToManySetAssociationsMixinOptions]
  }
  
  extension [Self <: BelongsToManySetAssociationsMixinOptions](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
