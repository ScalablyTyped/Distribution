package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionOptions extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  var transport: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Transport] = js.undefined
  var waitForPageLoad: js.UndefOr[scala.Boolean] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

