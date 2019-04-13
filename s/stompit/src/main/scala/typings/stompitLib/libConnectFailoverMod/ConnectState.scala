package typings
package stompitLib.libConnectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal class, which is not exported
trait ConnectState extends js.Object {
  var failedConnects: scala.Double
  var serverProperties: Server
}

object ConnectState {
  @scala.inline
  def apply(failedConnects: scala.Double, serverProperties: Server): ConnectState = {
    val __obj = js.Dynamic.literal(failedConnects = failedConnects, serverProperties = serverProperties)
  
    __obj.asInstanceOf[ConnectState]
  }
}

