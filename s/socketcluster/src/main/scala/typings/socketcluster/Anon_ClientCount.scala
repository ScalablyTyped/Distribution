package typings.socketcluster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientCount extends js.Object {
  var clientCount: js.Any
  var httpRPM: Double
  var wsRPM: Double
}

object Anon_ClientCount {
  @scala.inline
  def apply(clientCount: js.Any, httpRPM: Double, wsRPM: Double): Anon_ClientCount = {
    val __obj = js.Dynamic.literal(clientCount = clientCount.asInstanceOf[js.Any], httpRPM = httpRPM.asInstanceOf[js.Any], wsRPM = wsRPM.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClientCount]
  }
}

