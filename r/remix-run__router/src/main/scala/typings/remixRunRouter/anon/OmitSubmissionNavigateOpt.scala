package typings.remixRunRouter.anon

import typings.remixRunRouter.distRouterMod.RelativeRoutingType
import typings.remixRunRouter.distRouterMod.RouterFetchOptions
import typings.remixRunRouter.distUtilsMod.HTMLFormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@remix-run/router.@remix-run/router/dist/router.SubmissionNavigateOptions, 'replace'> */
trait OmitSubmissionNavigateOpt
  extends StObject
     with RouterFetchOptions {
  
  var formData: typings.std.FormData
  
  var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[HTMLFormMethod] = js.undefined
  
  var fromRouteId: js.UndefOr[String] = js.undefined
  
  var preventScrollReset: js.UndefOr[Boolean] = js.undefined
  
  var relative: js.UndefOr[RelativeRoutingType] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
}
object OmitSubmissionNavigateOpt {
  
  inline def apply(formData: typings.std.FormData): OmitSubmissionNavigateOpt = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSubmissionNavigateOpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitSubmissionNavigateOpt] (val x: Self) extends AnyVal {
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: HTMLFormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
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
