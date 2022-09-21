package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Through options for Include Options
  */
trait IncludeThroughOptions extends StObject {
  
  /**
    * A list of attributes to select from the join model for belongsToMany relations
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Filter on the join model for belongsToMany relations
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object IncludeThroughOptions {
  
  inline def apply(): IncludeThroughOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeThroughOptions]
  }
  
  extension [Self <: IncludeThroughOptions](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
