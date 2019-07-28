package typings.sipDotJs.libWebTransportMod

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
    val __obj = js.Dynamic.literal(isError = isError, scheme = scheme, sipUri = sipUri, weight = weight, wsUri = wsUri)
  
    __obj.asInstanceOf[WsServer]
  }
}

