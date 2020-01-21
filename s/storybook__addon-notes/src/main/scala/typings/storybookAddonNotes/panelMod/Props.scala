package typings.storybookAddonNotes.panelMod

import typings.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var active: Boolean
  var api: API
}

object Props {
  @scala.inline
  def apply(active: Boolean, api: API): Props = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

