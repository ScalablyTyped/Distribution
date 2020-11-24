package typings.select2.mod

import typings.select2.anon.More
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessedResult[Result] extends js.Object {
  
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
  implicit class ProcessedResultOps[Self <: ProcessedResult[_], Result] (val x: Self with ProcessedResult[Result]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResultsVarargs(value: Result*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Result]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: More): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
  }
}
