package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends StObject {
  
  // details about the query
  var sql: js.UndefOr[QueryRequestSql] = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestMutableBuilder[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSql(value: QueryRequestSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
