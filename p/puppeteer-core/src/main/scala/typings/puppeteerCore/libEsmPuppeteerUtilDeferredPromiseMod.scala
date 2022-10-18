package typings.puppeteerCore

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerUtilDeferredPromiseMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/util/DeferredPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDeferredPromise[T](): DeferredPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredPromise")().asInstanceOf[DeferredPromise[T]]
  inline def createDeferredPromise[T](opts: DeferredPromiseOptions): DeferredPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredPromise")(opts.asInstanceOf[js.Any]).asInstanceOf[DeferredPromise[T]]
  
  @js.native
  trait DeferredPromise[T]
    extends StObject
       with Promise[T] {
    
    def finished(): Boolean = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(value: T): Unit = js.native
    
    def resolved(): Boolean = js.native
  }
  
  trait DeferredPromiseOptions extends StObject {
    
    var message: String
    
    var timeout: Double
  }
  object DeferredPromiseOptions {
    
    inline def apply(message: String, timeout: Double): DeferredPromiseOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeferredPromiseOptions]
    }
    
    extension [Self <: DeferredPromiseOptions](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
