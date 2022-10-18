package typings.reactQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreSubscribableMod {
  
  @JSImport("react-query/types/core/subscribable", "Subscribable")
  @js.native
  open class Subscribable[TListener /* <: js.Function */] () extends StObject {
    
    def hasListeners(): Boolean = js.native
    
    /* protected */ var listeners: js.Array[TListener] = js.native
    
    /* protected */ def onSubscribe(): Unit = js.native
    
    /* protected */ def onUnsubscribe(): Unit = js.native
    
    def subscribe(): js.Function0[Unit] = js.native
    def subscribe(listener: TListener): js.Function0[Unit] = js.native
  }
  
  type Listener = js.Function0[Unit]
}
