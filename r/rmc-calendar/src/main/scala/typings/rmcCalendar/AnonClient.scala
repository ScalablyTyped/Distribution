package typings.rmcCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient extends js.Object {
  var client: Double
  var full: Double
  var top: Double
}

object AnonClient {
  @scala.inline
  def apply(client: Double, full: Double, top: Double): AnonClient = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient]
  }
}

