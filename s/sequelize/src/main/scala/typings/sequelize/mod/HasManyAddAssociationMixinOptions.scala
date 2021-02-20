package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the addAssociation mixin of the hasMany association.
  * @see HasManyAddAssociationMixin
  */
@js.native
trait HasManyAddAssociationMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.native
}
object HasManyAddAssociationMixinOptions {
  
  @scala.inline
  def apply(): HasManyAddAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManyAddAssociationMixinOptions]
  }
  
  @scala.inline
  implicit class HasManyAddAssociationMixinOptionsMutableBuilder[Self <: HasManyAddAssociationMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
