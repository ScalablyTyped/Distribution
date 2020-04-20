package typings.storybookAddonActions.containersActionLoggerMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionLoggerProps extends js.Object {
  var active: Boolean
  var api: API
}

object ActionLoggerProps {
  @scala.inline
  def apply(active: Boolean, api: API): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionLoggerProps]
  }
}

