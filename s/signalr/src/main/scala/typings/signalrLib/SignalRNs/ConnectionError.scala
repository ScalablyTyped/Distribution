package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionError
  extends stdLib.Error {
  var context: ConnectionErrorContext
  var source: js.UndefOr[java.lang.String] = js.undefined
  var transport: js.UndefOr[java.lang.String] = js.undefined
}

