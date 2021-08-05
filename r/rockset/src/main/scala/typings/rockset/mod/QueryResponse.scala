package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  // meta information about each column in the result set
  var column_fields: js.UndefOr[js.Array[QueryFieldType]] = js.undefined
  
  // list of fields returned by the query
  var fields: js.UndefOr[js.Array[QueryFieldType]] = js.undefined
  
  // list of objects returned by the query
  var results: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  // meta information about the query
  var stats: js.UndefOr[QueryResponseStats] = js.undefined
}
object QueryResponse {
  
  inline def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  extension [Self <: QueryResponse](x: Self) {
    
    inline def setColumn_fields(value: js.Array[QueryFieldType]): Self = StObject.set(x, "column_fields", value.asInstanceOf[js.Any])
    
    inline def setColumn_fieldsUndefined: Self = StObject.set(x, "column_fields", js.undefined)
    
    inline def setColumn_fieldsVarargs(value: QueryFieldType*): Self = StObject.set(x, "column_fields", js.Array(value :_*))
    
    inline def setFields(value: js.Array[QueryFieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: QueryFieldType*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setResults(value: js.Array[js.Object]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: js.Object*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    inline def setStats(value: QueryResponseStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
