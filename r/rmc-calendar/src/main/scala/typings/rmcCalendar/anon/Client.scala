package typings.rmcCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client extends js.Object {
  var client: Double
  var full: Double
  var top: Double
}

object Client {
  @scala.inline
  def apply(client: Double, full: Double, top: Double): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

