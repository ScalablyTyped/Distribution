package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderInit extends StObject {
  
  /* standard dom */
  def error(error: DOMException): Unit
  /* standard dom */
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  /* standard dom */
  def output(output: VideoFrame): Unit
  /* standard dom */
  @JSName("output")
  var output_Original: VideoFrameOutputCallback
}
object VideoDecoderInit {
  
  inline def apply(error: /* error */ DOMException => Unit, output: /* output */ VideoFrame => Unit): VideoDecoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction1(output))
    __obj.asInstanceOf[VideoDecoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoDecoderInit] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(value: /* output */ VideoFrame => Unit): Self = StObject.set(x, "output", js.Any.fromFunction1(value))
  }
}
