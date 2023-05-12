package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distUtilsMod.AgnosticDataRouteMatch
import typings.remixRunRouter.distUtilsMod.DeferredData
import typings.remixRunRouter.distUtilsMod.RouteData
import typings.std.Headers
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticHandlerContext extends StObject {
  
  var _deepestRenderedBoundaryId: js.UndefOr[String | Null] = js.undefined
  
  var actionData: RouteData | Null
  
  var actionHeaders: Record[String, Headers]
  
  var activeDeferreds: (Record[String, DeferredData]) | Null
  
  var basename: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['basename'] */ js.Any
  
  var errors: RouteData | Null
  
  var loaderData: RouteData
  
  var loaderHeaders: Record[String, Headers]
  
  var location: Location
  
  var matches: js.Array[AgnosticDataRouteMatch]
  
  var statusCode: Double
}
object StaticHandlerContext {
  
  inline def apply(
    actionHeaders: Record[String, Headers],
    basename: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['basename'] */ js.Any,
    loaderData: RouteData,
    loaderHeaders: Record[String, Headers],
    location: Location,
    matches: js.Array[AgnosticDataRouteMatch],
    statusCode: Double
  ): StaticHandlerContext = {
    val __obj = js.Dynamic.literal(actionHeaders = actionHeaders.asInstanceOf[js.Any], basename = basename.asInstanceOf[js.Any], loaderData = loaderData.asInstanceOf[js.Any], loaderHeaders = loaderHeaders.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], actionData = null, activeDeferreds = null, errors = null)
    __obj.asInstanceOf[StaticHandlerContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticHandlerContext] (val x: Self) extends AnyVal {
    
    inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
    
    inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
    
    inline def setActionHeaders(value: Record[String, Headers]): Self = StObject.set(x, "actionHeaders", value.asInstanceOf[js.Any])
    
    inline def setActiveDeferreds(value: Record[String, DeferredData]): Self = StObject.set(x, "activeDeferreds", value.asInstanceOf[js.Any])
    
    inline def setActiveDeferredsNull: Self = StObject.set(x, "activeDeferreds", null)
    
    inline def setBasename(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/router.Router['basename'] */ js.Any
    ): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: RouteData): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setLoaderData(value: RouteData): Self = StObject.set(x, "loaderData", value.asInstanceOf[js.Any])
    
    inline def setLoaderHeaders(value: Record[String, Headers]): Self = StObject.set(x, "loaderHeaders", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[AgnosticDataRouteMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: AgnosticDataRouteMatch*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def set_deepestRenderedBoundaryId(value: String): Self = StObject.set(x, "_deepestRenderedBoundaryId", value.asInstanceOf[js.Any])
    
    inline def set_deepestRenderedBoundaryIdNull: Self = StObject.set(x, "_deepestRenderedBoundaryId", null)
    
    inline def set_deepestRenderedBoundaryIdUndefined: Self = StObject.set(x, "_deepestRenderedBoundaryId", js.undefined)
  }
}
