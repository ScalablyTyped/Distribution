package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'hideError'> */
@js.native
trait PickImplhideError extends js.Object {
  
  var hideError: auto | Boolean = js.native
}
object PickImplhideError {
  
  @scala.inline
  def apply(hideError: auto | Boolean): PickImplhideError = {
    val __obj = js.Dynamic.literal(hideError = hideError.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhideError]
  }
  
  @scala.inline
  implicit class PickImplhideErrorOps[Self <: PickImplhideError] (val x: Self) extends AnyVal {
    
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
    def setHideError(value: auto | Boolean): Self = this.set("hideError", value.asInstanceOf[js.Any])
  }
}
