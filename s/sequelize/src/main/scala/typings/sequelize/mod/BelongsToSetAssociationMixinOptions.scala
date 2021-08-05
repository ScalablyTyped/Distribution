package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the setAssociation mixin of the belongsTo association.
  * @see BelongsToSetAssociationMixin
  */
trait BelongsToSetAssociationMixinOptions extends StObject {
  
  /**
    * Skip saving this after setting the foreign key if false.
    */
  var save: js.UndefOr[Boolean] = js.undefined
}
object BelongsToSetAssociationMixinOptions {
  
  inline def apply(): BelongsToSetAssociationMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BelongsToSetAssociationMixinOptions]
  }
  
  extension [Self <: BelongsToSetAssociationMixinOptions](x: Self) {
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
