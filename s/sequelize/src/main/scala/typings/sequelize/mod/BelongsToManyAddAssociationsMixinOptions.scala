package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the addAssociations mixin of the belongsToMany association.
  * @see BelongsToManyAddAssociationsMixin
  */
trait BelongsToManyAddAssociationsMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object BelongsToManyAddAssociationsMixinOptions {
  
  inline def apply(): BelongsToManyAddAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToManyAddAssociationsMixinOptions]
  }
  
  extension [Self <: BelongsToManyAddAssociationsMixinOptions](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
