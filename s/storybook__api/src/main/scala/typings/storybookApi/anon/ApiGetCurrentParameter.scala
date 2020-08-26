package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGetCurrentParameter extends js.Object {
  var api: GetCurrentParameter = js.native
  var state: StoriesConfigured = js.native
}

object ApiGetCurrentParameter {
  @scala.inline
  def apply(api: GetCurrentParameter, state: StoriesConfigured): ApiGetCurrentParameter = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGetCurrentParameter]
  }
  @scala.inline
  implicit class ApiGetCurrentParameterOps[Self <: ApiGetCurrentParameter] (val x: Self) extends AnyVal {
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
    def setApi(value: GetCurrentParameter): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: StoriesConfigured): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

