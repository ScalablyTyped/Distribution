package typings.stagehand

import typings.stagehand.anon.Methods
import typings.stagehand.mod.Implementation
import typings.stagehand.mod.MessageEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStagehandMod {
  
  @JSImport("stagehand/lib/stagehand", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with Stagehand[T] {
    def this(implementation: Implementation[T]) = this()
    
    /* CompleteClass */
    override def call(method: String, args: js.Array[Any]): js.Promise[Any] = js.native
    
    /* private */ /* CompleteClass */
    var commandCoordinator: Any = js.native
    
    /* CompleteClass */
    override def connect(endpoint: MessageEndpoint): js.Promise[Methods] = js.native
    
    /* CompleteClass */
    override def disconnect(): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var endpoint: Any = js.native
    
    /* private */ /* CompleteClass */
    var executor: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRegistry: Any = js.native
    
    /* private */ /* CompleteClass */
    var implementation: Any = js.native
    
    /* CompleteClass */
    override def isConnected(): Boolean = js.native
    
    /* CompleteClass */
    override def listen(endpoint: MessageEndpoint): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var rehydrateRemoteFunction: Any = js.native
    
    /* private */ /* CompleteClass */
    var shutdown: Any = js.native
    
    /* private */ /* CompleteClass */
    var startup: Any = js.native
  }
  
  trait Stagehand[T] extends StObject {
    
    def call(method: String, args: js.Array[Any]): js.Promise[Any]
    
    /* private */ var commandCoordinator: Any
    
    def connect(endpoint: MessageEndpoint): js.Promise[Methods]
    
    def disconnect(): js.Promise[Unit]
    
    /* private */ var endpoint: Any
    
    /* private */ var executor: Any
    
    /* private */ var handleRegistry: Any
    
    /* private */ var implementation: Any
    
    def isConnected(): Boolean
    
    def listen(endpoint: MessageEndpoint): js.Promise[Unit]
    
    /* private */ var rehydrateRemoteFunction: Any
    
    /* private */ var shutdown: Any
    
    /* private */ var startup: Any
  }
  object Stagehand {
    
    inline def apply[T](
      call: (String, js.Array[Any]) => js.Promise[Any],
      commandCoordinator: Any,
      connect: MessageEndpoint => js.Promise[Methods],
      disconnect: () => js.Promise[Unit],
      endpoint: Any,
      executor: Any,
      handleRegistry: Any,
      implementation: Any,
      isConnected: () => Boolean,
      listen: MessageEndpoint => js.Promise[Unit],
      rehydrateRemoteFunction: Any,
      shutdown: Any,
      startup: Any
    ): Stagehand[T] = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call), commandCoordinator = commandCoordinator.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction0(disconnect), endpoint = endpoint.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], handleRegistry = handleRegistry.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], isConnected = js.Any.fromFunction0(isConnected), listen = js.Any.fromFunction1(listen), rehydrateRemoteFunction = rehydrateRemoteFunction.asInstanceOf[js.Any], shutdown = shutdown.asInstanceOf[js.Any], startup = startup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stagehand[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stagehand[?], T] (val x: Self & Stagehand[T]) extends AnyVal {
      
      inline def setCall(value: (String, js.Array[Any]) => js.Promise[Any]): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
      
      inline def setCommandCoordinator(value: Any): Self = StObject.set(x, "commandCoordinator", value.asInstanceOf[js.Any])
      
      inline def setConnect(value: MessageEndpoint => js.Promise[Methods]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDisconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      inline def setEndpoint(value: Any): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: Any): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      inline def setHandleRegistry(value: Any): Self = StObject.set(x, "handleRegistry", value.asInstanceOf[js.Any])
      
      inline def setImplementation(value: Any): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setIsConnected(value: () => Boolean): Self = StObject.set(x, "isConnected", js.Any.fromFunction0(value))
      
      inline def setListen(value: MessageEndpoint => js.Promise[Unit]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setRehydrateRemoteFunction(value: Any): Self = StObject.set(x, "rehydrateRemoteFunction", value.asInstanceOf[js.Any])
      
      inline def setShutdown(value: Any): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
      
      inline def setStartup(value: Any): Self = StObject.set(x, "startup", value.asInstanceOf[js.Any])
    }
  }
}
