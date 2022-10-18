package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaSql extends StObject {
  
  /**
    * default parameters for this Query Lambda
    * @type {Array<QueryParameter>}
    * @memberof QueryLambdaSql
    */
  var default_parameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  
  /**
    * SQL text
    * @type {string}
    * @memberof QueryLambdaSql
    */
  var query: String
}
object QueryLambdaSql {
  
  inline def apply(query: String): QueryLambdaSql = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLambdaSql]
  }
  
  extension [Self <: QueryLambdaSql](x: Self) {
    
    inline def setDefault_parameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "default_parameters", value.asInstanceOf[js.Any])
    
    inline def setDefault_parametersUndefined: Self = StObject.set(x, "default_parameters", js.undefined)
    
    inline def setDefault_parametersVarargs(value: QueryParameter*): Self = StObject.set(x, "default_parameters", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
