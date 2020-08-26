package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'response'> */
@js.native
trait PickImplresponse extends js.Object {
  var response: js.Any | `false` = js.native
}

object PickImplresponse {
  @scala.inline
  def apply(response: js.Any | `false`): PickImplresponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplresponse]
  }
  @scala.inline
  implicit class PickImplresponseOps[Self <: PickImplresponse] (val x: Self) extends AnyVal {
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
    def setResponse(value: js.Any | `false`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

