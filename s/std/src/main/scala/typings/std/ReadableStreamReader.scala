package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamReader[R] extends StObject {
  
  def cancel(): js.Promise[Unit]
  
  def read(): js.Promise[ReadableStreamReadResult[R]]
  
  def releaseLock(): Unit
}
object ReadableStreamReader {
  
  inline def apply[R](
    cancel: () => js.Promise[Unit],
    read: () => js.Promise[ReadableStreamReadResult[R]],
    releaseLock: () => Unit
  ): ReadableStreamReader[R] = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read), releaseLock = js.Any.fromFunction0(releaseLock))
    __obj.asInstanceOf[ReadableStreamReader[R]]
  }
  
  extension [Self <: ReadableStreamReader[?], R](x: Self & ReadableStreamReader[R]) {
    
    inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setRead(value: () => js.Promise[ReadableStreamReadResult[R]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setReleaseLock(value: () => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction0(value))
  }
}
