package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamGetReaderOptions extends StObject {
  
  /**
    * Creates a ReadableStreamBYOBReader and locks the stream to the new reader.
    *
    * This call behaves the same way as the no-argument variant, except that it only works on readable byte streams, i.e. streams which were constructed specifically with the ability to handle "bring your own buffer" reading. The returned BYOB reader provides the ability to directly read individual chunks from the stream via its read() method, into developer-supplied buffers, allowing more precise control over allocation.
    */
  /* standard dom */
  var mode: js.UndefOr[ReadableStreamReaderMode] = js.undefined
}
object ReadableStreamGetReaderOptions {
  
  inline def apply(): ReadableStreamGetReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamGetReaderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamGetReaderOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: ReadableStreamReaderMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
