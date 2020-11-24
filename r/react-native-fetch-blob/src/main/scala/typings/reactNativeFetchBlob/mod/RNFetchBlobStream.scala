package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RNFetchBlobStream extends js.Object {
  
  def onData(): Unit = js.native
  
  def onEnd(): Unit = js.native
  
  def onError(): Unit = js.native
}
object RNFetchBlobStream {
  
  @scala.inline
  def apply(onData: () => Unit, onEnd: () => Unit, onError: () => Unit): RNFetchBlobStream = {
    val __obj = js.Dynamic.literal(onData = js.Any.fromFunction0(onData), onEnd = js.Any.fromFunction0(onEnd), onError = js.Any.fromFunction0(onError))
    __obj.asInstanceOf[RNFetchBlobStream]
  }
  
  @scala.inline
  implicit class RNFetchBlobStreamOps[Self <: RNFetchBlobStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnData(value: () => Unit): Self = this.set("onData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnd(value: () => Unit): Self = this.set("onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: () => Unit): Self = this.set("onError", js.Any.fromFunction0(value))
  }
}
