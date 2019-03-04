package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

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
    val __obj = js.Dynamic.literal(onData = onData, onEnd = onEnd, onError = onError)
  
    __obj.asInstanceOf[RNFetchBlobStream]
  }
}

