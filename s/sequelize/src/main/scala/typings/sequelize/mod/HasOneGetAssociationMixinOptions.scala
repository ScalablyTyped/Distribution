package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the getAssociation mixin of the hasOne association.
  * @see HasOneGetAssociationMixin
  */
@js.native
trait HasOneGetAssociationMixinOptions extends StObject {
  
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.native
}
object HasOneGetAssociationMixinOptions {
  
  @scala.inline
  def apply(): HasOneGetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasOneGetAssociationMixinOptions]
  }
  
  @scala.inline
  implicit class HasOneGetAssociationMixinOptionsMutableBuilder[Self <: HasOneGetAssociationMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String | Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
