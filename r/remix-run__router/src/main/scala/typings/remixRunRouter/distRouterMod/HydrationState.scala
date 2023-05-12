package typings.remixRunRouter.distRouterMod

import typings.remixRunRouter.distUtilsMod.RouteData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@remix-run/router.@remix-run/router/dist/router.RouterState, 'loaderData' | 'actionData' | 'errors'>> */
trait HydrationState extends StObject {
  
  var actionData: js.UndefOr[RouteData | Null] = js.undefined
  
  var errors: js.UndefOr[RouteData | Null] = js.undefined
  
  var loaderData: js.UndefOr[RouteData] = js.undefined
}
object HydrationState {
  
  inline def apply(): HydrationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HydrationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HydrationState] (val x: Self) extends AnyVal {
    
    inline def setActionData(value: RouteData): Self = StObject.set(x, "actionData", value.asInstanceOf[js.Any])
    
    inline def setActionDataNull: Self = StObject.set(x, "actionData", null)
    
    inline def setActionDataUndefined: Self = StObject.set(x, "actionData", js.undefined)
    
    inline def setErrors(value: RouteData): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsNull: Self = StObject.set(x, "errors", null)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setLoaderData(value: RouteData): Self = StObject.set(x, "loaderData", value.asInstanceOf[js.Any])
    
    inline def setLoaderDataUndefined: Self = StObject.set(x, "loaderData", js.undefined)
  }
}
