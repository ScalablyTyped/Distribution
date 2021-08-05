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
  
  inline def apply(): HasOneSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasOneSetAssociationMixinOptions]
  }
  
  extension [Self <: HasOneSetAssociationMixinOptions](x: Self) {
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
