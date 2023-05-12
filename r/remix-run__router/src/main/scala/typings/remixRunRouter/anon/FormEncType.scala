package typings.remixRunRouter.anon

import typings.remixRunRouter.remixRunRouterStrings.idle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormEncType extends StObject {
  
  var formAction: Unit
  
  var formData: Unit
  
  var formEncType: Unit
  
  var formMethod: Unit
  
  var location: Unit
  
  var state: idle
}
object FormEncType {
  
  inline def apply(formAction: Unit, formData: Unit, formEncType: Unit, formMethod: Unit, location: Unit): FormEncType = {
    val __obj = js.Dynamic.literal(formAction = formAction.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], formEncType = formEncType.asInstanceOf[js.Any], formMethod = formMethod.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], state = "idle")
    __obj.asInstanceOf[FormEncType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormEncType] (val x: Self) extends AnyVal {
    
    inline def setFormAction(value: Unit): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: Unit): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormEncType(value: Unit): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormMethod(value: Unit): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Unit): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setState(value: idle): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
