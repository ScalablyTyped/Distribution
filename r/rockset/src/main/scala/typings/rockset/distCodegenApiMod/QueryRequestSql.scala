package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequestSql extends StObject {
  
  /**
    * Row limit to use if no limit specified in the query
    * @type {number}
    * @memberof QueryRequestSql
    */
  var default_row_limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to generate warnings
    * @type {boolean}
    * @memberof QueryRequestSql
    */
  var generate_warnings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * list of named parameters
    * @type {Array<QueryParameter>}
    * @memberof QueryRequestSql
    */
  var parameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  
  /**
    * Whether to generate a performance profile for this query
    * @type {boolean}
    * @memberof QueryRequestSql
    */
  var profiling_enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SQL query as a string
    * @type {string}
    * @memberof QueryRequestSql
    */
  var query: String
}
object QueryRequestSql {
  
  inline def apply(query: String): QueryRequestSql = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRequestSql]
  }
  
  extension [Self <: QueryRequestSql](x: Self) {
    
    inline def setDefault_row_limit(value: Double): Self = StObject.set(x, "default_row_limit", value.asInstanceOf[js.Any])
    
    inline def setDefault_row_limitUndefined: Self = StObject.set(x, "default_row_limit", js.undefined)
    
    inline def setGenerate_warnings(value: Boolean): Self = StObject.set(x, "generate_warnings", value.asInstanceOf[js.Any])
    
    inline def setGenerate_warningsUndefined: Self = StObject.set(x, "generate_warnings", js.undefined)
    
    inline def setParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setProfiling_enabled(value: Boolean): Self = StObject.set(x, "profiling_enabled", value.asInstanceOf[js.Any])
    
    inline def setProfiling_enabledUndefined: Self = StObject.set(x, "profiling_enabled", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
