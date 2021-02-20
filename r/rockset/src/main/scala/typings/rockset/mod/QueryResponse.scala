package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponse extends StObject {
  
  // meta information about each column in the result set
  var column_fields: js.UndefOr[js.Array[QueryFieldType]] = js.native
  
  // list of fields returned by the query
  var fields: js.UndefOr[js.Array[QueryFieldType]] = js.native
  
  // list of objects returned by the query
  var results: js.UndefOr[js.Array[js.Object]] = js.native
  
  // meta information about the query
  var stats: js.UndefOr[QueryResponseStats] = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn_fields(value: js.Array[QueryFieldType]): Self = StObject.set(x, "column_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_fieldsUndefined: Self = StObject.set(x, "column_fields", js.undefined)
    
    @scala.inline
    def setColumn_fieldsVarargs(value: QueryFieldType*): Self = StObject.set(x, "column_fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[QueryFieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: QueryFieldType*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[js.Object]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: js.Object*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setStats(value: QueryResponseStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
  }
}
