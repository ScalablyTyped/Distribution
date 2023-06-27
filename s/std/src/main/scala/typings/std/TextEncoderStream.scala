package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream) */
trait TextEncoderStream
  extends StObject
     with GenericTransformStream
     with TextEncoderCommon {
  
  /* standard dom */
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[js.typedarray.Uint8Array]
  
  /* standard dom */
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String]
}
object TextEncoderStream {
  
  inline def apply(
    encoding: java.lang.String,
    readable: ReadableStream[js.typedarray.Uint8Array],
    writable: WritableStream[java.lang.String]
  ): TextEncoderStream = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEncoderStream] (val x: Self) extends AnyVal {
    
    inline def setReadable(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[java.lang.String]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
