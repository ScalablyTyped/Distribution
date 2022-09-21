package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormDataEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var formData: FormData
}
object FormDataEventInit {
  
  inline def apply(formData: FormData): FormDataEventInit = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormDataEventInit]
  }
  
  extension [Self <: FormDataEventInit](x: Self) {
    
    inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
  }
}
