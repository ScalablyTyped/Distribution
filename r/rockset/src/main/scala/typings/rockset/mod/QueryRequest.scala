package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
  // details about the query
  var sql: js.UndefOr[QueryRequestSql] = js.undefined
}
object QueryRequest {
  
  inline def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  extension [Self <: QueryRequest](x: Self) {
    
    inline def setSql(value: QueryRequestSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
