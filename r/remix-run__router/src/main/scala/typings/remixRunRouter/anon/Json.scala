package typings.remixRunRouter.anon

import typings.remixRunRouter.distHistoryMod.Location
import typings.remixRunRouter.distUtilsMod.JsonValue
import typings.remixRunRouter.distUtilsMod.V7FormMethod
import typings.remixRunRouter.remixRunRouterStrings.submitting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Json extends StObject {
  
  var formAction: String
  
  var formData: js.UndefOr[typings.std.FormData] = js.undefined
  
  var formEncType: typings.remixRunRouter.distUtilsMod.FormEncType
  
  var formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod
  
  var json: js.UndefOr[JsonValue] = js.undefined
  
  var location: Location
  
  var state: submitting
  
  var text: js.UndefOr[String] = js.undefined
}
object Json {
  
  inline def apply(
    formAction: String,
    formEncType: typings.remixRunRouter.distUtilsMod.FormEncType,
    formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod,
    location: Location
  ): Json = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], state = "submitting")
    __obj.asInstanceOf[Json]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Json] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setJson(value: JsonValue): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonNull: Self = StObject.set(x, "json", null)
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setState(value: submitting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
