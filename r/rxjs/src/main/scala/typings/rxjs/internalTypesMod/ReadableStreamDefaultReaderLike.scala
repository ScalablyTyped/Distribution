package typings.rxjs.internalTypesMod

import typings.rxjs.anon.Done
import typings.rxjs.anon.DoneValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReaderLike[T] extends StObject {
  
  def read(): js.Thenable[Done[T] | DoneValue]
  
  def releaseLock(): Unit
}
object ReadableStreamDefaultReaderLike {
  
  inline def apply[T](read: () => js.Thenable[Done[T] | DoneValue], releaseLock: () => Unit): ReadableStreamDefaultReaderLike[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamDefaultReaderLike[T]]
  }
  
  extension [Self <: ReadableStreamDefaultReaderLike[?], T](x: Self & ReadableStreamDefaultReaderLike[T]) {
    
    inline def setRead(value: () => js.Thenable[Done[T] | DoneValue]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReleaseLock(value: () => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction0(value))
  }
}
