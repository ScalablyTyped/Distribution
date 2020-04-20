package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientsInfo extends js.Object {
  var blocked_clients: String
  var client_biggest_input_buf: String
  var client_longest_output_list: String
  var connected_clients: String
}

object ClientsInfo {
  @scala.inline
  def apply(
    blocked_clients: String,
    client_biggest_input_buf: String,
    client_longest_output_list: String,
    connected_clients: String
  ): ClientsInfo = {
    val __obj = js.Dynamic.literal(blocked_clients = blocked_clients.asInstanceOf[js.Any], client_biggest_input_buf = client_biggest_input_buf.asInstanceOf[js.Any], client_longest_output_list = client_longest_output_list.asInstanceOf[js.Any], connected_clients = connected_clients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsInfo]
  }
}

