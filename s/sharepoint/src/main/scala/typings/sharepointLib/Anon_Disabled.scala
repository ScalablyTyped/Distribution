package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Double
  var enabled: scala.Double
  var hidden: scala.Double
}

object Anon_Disabled {
  @scala.inline
  def apply(disabled: scala.Double, enabled: scala.Double, hidden: scala.Double): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

