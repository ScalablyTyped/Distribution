package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.anon.HasErrorBoundary
import typings.remixRunRouter.distUtilsMod.AgnosticRouteObject
import typings.remixRunRouter.distUtilsMod.DetectErrorBoundaryFunction
import typings.remixRunRouter.distUtilsMod.MapRoutePropertiesFunction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStaticHandlerOptions extends StObject {
  
  var basename: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use `mapRouteProperties` instead
    */
  var detectErrorBoundary: js.UndefOr[DetectErrorBoundaryFunction] = js.undefined
  
  var mapRouteProperties: js.UndefOr[MapRoutePropertiesFunction] = js.undefined
}
object CreateStaticHandlerOptions {
  
  inline def apply(): CreateStaticHandlerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStaticHandlerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStaticHandlerOptions] (val x: Self) extends AnyVal {
    
    inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
    
    inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
    
    inline def setDetectErrorBoundary(value: /* route */ AgnosticRouteObject => Boolean): Self = StObject.set(x, "detectErrorBoundary", js.Any.fromFunction1(value))
    
    inline def setDetectErrorBoundaryUndefined: Self = StObject.set(x, "detectErrorBoundary", js.undefined)
    
    inline def setMapRouteProperties(value: /* route */ AgnosticRouteObject => HasErrorBoundary & (Record[String, Any])): Self = StObject.set(x, "mapRouteProperties", js.Any.fromFunction1(value))
    
    inline def setMapRoutePropertiesUndefined: Self = StObject.set(x, "mapRouteProperties", js.undefined)
  }
}
