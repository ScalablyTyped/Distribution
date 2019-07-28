package typings.rnDashFetchDashBlob.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.undefined
  var closed: Boolean
  var encoding: Encoding
  var path: String
  var tick: Double
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit
  def onEnd(fn: js.Function0[Unit]): Unit
  def onError(fn: js.Function1[/* err */ js.Any, Unit]): Unit
  def open(): Unit
}

object RNFetchBlobReadStream {
  @scala.inline
  def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit,
    onEnd: js.Function0[Unit] => Unit,
    onError: js.Function1[/* err */ js.Any, Unit] => Unit,
    open: () => Unit,
    path: String,
    tick: Double,
    bufferSize: Int | Double = null
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed, encoding = encoding, onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError), open = js.Any.fromFunction0(open), path = path, tick = tick)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
}

