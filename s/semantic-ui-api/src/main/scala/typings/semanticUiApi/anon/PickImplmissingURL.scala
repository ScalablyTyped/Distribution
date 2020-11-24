package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingURL'> */
@js.native
trait PickImplmissingURL extends js.Object {
  
  var missingURL: String = js.native
}
object PickImplmissingURL {
  
  @scala.inline
  def apply(missingURL: String): PickImplmissingURL = {
    val __obj = js.Dynamic.literal(missingURL = missingURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingURL]
  }
  
  @scala.inline
  implicit class PickImplmissingURLOps[Self <: PickImplmissingURL] (val x: Self) extends AnyVal {
    
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
    def setMissingURL(value: String): Self = this.set("missingURL", value.asInstanceOf[js.Any])
  }
}
