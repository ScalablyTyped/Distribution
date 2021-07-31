package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the setAssociation mixin of the hasOne association.
  * @see HasOneSetAssociationMixin
  */
trait HasOneSetAssociationMixinOptions extends StObject {
  
  /**
    * Skip saving this after setting the foreign key if false.
    */
  var save: js.UndefOr[Boolean] = js.undefined
}
object HasOneSetAssociationMixinOptions {
  
  @scala.inline
  def apply(): HasOneSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasOneSetAssociationMixinOptions]
  }
  
  @scala.inline
  implicit class HasOneSetAssociationMixinOptionsMutableBuilder[Self <: HasOneSetAssociationMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
