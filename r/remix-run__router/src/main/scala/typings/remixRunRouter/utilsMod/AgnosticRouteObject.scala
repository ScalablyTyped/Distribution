package typings.remixRunRouter.utilsMod

import typings.remixRunRouter.anon.ActionResult
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgnosticRouteObject extends StObject {
  
  var action: js.UndefOr[ActionFunction] = js.undefined
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Array[AgnosticRouteObject]] = js.undefined
  
  var handle: js.UndefOr[Any] = js.undefined
  
  var hasErrorBoundary: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var loader: js.UndefOr[LoaderFunction] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var shouldRevalidate: js.UndefOr[ShouldRevalidateFunction] = js.undefined
}
object AgnosticRouteObject {
  
  inline def apply(): AgnosticRouteObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgnosticRouteObject]
  }
  
  extension [Self <: AgnosticRouteObject](x: Self) {
    
    inline def setAction(value: /* args */ ActionFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setChildren(value: js.Array[AgnosticRouteObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: AgnosticRouteObject*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHandle(value: Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setHasErrorBoundary(value: Boolean): Self = StObject.set(x, "hasErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def setHasErrorBoundaryUndefined: Self = StObject.set(x, "hasErrorBoundary", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLoader(value: /* args */ LoaderFunctionArgs => (js.Promise[Any | Response]) | Response | Any): Self = StObject.set(x, "loader", js.Any.fromFunction1(value))
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setShouldRevalidate(value: /* args */ ActionResult => Boolean): Self = StObject.set(x, "shouldRevalidate", js.Any.fromFunction1(value))
    
    inline def setShouldRevalidateUndefined: Self = StObject.set(x, "shouldRevalidate", js.undefined)
  }
}
