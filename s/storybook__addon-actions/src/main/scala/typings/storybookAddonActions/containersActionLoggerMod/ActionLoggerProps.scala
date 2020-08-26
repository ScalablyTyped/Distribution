package typings.storybookAddonActions.containersActionLoggerMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionLoggerProps extends js.Object {
  var active: Boolean = js.native
  var api: API = js.native
}

object ActionLoggerProps {
  @scala.inline
  def apply(active: Boolean, api: API): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionLoggerProps]
  }
  @scala.inline
  implicit class ActionLoggerPropsOps[Self <: ActionLoggerProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setApi(value: API): Self = this.set("api", value.asInstanceOf[js.Any])
  }
  
}

