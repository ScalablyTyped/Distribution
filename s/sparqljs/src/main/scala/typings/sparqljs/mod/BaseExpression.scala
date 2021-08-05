package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseExpression extends StObject {
  
  var distinct: js.UndefOr[Boolean] = js.undefined
  
  var `type`: String
}
object BaseExpression {
  
  inline def apply(`type`: String): BaseExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseExpression]
  }
  
  extension [Self <: BaseExpression](x: Self) {
    
    inline def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    inline def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
