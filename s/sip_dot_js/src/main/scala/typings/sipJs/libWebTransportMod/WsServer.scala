package typings.sipJs.libWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsServer extends js.Object {
  var isError: Boolean
  var scheme: String
  var sipUri: String
  var weight: Double
  var wsUri: String
}

object WsServer {
  @scala.inline
  def apply(isError: Boolean, scheme: String, sipUri: String, weight: Double, wsUri: String): WsServer = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], sipUri = sipUri.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], wsUri = wsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[WsServer]
  }
}

