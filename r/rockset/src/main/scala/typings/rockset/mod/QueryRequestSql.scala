package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequestSql extends StObject {
  
  // list of named parameters
  var parameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  
  // SQL query as a string
  var query: String
}
object QueryRequestSql {
  
  inline def apply(query: String): QueryRequestSql = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequestSql]
  }
  
  extension [Self <: QueryRequestSql](x: Self) {
    
    inline def setParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
