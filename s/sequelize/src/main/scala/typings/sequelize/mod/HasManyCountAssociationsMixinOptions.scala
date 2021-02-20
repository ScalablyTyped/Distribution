package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for the countAssociations mixin of the hasMany association.
  * @see HasManyCountAssociationsMixin
  */
@js.native
trait HasManyCountAssociationsMixinOptions extends StObject {
  
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[String | Boolean] = js.native
  
  /**
    * An optional where clause to limit the associated models.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object HasManyCountAssociationsMixinOptions {
  
  @scala.inline
  def apply(): HasManyCountAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasManyCountAssociationsMixinOptions]
  }
  
  @scala.inline
  implicit class HasManyCountAssociationsMixinOptionsMutableBuilder[Self <: HasManyCountAssociationsMixinOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: String | Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
