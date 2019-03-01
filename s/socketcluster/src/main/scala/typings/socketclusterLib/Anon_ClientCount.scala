package typings
package socketclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientCount extends js.Object {
  var clientCount: js.Any
  var httpRPM: scala.Double
  var wsRPM: scala.Double
}

object Anon_ClientCount {
  @scala.inline
  def apply(clientCount: js.Any, httpRPM: scala.Double, wsRPM: scala.Double): Anon_ClientCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientCount")(clientCount)
    __obj.updateDynamic("httpRPM")(httpRPM)
    __obj.updateDynamic("wsRPM")(wsRPM)
    __obj.asInstanceOf[Anon_ClientCount]
  }
}

