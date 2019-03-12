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
  def apply(onData: () => scala.Unit, onEnd: () => scala.Unit, onError: () => scala.Unit): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal(onData = js.Any.fromFunction0(onData), onEnd = js.Any.fromFunction0(onEnd), onError = js.Any.fromFunction0(onError))
  
    __obj.asInstanceOf[RNFetchBlobStream]
  }
}

