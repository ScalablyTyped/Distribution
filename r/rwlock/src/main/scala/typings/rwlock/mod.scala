package typings.rwlock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rwlock", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ReadWriteLock
  
  type AsyncCallback = js.Function2[/* err */ js.Error, /* release */ Release, Unit]
  
  type Callback = js.Function1[/* release */ Release, Unit]
  
  trait Options extends StObject {
    
    var scope: js.UndefOr[Any] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timeoutCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutCallback(value: () => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction0(value))
      
      inline def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ReadWriteGeneric[T] extends StObject {
    
    def readLock(callback: T): Unit = js.native
    def readLock(callback: T, options: Options): Unit = js.native
    def readLock(key: String, callback: T): Unit = js.native
    def readLock(key: String, callback: T, options: Options): Unit = js.native
    
    def writeLock(callback: T): Unit = js.native
    def writeLock(callback: T, options: Options): Unit = js.native
    def writeLock(key: String, callback: T): Unit = js.native
    def writeLock(key: String, callback: T, options: Options): Unit = js.native
  }
  
  @js.native
  trait ReadWriteLock
    extends StObject
       with ReadWriteGeneric[Callback] {
    
    var async: ReadWriteGeneric[AsyncCallback] = js.native
  }
  
  type Release = js.Function0[Unit]
}
