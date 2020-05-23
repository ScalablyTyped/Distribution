package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: Double
  var enabled: Double
  var hidden: Double
}

object Disabled {
  @scala.inline
  def apply(disabled: Double, enabled: Double, hidden: Double): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

