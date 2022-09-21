package typings.relayRuntime

import typings.relayRuntime.relayObservableMod.Observer
import typings.relayRuntime.relayObservableMod.Sink
import typings.relayRuntime.relayObservableMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayReplaySubjectMod {
  
  @JSImport("relay-runtime/lib/util/RelayReplaySubject", "RelayReplaySubject")
  @js.native
  open class RelayReplaySubject[T] () extends StObject {
    
    def complete(): Unit = js.native
    
    def error(error: js.Error): Unit = js.native
    
    def getObserverCount(): Double = js.native
    
    def next(data: T): Unit = js.native
    
    def subscribe(observer: Observer[T]): Subscription = js.native
    def subscribe(observer: Sink[T]): Subscription = js.native
    
    def unsubscribe(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.relayRuntime.anon.DataKind[T]
    - typings.relayRuntime.anon.Error
    - typings.relayRuntime.anon.`1`
  */
  trait Event[T] extends StObject
  object Event {
    
    inline def `1`(): typings.relayRuntime.anon.`1` = {
      val __obj = js.Dynamic.literal(kind = "complete")
      __obj.asInstanceOf[typings.relayRuntime.anon.`1`]
    }
    
    inline def DataKind[T](data: T): typings.relayRuntime.anon.DataKind[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = "next")
      __obj.asInstanceOf[typings.relayRuntime.anon.DataKind[T]]
    }
    
    inline def Error(error: js.Error): typings.relayRuntime.anon.Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "error")
      __obj.asInstanceOf[typings.relayRuntime.anon.Error]
    }
  }
}
