package typings.atStorybookAddonDashA11y.distComponentsA11YPanelMod

import typings.atStorybookApi.atStorybookApiMod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A11YPanelProps extends js.Object {
  var active: Boolean
  var api: API
}

object A11YPanelProps {
  @scala.inline
  def apply(active: Boolean, api: API): A11YPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[A11YPanelProps]
  }
}

