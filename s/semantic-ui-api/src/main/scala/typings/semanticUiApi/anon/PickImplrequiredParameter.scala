package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'requiredParameter'> */
@js.native
trait PickImplrequiredParameter extends js.Object {
  var requiredParameter: String = js.native
}

object PickImplrequiredParameter {
  @scala.inline
  def apply(requiredParameter: String): PickImplrequiredParameter = {
    val __obj = js.Dynamic.literal(requiredParameter = requiredParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrequiredParameter]
  }
  @scala.inline
  implicit class PickImplrequiredParameterOps[Self <: PickImplrequiredParameter] (val x: Self) extends AnyVal {
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
    def setRequiredParameter(value: String): Self = this.set("requiredParameter", value.asInstanceOf[js.Any])
  }
  
}

