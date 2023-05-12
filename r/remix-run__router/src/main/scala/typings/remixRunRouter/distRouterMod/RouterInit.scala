package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.HasErrorBoundary
import typings.remixRunRouter.anon.PartialFutureConfig
import typings.remixRunRouter.distHistoryMod.History
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DetectErrorBoundaryFunction
import typings.remixRunRouter.distUtilsMod.MapRoutePropertiesFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterInit extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use `mapRouteProperties` instead
    */
  var detectErrorBoundary: js.UndefOr[DetectErrorBoundaryFunction] = js.undefined
  
  var future: js.UndefOr[PartialFutureConfig] = js.undefined
  
  var history: History
  
  var hydrationData: js.UndefOr[HydrationState] = js.undefined
  
  var mapRouteProperties: js.UndefOr[MapRoutePropertiesFunction] = js.undefined
  
  var routes: js.Array[AgnosticRouteObject]
}
object RouterInit {
  
  inline def apply(history: History, routes: js.Array[AgnosticRouteObject]): RouterInit = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouterInit] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setDetectErrorBoundary(value: /* route */ AgnosticRouteObject => Boolean): Self = StObject.set(x, "detectErrorBoundary", js.Any.fromFunction1(value))
    
    inline def setDetectErrorBoundaryUndefined: Self = StObject.set(x, "detectErrorBoundary", js.undefined)
    
    inline def setFuture(value: PartialFutureConfig): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHydrationData(value: HydrationState): Self = StObject.set(x, "hydrationData", value.asInstanceOf[js.Any])
    
    inline def setHydrationDataUndefined: Self = StObject.set(x, "hydrationData", js.undefined)
    
    inline def setMapRouteProperties(value: /* route */ AgnosticRouteObject => HasErrorBoundary & (Record[String, Any])): Self = StObject.set(x, "mapRouteProperties", js.Any.fromFunction1(value))
    
    inline def setMapRoutePropertiesUndefined: Self = StObject.set(x, "mapRouteProperties", js.undefined)
    
    inline def setRoutes(value: js.Array[AgnosticRouteObject]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: AgnosticRouteObject*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
