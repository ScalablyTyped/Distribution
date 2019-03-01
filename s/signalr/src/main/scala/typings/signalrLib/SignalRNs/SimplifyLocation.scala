package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifyLocation extends js.Object {
  var host: java.lang.String
  var protocol: java.lang.String
}

object SimplifyLocation {
  @scala.inline
  def apply(host: java.lang.String, protocol: java.lang.String): SimplifyLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[SimplifyLocation]
  }
}

