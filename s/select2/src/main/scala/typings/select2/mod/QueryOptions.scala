package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var page: js.UndefOr[Double] = js.undefined
  
  var term: js.UndefOr[String] = js.undefined
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsMutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
