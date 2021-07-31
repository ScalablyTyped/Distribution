package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Associations
// ~~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/tree/v3.4.1/lib/associations
//
/**
  * The options for the getAssociation mixin of the belongsTo association.
  * @see BelongsToGetAssociationMixin
  */
trait BelongsToGetAssociationMixinOptions extends StObject {
  
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.undefined
}
object BelongsToGetAssociationMixinOptions {
  
  @scala.inline
  def apply(): BelongsToGetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToGetAssociationMixinOptions]
  }
  
  @scala.inline
  implicit class BelongsToGetAssociationMixinOptionsMutableBuilder[Self <: BelongsToGetAssociationMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String | Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
