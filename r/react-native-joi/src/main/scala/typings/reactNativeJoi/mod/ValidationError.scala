package typings.reactNativeJoi.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationError
  extends StObject
     with Error
     with JoiObject {
  
  var _object: Any
  
  def annotate(): String
  
  var details: js.Array[ValidationErrorItem]
}
object ValidationError {
  
  inline def apply(
    _object: Any,
    annotate: () => String,
    details: js.Array[ValidationErrorItem],
    isJoi: Boolean,
    message: String,
    name: String
  ): ValidationError = {
    val __obj = js.Dynamic.literal(_object = _object.asInstanceOf[js.Any], annotate = js.Any.fromFunction0(annotate), details = details.asInstanceOf[js.Any], isJoi = isJoi.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    inline def setAnnotate(value: () => String): Self = StObject.set(x, "annotate", js.Any.fromFunction0(value))
    
    inline def setDetails(value: js.Array[ValidationErrorItem]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsVarargs(value: ValidationErrorItem*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def set_object(value: Any): Self = StObject.set(x, "_object", value.asInstanceOf[js.Any])
  }
}
