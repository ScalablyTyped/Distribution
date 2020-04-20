package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabled extends js.Object {
  var disabled: Double
  var enabled: Double
  var hidden: Double
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Double, enabled: Double, hidden: Double): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisabled]
  }
}

