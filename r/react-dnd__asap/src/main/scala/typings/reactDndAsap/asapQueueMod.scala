package typings.reactDndAsap

import typings.reactDndAsap.typesMod.Task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asapQueueMod {
  
  @JSImport("@react-dnd/asap/dist/AsapQueue", "AsapQueue")
  @js.native
  open class AsapQueue () extends StObject {
    
    /* private */ var capacity: Any = js.native
    
    def enqueueTask(task: Task): Unit = js.native
    
    /* private */ var flush: Any = js.native
    
    /* private */ var flushing: Any = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ var pendingErrors: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    def registerPendingError(err: Any): Unit = js.native
    
    /* private */ var requestErrorThrow: Any = js.native
    
    /* private */ var requestFlush: Any = js.native
  }
}
