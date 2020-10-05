package typings.storybookApi.anon

import typings.storybookApi.notificationsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiAddNotification extends js.Object {
  var api: AddNotification = js.native
  var state: SubState = js.native
}

object ApiAddNotification {
  @scala.inline
  def apply(api: AddNotification, state: SubState): ApiAddNotification = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiAddNotification]
  }
  @scala.inline
  implicit class ApiAddNotificationOps[Self <: ApiAddNotification] (val x: Self) extends AnyVal {
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
    def setApi(value: AddNotification): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: SubState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

