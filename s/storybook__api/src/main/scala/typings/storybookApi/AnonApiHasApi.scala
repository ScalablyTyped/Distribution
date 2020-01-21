package typings.storybookApi

import typings.storybookApi.mod.API
import typings.storybookApi.shortcutsMod.SubAPI
import typings.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiHasApi extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object AnonApiHasApi {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): AnonApiHasApi = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiHasApi]
  }
}

