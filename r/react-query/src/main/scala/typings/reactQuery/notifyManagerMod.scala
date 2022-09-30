package typings.reactQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifyManagerMod {
  
  @JSImport("react-query/types/core/notifyManager", "NotifyManager")
  @js.native
  open class NotifyManager_ () extends StObject {
    
    def batch[T](callback: js.Function0[T]): T = js.native
    
    /**
      * All calls to the wrapped function will be batched.
      */
    def batchCalls[T /* <: js.Function */](callback: T): T = js.native
    
    /* private */ var batchNotifyFn: Any = js.native
    
    def flush(): Unit = js.native
    
    /* private */ var notifyFn: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    def schedule(callback: NotifyCallback): Unit = js.native
    
    /**
      * Use this method to set a custom function to batch notifications together into a single tick.
      * By default React Query will use the batch function provided by ReactDOM or React Native.
      */
    def setBatchNotifyFunction(fn: BatchNotifyFunction): Unit = js.native
    
    /**
      * Use this method to set a custom notify function.
      * This can be used to for example wrap notifications with `React.act` while running tests.
      */
    def setNotifyFunction(fn: NotifyFunction): Unit = js.native
    
    /* private */ var transactions: Any = js.native
  }
  
  @JSImport("react-query/types/core/notifyManager", "notifyManager")
  @js.native
  val notifyManager: NotifyManager_ = js.native
  
  type BatchNotifyFunction = js.Function1[/* callback */ js.Function0[Unit], Unit]
  
  type NotifyCallback = js.Function0[Unit]
  
  type NotifyFunction = js.Function1[/* callback */ js.Function0[Unit], Unit]
}
