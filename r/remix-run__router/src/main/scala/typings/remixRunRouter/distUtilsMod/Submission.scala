package typings.remixRunRouter.distUtilsMod

import typings.remixRunRouter.remixRunRouterStrings.get
import typings.std.Exclude
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Submission extends StObject {
  
  var formAction: String
  
  var formData: FormData
  
  var formEncType: FormEncType
  
  var formMethod: Exclude[FormMethod, get]
}
object Submission {
  
  inline def apply(
    formAction: String,
    formData: FormData,
    formEncType: FormEncType,
    formMethod: Exclude[FormMethod, get]
  ): Submission = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Submission]
  }
  
  extension [Self <: Submission](x: Self) {
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: FormEncType): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: Exclude[FormMethod, get]): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
  }
}
