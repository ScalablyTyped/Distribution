package typings.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResult extends StObject {
  
  var RESULT: js.Array[QueryResultItem | QueryResultItemNoDoc]
  
  var RESULT_LENGTH: Double
}
object QueryResult {
  
  inline def apply(RESULT: js.Array[QueryResultItem | QueryResultItemNoDoc], RESULT_LENGTH: Double): QueryResult = {
    val __obj = js.Dynamic.literal(RESULT = RESULT.asInstanceOf[js.Any], RESULT_LENGTH = RESULT_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    inline def setRESULT(value: js.Array[QueryResultItem | QueryResultItemNoDoc]): Self = StObject.set(x, "RESULT", value.asInstanceOf[js.Any])
    
    inline def setRESULTVarargs(value: (QueryResultItem | QueryResultItemNoDoc)*): Self = StObject.set(x, "RESULT", js.Array(value*))
    
    inline def setRESULT_LENGTH(value: Double): Self = StObject.set(x, "RESULT_LENGTH", value.asInstanceOf[js.Any])
  }
}
