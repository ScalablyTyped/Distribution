package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobReadStream extends js.Object {
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var closed: scala.Boolean
  var encoding: rnDashFetchDashBlobLib.Encoding
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
    encoding: rnDashFetchDashBlobLib.Encoding,
    onData: js.Function1[
      js.Function1[/* chunk */ java.lang.String | js.Array[scala.Double], scala.Unit], 
      scala.Unit
    ],
    onEnd: js.Function1[js.Function0[scala.Unit], scala.Unit],
    onError: js.Function1[js.Function1[/* err */ js.Any, scala.Unit], scala.Unit],
    open: js.Function0[scala.Unit],
    path: java.lang.String,
    tick: scala.Double,
    bufferSize: scala.Int | scala.Double = null
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closed")(closed)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("onData")(onData)
    __obj.updateDynamic("onEnd")(onEnd)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("tick")(tick)
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
}

