package typings.reactNativeJoi.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidationError
  extends Error
     with JoiObject {
  
  var _object: js.Any = js.native
  
  def annotate(): String = js.native
  
  var details: js.Array[ValidationErrorItem] = js.native
}
object ValidationError {
  
  @scala.inline
  def apply(
    _object: js.Any,
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
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_object(value: js.Any): Self = this.set("_object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotate(value: () => String): Self = this.set("annotate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetailsVarargs(value: ValidationErrorItem*): Self = this.set("details", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[ValidationErrorItem]): Self = this.set("details", value.asInstanceOf[js.Any])
  }
}
