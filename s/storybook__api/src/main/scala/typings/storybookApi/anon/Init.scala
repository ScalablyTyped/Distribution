package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.shortcutsMod.SubAPI
import typings.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Init extends js.Object {
  var api: SubAPI
  var state: SubState
  def init(hasApi: API): Unit
}

object Init {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): Init = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
}

