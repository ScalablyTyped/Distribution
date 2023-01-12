package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
  /**
    * details about the query
    * @type {QueryRequestSql}
    * @memberof QueryRequest
    */
  var sql: js.UndefOr[QueryRequestSql] = js.undefined
}
object QueryRequest {
  
  inline def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
    inline def setSql(value: QueryRequestSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
