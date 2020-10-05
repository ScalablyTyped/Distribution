package typings.storybookApi.anon

import typings.storybookApi.mod.API
import typings.storybookApi.versionsMod.SubAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiInit extends js.Object {
  var api: SubAPI = js.native
  var state: DismissedVersionNotification = js.native
  def init(hasApi: API): js.Promise[Unit] = js.native
}

object ApiInit {
  @scala.inline
  def apply(api: SubAPI, init: API => js.Promise[Unit], state: DismissedVersionNotification): ApiInit = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiInit]
  }
  @scala.inline
  implicit class ApiInitOps[Self <: ApiInit] (val x: Self) extends AnyVal {
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
    def setInit(value: API => js.Promise[Unit]): Self = this.set("init", js.Any.fromFunction1(value))
    @scala.inline
    def setState(value: DismissedVersionNotification): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

