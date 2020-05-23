package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiGetCurrentParameter extends js.Object {
  var api: GetCurrentParameter
  var state: StoriesConfigured
}

object ApiGetCurrentParameter {
  @scala.inline
  def apply(api: GetCurrentParameter, state: StoriesConfigured): ApiGetCurrentParameter = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiGetCurrentParameter]
  }
}

