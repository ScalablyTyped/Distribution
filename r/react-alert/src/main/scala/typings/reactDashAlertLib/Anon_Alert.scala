package typings
package reactDashAlertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: reactDashAlertLib.reactDashAlertMod.InjectedAlertProp
}

object Anon_Alert {
  @scala.inline
  def apply(alert: reactDashAlertLib.reactDashAlertMod.InjectedAlertProp): Anon_Alert = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alert")(alert)
    __obj.asInstanceOf[Anon_Alert]
  }
}

