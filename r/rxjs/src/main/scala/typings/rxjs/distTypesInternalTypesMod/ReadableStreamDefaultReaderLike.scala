package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.anon.Done
import typings.rxjs.anon.Value
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReaderLike[T] extends StObject {
  
  def read(): PromiseLike[Done[T] | Value]
  
  def releaseLock(): Unit
}
object ReadableStreamDefaultReaderLike {
  
  inline def apply[T](read: () => PromiseLike[Done[T] | Value], releaseLock: () => Unit): ReadableStreamDefaultReaderLike[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamDefaultReaderLike[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamDefaultReaderLike[?], T] (val x: Self & ReadableStreamDefaultReaderLike[T]) extends AnyVal {
    
    inline def setRead(value: () => PromiseLike[Done[T] | Value]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReleaseLock(value: () => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction0(value))
  }
}
