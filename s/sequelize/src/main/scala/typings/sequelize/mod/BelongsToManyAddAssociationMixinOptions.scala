package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the addAssociation mixin of the belongsToMany association.
  * @see BelongsToManyAddAssociationMixin
  */
trait BelongsToManyAddAssociationMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object BelongsToManyAddAssociationMixinOptions {
  
  inline def apply(): BelongsToManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToManyAddAssociationMixinOptions]
  }
  
  extension [Self <: BelongsToManyAddAssociationMixinOptions](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
