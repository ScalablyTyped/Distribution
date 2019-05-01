package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var closed: scala.Boolean
  var encoding: Encoding
  var path: java.lang.String
  var tick: scala.Double
  def onData(fn: js.Function1[/* chunk */ java.lang.String | js.Array[scala.Double], scala.Unit]): scala.Unit
  def onEnd(fn: js.Function0[scala.Unit]): scala.Unit
  def onError(fn: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit
  def open(): scala.Unit
}

object RNFetchBlobReadStream {
  @scala.inline
  def apply(
    closed: scala.Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ java.lang.String | js.Array[scala.Double], scala.Unit] => scala.Unit,
    onEnd: js.Function0[scala.Unit] => scala.Unit,
    onError: js.Function1[/* err */ js.Any, scala.Unit] => scala.Unit,
    open: () => scala.Unit,
    path: java.lang.String,
    tick: scala.Double,
    bufferSize: scala.Int | scala.Double = null
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed, encoding = encoding, onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError), open = js.Any.fromFunction0(open), path = path, tick = tick)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
}

