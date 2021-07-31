package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobStream extends StObject {
  
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
  
  @scala.inline
  implicit class RNFetchBlobStreamMutableBuilder[Self <: RNFetchBlobStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnData(value: () => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
  }
}
