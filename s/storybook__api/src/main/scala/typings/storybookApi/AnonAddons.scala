package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddons extends js.Object {
  var selectedPanel: String
}

object AnonAddons {
  @scala.inline
  def apply(selectedPanel: String): AnonAddons = {
    val __obj = js.Dynamic.literal(selectedPanel = selectedPanel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddons]
  }
}

