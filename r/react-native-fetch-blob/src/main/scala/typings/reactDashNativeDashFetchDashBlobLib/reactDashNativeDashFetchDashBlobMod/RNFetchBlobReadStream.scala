package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var closed: scala.Boolean
  var encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  var path: java.lang.String
  var tick: scala.Double
  def onData(fn: js.Function1[/* chunk */ java.lang.String | js.Array[scala.Double], scala.Unit]): scala.Unit
  def onEnd(fn: js.Function0[scala.Unit]): scala.Unit
  def onError(fn: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def open(): scala.Unit
}

