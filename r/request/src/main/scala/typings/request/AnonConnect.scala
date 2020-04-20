package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnect extends js.Object {
  var connect: Double
  var end: Double
  var lookup: Double
  var response: Double
  var socket: Double
}

object AnonConnect {
  @scala.inline
  def apply(connect: Double, end: Double, lookup: Double, response: Double, socket: Double): AnonConnect = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnect]
  }
}

