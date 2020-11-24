package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'missingSerialize'> */
@js.native
trait PickImplmissingSerialize extends js.Object {
  
  var missingSerialize: String = js.native
}
object PickImplmissingSerialize {
  
  @scala.inline
  def apply(missingSerialize: String): PickImplmissingSerialize = {
    val __obj = js.Dynamic.literal(missingSerialize = missingSerialize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingSerialize]
  }
  
  @scala.inline
  implicit class PickImplmissingSerializeOps[Self <: PickImplmissingSerialize] (val x: Self) extends AnyVal {
    
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
    def setMissingSerialize(value: String): Self = this.set("missingSerialize", value.asInstanceOf[js.Any])
  }
}
