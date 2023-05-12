package typings.remixRunRouter.distUtilsMod

import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Submission extends StObject {
  
  var formAction: String
  
  var formData: FormData
  
  var formEncType: FormEncType
  
  var formMethod: FormMethod | V7FormMethod
}
object Submission {
  
  inline def apply(
    formAction: String,
    formData: FormData,
    formEncType: FormEncType,
    formMethod: FormMethod | V7FormMethod
  ): Submission = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Submission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Submission] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: FormMethod | V7FormMethod): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
  }
}
