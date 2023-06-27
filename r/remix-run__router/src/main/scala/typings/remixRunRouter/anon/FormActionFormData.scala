package typings.remixRunRouter.anon

import typings.remixRunRouter.distUtilsMod.JsonValue
import typings.remixRunRouter.distUtilsMod.Submission
import typings.remixRunRouter.distUtilsMod.V7FormMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormActionFormData
  extends StObject
     with Submission {
  
  var formAction: String
  
  var formData: Unit
  
  var formEncType: typings.remixRunRouter.distUtilsMod.FormEncType
  
  var formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod
  
  var json: JsonValue
  
  var text: Unit
}
object FormActionFormData {
  
  inline def apply(
    formAction: String,
    formData: Unit,
    formEncType: typings.remixRunRouter.distUtilsMod.FormEncType,
    formMethod: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod,
    text: Unit
  ): FormActionFormData = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], json = null)
    __obj.asInstanceOf[FormActionFormData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormActionFormData] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: Unit): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: typings.remixRunRouter.distUtilsMod.FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: typings.remixRunRouter.distUtilsMod.FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setJson(value: JsonValue): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonNull: Self = StObject.set(x, "json", null)
    
    inline def setText(value: Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
