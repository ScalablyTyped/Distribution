package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the addAssociations mixin of the hasMany association.
  * @see HasManyAddAssociationsMixin
  */
trait HasManyAddAssociationsMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object HasManyAddAssociationsMixinOptions {
  
  @scala.inline
  def apply(): HasManyAddAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManyAddAssociationsMixinOptions]
  }
  
  @scala.inline
  implicit class HasManyAddAssociationsMixinOptionsMutableBuilder[Self <: HasManyAddAssociationsMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
