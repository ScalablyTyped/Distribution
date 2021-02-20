package typings.primereact.anon

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormData extends StObject {
  
  var formData: js.Any = js.native
  
  var xhr: XMLHttpRequest = js.native
}
object FormData {
  
  @scala.inline
  def apply(formData: js.Any, xhr: XMLHttpRequest): FormData = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormData]
  }
  
  @scala.inline
  implicit class FormDataMutableBuilder[Self <: FormData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormData(value: js.Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
  }
}
