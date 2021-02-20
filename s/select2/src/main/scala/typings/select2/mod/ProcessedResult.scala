package typings.select2.mod

import typings.select2.anon.More
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessedResult[Result] extends StObject {
  
  var pagination: js.UndefOr[More] = js.native
  
  var results: js.Array[Result] = js.native
}
object ProcessedResult {
  
  @scala.inline
  def apply[Result](results: js.Array[Result]): ProcessedResult[Result] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedResult[Result]]
  }
  
  @scala.inline
  implicit class ProcessedResultMutableBuilder[Self <: ProcessedResult[_], Result] (val x: Self with ProcessedResult[Result]) extends AnyVal {
    
    @scala.inline
    def setPagination(value: More): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
