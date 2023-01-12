package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponse extends StObject {
  
  /**
    * list of collections queried by the query
    * @type {Array<string>}
    * @memberof QueryResponse
    */
  var collections: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * meta information about each column in the result set
    * @type {Array<QueryFieldType>}
    * @memberof QueryResponse
    */
  var column_fields: js.UndefOr[js.Array[QueryFieldType]] = js.undefined
  
  /**
    * unique id for this query
    * @type {string}
    * @memberof QueryResponse
    */
  var query_id: js.UndefOr[String] = js.undefined
  
  /**
    * list of objects returned by the query
    * @type {Array<any>}
    * @memberof QueryResponse
    */
  var results: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * meta information about the query
    * @type {QueryResponseStats}
    * @memberof QueryResponse
    */
  var stats: js.UndefOr[QueryResponseStats] = js.undefined
  
  /**
    * warnings received from the query
    * @type {Array<string>}
    * @memberof QueryResponse
    */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryResponse {
  
  inline def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
    inline def setCollections(value: js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "collections", js.undefined)
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setColumn_fields(value: js.Array[QueryFieldType]): Self = StObject.set(x, "column_fields", value.asInstanceOf[js.Any])
    
    inline def setColumn_fieldsUndefined: Self = StObject.set(x, "column_fields", js.undefined)
    
    inline def setColumn_fieldsVarargs(value: QueryFieldType*): Self = StObject.set(x, "column_fields", js.Array(value*))
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setStats(value: QueryResponseStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
