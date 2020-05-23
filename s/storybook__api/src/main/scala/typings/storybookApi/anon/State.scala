package typings.storybookApi.anon

import typings.storybookApi.addonsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var api: SubAPI
  var state: Addons
}

object State {
  @scala.inline
  def apply(api: SubAPI, state: Addons): State = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

