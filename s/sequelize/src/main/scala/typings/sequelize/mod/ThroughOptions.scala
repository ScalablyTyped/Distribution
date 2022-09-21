package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for a association table in n:m associations.
  *
  * @see AssociationOptionsBelongsToMany
  */
trait ThroughOptions extends StObject {
  
  /**
    * The model used to join both sides of the N:M association.
    */
  var model: Model[Any, Any, Any]
  
  /**
    * A key/value set that will be used for association create and find defaults on the through model.
    * (Remember to add the attributes to the through model)
    */
  var scope: js.UndefOr[AssociationScope] = js.undefined
  
  /**
    * If true a unique key will be generated from the foreign keys used (might want to turn this off and create
    * specific unique keys when using scopes)
    *
    * Defaults to true
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}
object ThroughOptions {
  
  inline def apply(model: Model[Any, Any, Any]): ThroughOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThroughOptions]
  }
  
  extension [Self <: ThroughOptions](x: Self) {
    
    inline def setModel(value: Model[Any, Any, Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setScope(value: AssociationScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
