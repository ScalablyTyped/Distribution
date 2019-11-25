package typings.reactDashAlert

import typings.reactDashAlert.reactDashAlertMod.AlertManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alert extends js.Object {
  var alert: AlertManager
}

object Anon_Alert {
  @scala.inline
  def apply(alert: AlertManager): Anon_Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Alert]
  }
}

