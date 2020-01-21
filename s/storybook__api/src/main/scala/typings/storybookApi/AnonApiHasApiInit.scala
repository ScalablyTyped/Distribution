package typings.storybookApi

import typings.storybookApi.mod.API
import typings.storybookApi.versionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiHasApiInit extends js.Object {
  var api: SubAPI
  var state: AnonDismissedVersionNotification
  def init(hasApi: API): js.Promise[Unit]
}

object AnonApiHasApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => js.Promise[Unit], state: AnonDismissedVersionNotification): AnonApiHasApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiHasApiInit]
  }
}

