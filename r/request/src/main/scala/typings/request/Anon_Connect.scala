package typings.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  var connect: Double
  var end: Double
  var lookup: Double
  var response: Double
  var socket: Double
}

object Anon_Connect {
  @scala.inline
  def apply(connect: Double, end: Double, lookup: Double, response: Double, socket: Double): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

