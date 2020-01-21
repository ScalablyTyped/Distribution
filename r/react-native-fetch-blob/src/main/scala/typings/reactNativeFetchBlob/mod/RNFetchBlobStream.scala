package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobStream extends js.Object {
  def onData(): Unit
  def onEnd(): Unit
  def onError(): Unit
}

object RNFetchBlobStream {
  @scala.inline
  def apply(onData: () => Unit, onEnd: () => Unit, onError: () => Unit): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal(onData = js.Any.fromFunction0(onData), onEnd = js.Any.fromFunction0(onEnd), onError = js.Any.fromFunction0(onError))
  
    __obj.asInstanceOf[RNFetchBlobStream]
  }
}

