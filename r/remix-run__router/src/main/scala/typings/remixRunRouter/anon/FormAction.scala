package typings.remixRunRouter.anon

import typings.remixRunRouter.distUtilsMod.V7FormMethod
import typings.remixRunRouter.remixRunRouterStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormAction[TData] extends StObject {
  
  @JSName(" _hasFetcherDoneAnything ")
  var `Space_hasFetcherDoneAnything `: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[TData] = js.undefined
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formData: js.UndefOr[typings.std.FormData] = js.undefined
  
  var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod] = js.undefined
  
  var state: loading
}
object FormAction {
  
  inline def apply[TData](): FormAction[TData] = {
    val __obj = js.Dynamic.literal(state = "loading")
    __obj.asInstanceOf[FormAction[TData]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormAction[?], TData] (val x: Self & FormAction[TData]) extends AnyVal {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def `setSpace_hasFetcherDoneAnything `(value: Boolean): Self = StObject.set(x, " _hasFetcherDoneAnything ", value.asInstanceOf[js.Any])
    
    inline def `setSpace_hasFetcherDoneAnything Undefined`: Self = StObject.set(x, " _hasFetcherDoneAnything ", js.undefined)
    
    inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
