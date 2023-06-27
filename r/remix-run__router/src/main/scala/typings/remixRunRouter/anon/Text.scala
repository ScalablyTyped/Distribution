package typings.remixRunRouter.anon

import typings.remixRunRouter.distUtilsMod.Submission
import typings.remixRunRouter.distUtilsMod.V7FormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text
  extends StObject
     with Submission {
  
  var formAction: String
  
  var formData: typings.std.FormData
  
  var formEncType: typings.remixRunRouter.distUtilsMod.FormEncType
  
  var formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod
  
  var json: Unit
  
  var text: Unit
}
object Text {
  
  inline def apply(
    formAction: String,
    formData: typings.std.FormData,
    formEncType: typings.remixRunRouter.distUtilsMod.FormEncType,
    formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod,
    json: Unit,
    text: Unit
  ): Text = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: typings.std.FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setJson(value: Unit): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setText(value: Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
