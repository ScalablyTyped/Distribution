package typings
package sipDotJsLib.typesWebTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WsServer extends js.Object {
  var isError: scala.Boolean
  var scheme: java.lang.String
  var sipUri: java.lang.String
  var weight: scala.Double
  var wsUri: java.lang.String
}

object WsServer {
  @scala.inline
  def apply(
    isError: scala.Boolean,
    scheme: java.lang.String,
    sipUri: java.lang.String,
    weight: scala.Double,
    wsUri: java.lang.String
  ): WsServer = {
    val __obj = js.Dynamic.literal(isError = isError, scheme = scheme, sipUri = sipUri, weight = weight, wsUri = wsUri)
  
    __obj.asInstanceOf[WsServer]
  }
}

