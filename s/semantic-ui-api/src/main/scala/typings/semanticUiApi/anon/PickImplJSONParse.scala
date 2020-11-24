package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'JSONParse'> */
@js.native
trait PickImplJSONParse extends js.Object {
  
  var JSONParse: String = js.native
}
object PickImplJSONParse {
  
  @scala.inline
  def apply(JSONParse: String): PickImplJSONParse = {
    val __obj = js.Dynamic.literal(JSONParse = JSONParse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplJSONParse]
  }
  
  @scala.inline
  implicit class PickImplJSONParseOps[Self <: PickImplJSONParse] (val x: Self) extends AnyVal {
    
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
    def setJSONParse(value: String): Self = this.set("JSONParse", value.asInstanceOf[js.Any])
  }
}
