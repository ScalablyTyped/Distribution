package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var disabled: Boolean
  var size: String
  var `type`: String
}

object Disabled {
  @scala.inline
  def apply(disabled: Boolean, size: String, `type`: String): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
}

