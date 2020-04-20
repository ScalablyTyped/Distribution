package typings.reactAlert

import typings.reactAlert.mod.AlertManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlert extends js.Object {
  var alert: AlertManager
}

object AnonAlert {
  @scala.inline
  def apply(alert: AlertManager): AnonAlert = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlert]
  }
}

