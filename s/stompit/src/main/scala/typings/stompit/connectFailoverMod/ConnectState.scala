package typings.stompit.connectFailoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Internal class, which is not exported
trait ConnectState extends js.Object {
  var failedConnects: Double
  var serverProperties: Server
}

object ConnectState {
  @scala.inline
  def apply(failedConnects: Double, serverProperties: Server): ConnectState = {
    val __obj = js.Dynamic.literal(failedConnects = failedConnects.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectState]
  }
}

