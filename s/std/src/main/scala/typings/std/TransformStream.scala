package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream) */
trait TransformStream[I, O] extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable) */
  /* standard dom */
  val readable: ReadableStream[O]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable) */
  /* standard dom */
  val writable: WritableStream[I]
}
object TransformStream {
  
  inline def apply[I, O](readable: ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformStream[?, ?], I, O] (val x: Self & (TransformStream[I, O])) extends AnyVal {
    
    inline def setReadable(value: ReadableStream[O]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[I]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
