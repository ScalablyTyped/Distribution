package typings.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamLike[T]
  extends StObject
     with _ObservableInput[T] {
  
  def getReader(): ReadableStreamDefaultReaderLike[T]
}
object ReadableStreamLike {
  
  inline def apply[T](getReader: () => ReadableStreamDefaultReaderLike[T]): ReadableStreamLike[T] = {
    val __obj = js.Dynamic.literal(getReader = js.Any.fromFunction0(getReader))
    __obj.asInstanceOf[ReadableStreamLike[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamLike[?], T] (val x: Self & ReadableStreamLike[T]) extends AnyVal {
    
    inline def setGetReader(value: () => ReadableStreamDefaultReaderLike[T]): Self = StObject.set(x, "getReader", js.Any.fromFunction0(value))
  }
}
