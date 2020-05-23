package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.versionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiInit extends js.Object {
  var api: SubAPI
  var state: DismissedVersionNotification
  def init(hasApi: API): js.Promise[Unit]
}

object ApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => js.Promise[Unit], state: DismissedVersionNotification): ApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInit]
  }
}

