package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderInit extends StObject {
  
  /* standard dom */
  def error(error: DOMException): Unit
  /* standard dom */
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  /* standard dom */
  def output(chunk: EncodedVideoChunk): Unit
  def output(chunk: EncodedVideoChunk, metadata: EncodedVideoChunkMetadata): Unit
  /* standard dom */
  @JSName("output")
  var output_Original: EncodedVideoChunkOutputCallback
}
object VideoEncoderInit {
  
  inline def apply(
    error: /* error */ DOMException => Unit,
    output: (/* chunk */ EncodedVideoChunk, /* metadata */ js.UndefOr[EncodedVideoChunkMetadata]) => Unit
  ): VideoEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction2(output))
    __obj.asInstanceOf[VideoEncoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderInit] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(
      value: (/* chunk */ EncodedVideoChunk, /* metadata */ js.UndefOr[EncodedVideoChunkMetadata]) => Unit
    ): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
  }
}
