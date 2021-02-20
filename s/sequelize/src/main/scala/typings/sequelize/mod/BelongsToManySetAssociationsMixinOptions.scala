package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the setAssociations mixin of the belongsToMany association.
  * @see BelongsToManySetAssociationsMixin
  */
@js.native
trait BelongsToManySetAssociationsMixinOptions extends StObject {
  
  /**
    * Run validation for the join model.
    */
  var validate: js.UndefOr[Boolean] = js.native
}
object BelongsToManySetAssociationsMixinOptions {
  
  @scala.inline
  def apply(): BelongsToManySetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToManySetAssociationsMixinOptions]
  }
  
  @scala.inline
  implicit class BelongsToManySetAssociationsMixinOptionsMutableBuilder[Self <: BelongsToManySetAssociationsMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
