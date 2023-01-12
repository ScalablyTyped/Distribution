package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RNFetchBlobReadStream extends StObject {
  
  var bufferSize: js.UndefOr[Double] = js.undefined
  
  var closed: Boolean
  
  var encoding: Encoding
  
  def onData(fn: js.Function1[/* chunk */ String | js.Array[Double], Unit]): Unit
  
  def onEnd(fn: js.Function0[Unit]): Unit
  
  def onError(fn: js.Function1[/* err */ Any, Unit]): Unit
  
  def open(): Unit
  
  var path: String
  
  var tick: Double
}
object RNFetchBlobReadStream {
  
  inline def apply(
    closed: Boolean,
    encoding: Encoding,
    onData: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit,
    onEnd: js.Function0[Unit] => Unit,
    onError: js.Function1[/* err */ Any, Unit] => Unit,
    open: () => Unit,
    path: String,
    tick: Double
  ): RNFetchBlobReadStream = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], onData = js.Any.fromFunction1(onData), onEnd = js.Any.fromFunction1(onEnd), onError = js.Any.fromFunction1(onError), open = js.Any.fromFunction0(open), path = path.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any])
    __obj.asInstanceOf[RNFetchBlobReadStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RNFetchBlobReadStream] (val x: Self) extends AnyVal {
    
    inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setOnData(value: js.Function1[/* chunk */ String | js.Array[Double], Unit] => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    
    inline def setOnEnd(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
    
    inline def setOnError(value: js.Function1[/* err */ Any, Unit] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTick(value: Double): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
  }
}
