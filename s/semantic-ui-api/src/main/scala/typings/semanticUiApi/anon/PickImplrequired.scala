package typings.semanticUiApi.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.RegExpSettings._Impl, 'required'> */
@js.native
trait PickImplrequired extends js.Object {
  var required: RegExp = js.native
}

object PickImplrequired {
  @scala.inline
  def apply(required: RegExp): PickImplrequired = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrequired]
  }
  @scala.inline
  implicit class PickImplrequiredOps[Self <: PickImplrequired] (val x: Self) extends AnyVal {
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
    def setRequired(value: RegExp): Self = this.set("required", value.asInstanceOf[js.Any])
  }
  
}

