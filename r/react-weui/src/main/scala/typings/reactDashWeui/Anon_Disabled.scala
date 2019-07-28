package typings.reactDashWeui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: Boolean
  var size: String
  var `type`: String
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: Boolean, size: String, `type`: String): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

