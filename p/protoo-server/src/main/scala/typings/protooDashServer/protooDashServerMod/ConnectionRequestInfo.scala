package typings.protooDashServer.protooDashServerMod

import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionRequestInfo extends js.Object {
  var origin: String
  var request: IncomingMessage
  var socket: Socket
}

object ConnectionRequestInfo {
  @scala.inline
  def apply(origin: String, request: IncomingMessage, socket: Socket): ConnectionRequestInfo = {
    val __obj = js.Dynamic.literal(origin = origin, request = request, socket = socket)
  
    __obj.asInstanceOf[ConnectionRequestInfo]
  }
}

