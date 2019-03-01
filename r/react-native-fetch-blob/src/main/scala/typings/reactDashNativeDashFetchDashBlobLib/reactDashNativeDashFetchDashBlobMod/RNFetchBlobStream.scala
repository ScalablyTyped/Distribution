package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobStream extends js.Object {
  def onData(): scala.Unit
  def onEnd(): scala.Unit
  def onError(): scala.Unit
}

object RNFetchBlobStream {
  @scala.inline
  def apply(
    onData: js.Function0[scala.Unit],
    onEnd: js.Function0[scala.Unit],
    onError: js.Function0[scala.Unit]
  ): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onData")(onData)
    __obj.updateDynamic("onEnd")(onEnd)
    __obj.updateDynamic("onError")(onError)
    __obj.asInstanceOf[RNFetchBlobStream]
  }
}

