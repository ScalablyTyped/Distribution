package typings.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormSubmit[T] extends StObject {
  
  var formData: T
}
object FormSubmit {
  
  @scala.inline
  def apply[T](formData: T): FormSubmit[T] = {
    val __obj = js.Dynamic.literal(formData = formData.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSubmit[T]]
  }
  
  @scala.inline
  implicit class FormSubmitMutableBuilder[Self <: FormSubmit[?], T] (val x: Self & FormSubmit[T]) extends AnyVal {
    
    @scala.inline
    def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
  }
}
