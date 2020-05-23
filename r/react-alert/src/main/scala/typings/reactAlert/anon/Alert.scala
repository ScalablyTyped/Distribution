package typings.reactAlert.anon

import typings.reactAlert.mod.AlertManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  var alert: AlertManager
}

object Alert {
  @scala.inline
  def apply(alert: AlertManager): Alert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alert]
  }
}

