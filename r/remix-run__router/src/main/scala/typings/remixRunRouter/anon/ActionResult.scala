package typings.remixRunRouter.anon

import typings.remixRunRouter.distUtilsMod.DataResult
import typings.remixRunRouter.distUtilsMod.Params
import typings.remixRunRouter.distUtilsMod.V7FormMethod
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionResult extends StObject {
  
  var actionResult: js.UndefOr[DataResult] = js.undefined
  
  var currentParams: Params[String]
  
  var currentUrl: URL
  
  var defaultShouldRevalidate: Boolean
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formData: js.UndefOr[typings.std.FormData] = js.undefined
  
  var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod] = js.undefined
  
  var nextParams: Params[String]
  
  var nextUrl: URL
}
object ActionResult {
  
  inline def apply(
    currentParams: Params[String],
    currentUrl: URL,
    defaultShouldRevalidate: Boolean,
    nextParams: Params[String],
    nextUrl: URL
  ): ActionResult = {
    val __obj = js.Dynamic.literal(currentParams = currentParams.asInstanceOf[js.Any], currentUrl = currentUrl.asInstanceOf[js.Any], defaultShouldRevalidate = defaultShouldRevalidate.asInstanceOf[js.Any], nextParams = nextParams.asInstanceOf[js.Any], nextUrl = nextUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionResult] (val x: Self) extends AnyVal {
    
    inline def setActionResult(value: DataResult): Self = StObject.set(x, "actionResult", value.asInstanceOf[js.Any])
    
    inline def setActionResultUndefined: Self = StObject.set(x, "actionResult", js.undefined)
    
    inline def setCurrentParams(value: Params[String]): Self = StObject.set(x, "currentParams", value.asInstanceOf[js.Any])
    
    inline def setCurrentUrl(value: URL): Self = StObject.set(x, "currentUrl", value.asInstanceOf[js.Any])
    
    inline def setDefaultShouldRevalidate(value: Boolean): Self = StObject.set(x, "defaultShouldRevalidate", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setNextParams(value: Params[String]): Self = StObject.set(x, "nextParams", value.asInstanceOf[js.Any])
    
    inline def setNextUrl(value: URL): Self = StObject.set(x, "nextUrl", value.asInstanceOf[js.Any])
  }
}
