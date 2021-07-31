package typings.reduxLittleRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location
  extends StObject
     with HistoryLocation {
  
  var basename: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[LocationOptions] = js.undefined
  
  var params: js.UndefOr[Params] = js.undefined
  
  var previous: js.UndefOr[Location] = js.undefined
  
  var query: js.UndefOr[Query] = js.undefined
  
  var queue: js.UndefOr[js.Array[Location]] = js.undefined
  
  var result: js.UndefOr[ObjectLiteral[js.Any]] = js.undefined
  
  var routes: js.UndefOr[Routes] = js.undefined
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    @scala.inline
    def setOptions(value: LocationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setPrevious(value: Location): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setQueue(value: js.Array[Location]): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    @scala.inline
    def setQueueVarargs(value: Location*): Self = StObject.set(x, "queue", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: ObjectLiteral[js.Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setRoutes(value: Routes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
  }
}
