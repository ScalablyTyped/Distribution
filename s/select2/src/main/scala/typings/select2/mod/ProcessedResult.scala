package typings.select2.mod

import typings.select2.anon.More
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessedResult[Result] extends StObject {
  
  var pagination: js.UndefOr[More] = js.undefined
  
  var results: js.Array[Result]
}
object ProcessedResult {
  
  inline def apply[Result](results: js.Array[Result]): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessedResult[?], Result] (val x: Self & ProcessedResult[Result]) extends AnyVal {
    
    inline def setPagination(value: More): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
