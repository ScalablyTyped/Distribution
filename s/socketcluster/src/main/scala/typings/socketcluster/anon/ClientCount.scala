package typings.socketcluster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCount extends js.Object {
  var clientCount: js.Any
  var httpRPM: Double
  var wsRPM: Double
}

object ClientCount {
  @scala.inline
  def apply(clientCount: js.Any, httpRPM: Double, wsRPM: Double): ClientCount = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCount]
  }
}

