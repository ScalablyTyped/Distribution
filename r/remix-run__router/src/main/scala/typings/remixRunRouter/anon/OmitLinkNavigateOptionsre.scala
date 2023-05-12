package typings.remixRunRouter.anon

import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.RouterFetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@remix-run/router.@remix-run/router/dist/router.LinkNavigateOptions, 'replace'> */
trait OmitLinkNavigateOptionsre
  extends StObject
     with RouterFetchOptions {
  
  var fromRouteId: js.UndefOr[String] = js.undefined
  
  var preventScrollReset: js.UndefOr[Boolean] = js.undefined
  
  var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object OmitLinkNavigateOptionsre {
  
  inline def apply(): OmitLinkNavigateOptionsre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitLinkNavigateOptionsre]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitLinkNavigateOptionsre] (val x: Self) extends AnyVal {
    
    inline def setFromRouteId(value: String): Self = StObject.set(x, "fromRouteId", value.asInstanceOf[js.Any])
    
    inline def setFromRouteIdUndefined: Self = StObject.set(x, "fromRouteId", js.undefined)
    
    inline def setPreventScrollReset(value: Boolean): Self = StObject.set(x, "preventScrollReset", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollResetUndefined: Self = StObject.set(x, "preventScrollReset", js.undefined)
    
    inline def setRelative(value: RelativeRoutingType): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
