package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hostname extends js.Object {
  var hostname: String
  var management: Options
  var options: ChannelMax
  var password: String
  var port: String
  var protocol: String
  var retry: Factor
  var slashes: Boolean
  var socketOptions: Timeout
  var user: String
}

object Hostname {
  @scala.inline
  def apply(
    hostname: String,
    management: Options,
    options: ChannelMax,
    password: String,
    port: String,
    protocol: String,
    retry: Factor,
    slashes: Boolean,
    socketOptions: Timeout,
    user: String
  ): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], socketOptions = socketOptions.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
}

