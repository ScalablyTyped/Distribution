package typings.remixRunRouter.anon

import typings.remixRunRouter.distRouterMod.BaseSubmissionOptions
import typings.remixRunRouter.distUtilsMod.HTMLFormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  formData :std.FormData,   body :undefined} & {  formMethod :@remix-run/router.@remix-run/router/dist/utils.HTMLFormMethod | undefined,   formEncType :@remix-run/router.@remix-run/router/dist/utils.FormEncType | undefined} */
trait formDataFormDatabodyundef
  extends StObject
     with BaseSubmissionOptions {
  
  var body: Unit
  
  var formData: typings.std.FormData
  
  var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[HTMLFormMethod] = js.undefined
}
object formDataFormDatabodyundef {
  
  inline def apply(body: Unit, formData: typings.std.FormData): formDataFormDatabodyundef = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[formDataFormDatabodyundef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: formDataFormDatabodyundef] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Unit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: HTMLFormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
  }
}
