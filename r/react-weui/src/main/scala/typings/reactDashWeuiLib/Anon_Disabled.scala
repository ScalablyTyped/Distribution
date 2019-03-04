package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var size: java.lang.String
  var `type`: java.lang.String
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: scala.Boolean, size: java.lang.String, `type`: java.lang.String): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, size = size)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

