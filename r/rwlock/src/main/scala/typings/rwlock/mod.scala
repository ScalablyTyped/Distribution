package typings.rwlock

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rwlock", JSImport.Namespace)
  @js.native
  class ^ () extends ReadWriteLock
  
  type AsyncCallback = js.Function2[/* err */ Error, /* release */ Release, Unit]
  
  type Callback = js.Function1[/* release */ Release, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var scope: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timeoutCallback: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: js.Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutCallback(value: () => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
  trait ReadWriteLock extends ReadWriteGeneric[Callback] {
    
    var async: ReadWriteGeneric[AsyncCallback] = js.native
  }
  
  type Release = js.Function0[Unit]
}
