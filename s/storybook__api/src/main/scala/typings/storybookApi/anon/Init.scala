package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.shortcutsMod.SubAPI
import typings.storybookApi.shortcutsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Init extends js.Object {
  var api: SubAPI = js.native
  var state: SubState = js.native
  def init(hasApi: API): Unit = js.native
}

object Init {
  @scala.inline
  def apply(api: SubAPI, init: API => Unit, state: SubState): Init = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
  @scala.inline
  implicit class InitOps[Self <: Init] (val x: Self) extends AnyVal {
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
    def setApi(value: SubAPI): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: API => Unit): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: SubState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

