package typings.remixRunRouter.anon

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distUtilsMod.JsonValue
import typings.remixRunRouter.distUtilsMod.V7FormMethod
import typings.remixRunRouter.remixRunRouterStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormMethod extends StObject {
  
  var formAction: js.UndefOr[String] = js.undefined
  
  var formData: js.UndefOr[typings.std.FormData] = js.undefined
  
  var formEncType: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormEncType] = js.undefined
  
  var formMethod: js.UndefOr[typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod] = js.undefined
  
  var json: js.UndefOr[JsonValue] = js.undefined
  
  var location: Location
  
  var state: loading
  
  var text: js.UndefOr[String] = js.undefined
}
object FormMethod {
  
  inline def apply(location: Location): FormMethod = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], state = "loading")
    __obj.asInstanceOf[FormMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormMethod] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setJson(value: JsonValue): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonNull: Self = StObject.set(x, "json", null)
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setState(value: loading): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
