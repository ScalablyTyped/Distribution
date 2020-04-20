package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostname extends js.Object {
  var hostname: String
  var management: AnonOptions
  var options: AnonChannelMax
  var password: String
  var port: String
  var protocol: String
  var retry: AnonFactor
  var slashes: Boolean
  var socketOptions: AnonTimeout
  var user: String
}

object AnonHostname {
  @scala.inline
  def apply(
    hostname: String,
    management: AnonOptions,
    options: AnonChannelMax,
    password: String,
    port: String,
    protocol: String,
    retry: AnonFactor,
    slashes: Boolean,
    socketOptions: AnonTimeout,
    user: String
  ): AnonHostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], socketOptions = socketOptions.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostname]
  }
}

