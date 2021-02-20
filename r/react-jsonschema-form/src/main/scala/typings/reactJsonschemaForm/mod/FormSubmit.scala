package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormSubmit[T] extends StObject {
  
  var formData: T = js.native
}
object FormSubmit {
  
  @scala.inline
  def apply[T](formData: T): FormSubmit[T] = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSubmit[T]]
  }
  
  @scala.inline
  implicit class FormSubmitMutableBuilder[Self <: FormSubmit[_], T] (val x: Self with FormSubmit[T]) extends AnyVal {
    
    @scala.inline
    def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
  }
}
