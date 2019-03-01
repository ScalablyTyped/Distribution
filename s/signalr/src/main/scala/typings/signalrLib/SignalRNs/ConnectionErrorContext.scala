package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionErrorContext extends js.Object {
  var readyState: scala.Double
  var responseText: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
}

object ConnectionErrorContext {
  @scala.inline
  def apply(
    readyState: scala.Double,
    responseText: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String
  ): ConnectionErrorContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readyState")(readyState)
    __obj.updateDynamic("responseText")(responseText)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[ConnectionErrorContext]
  }
}

