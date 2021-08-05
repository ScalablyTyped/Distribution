package typings.stickyCluster

import typings.node.httpMod.Server
import typings.stickyCluster.anon.Stickyclusterworkerindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: InitializeFn): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(callback: InitializeFn, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sticky-cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* server */ Server, Unit]
  
  type InitializeFn = js.Function1[/* callback */ Callback, Unit]
  
  trait Options extends StObject {
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[js.Function1[/* index */ Double, Stickyclusterworkerindex]] = js.undefined
    
    var errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    
    var hardShutdownDelay: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnv(value: /* index */ Double => Stickyclusterworkerindex): Self = StObject.set(x, "env", js.Any.fromFunction1(value))
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setErrorHandler(value: /* err */ js.Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setHardShutdownDelay(value: Double): Self = StObject.set(x, "hardShutdownDelay", value.asInstanceOf[js.Any])
      
      inline def setHardShutdownDelayUndefined: Self = StObject.set(x, "hardShutdownDelay", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
