package typings.reactNavigationCore.anon

import typings.reactNavigationCore.reactNavigationCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  var history: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var index: Double
  
  var key: String
  
  var routeNames: js.Array[String]
  
  var routes: js.Array[Key & Params & `0`]
  
  var stale: `false`
  
  var `type`: String
}
object History {
  
  @scala.inline
  def apply(
    index: Double,
    key: String,
    routeNames: js.Array[String],
    routes: js.Array[Key & Params & `0`],
    `type`: String
  ): History = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  
  @scala.inline
  implicit class HistoryMutableBuilder[Self <: History] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistory(value: js.Array[js.Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryVarargs(value: js.Any*): Self = StObject.set(x, "history", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = StObject.set(x, "routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNamesVarargs(value: String*): Self = StObject.set(x, "routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[Key & Params & `0`]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: (Key & Params & `0`)*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStale(value: `false`): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
