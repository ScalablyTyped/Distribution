package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.Connectable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.SubjectLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableConnectableMod {
  
  @JSImport("rxjs/dist/types/internal/observable/connectable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectable[T](source: ObservableInput[T]): Connectable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any]).asInstanceOf[Connectable[T]]
  inline def connectable[T](source: ObservableInput[T], config: ConnectableConfig[T]): Connectable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("connectable")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Connectable[T]]
  
  trait ConnectableConfig[T] extends StObject {
    
    /**
      * A factory function used to create the Subject through which the source
      * is multicast. By default this creates a {@link Subject}.
      */
    def connector(): SubjectLike[T]
    
    /**
      * If true, the resulting observable will reset internal state upon disconnection
      * and return to a "cold" state. This allows the resulting observable to be
      * reconnected.
      * If false, upon disconnection, the connecting subject will remain the
      * connecting subject, meaning the resulting observable will not go "cold" again,
      * and subsequent repeats or resubscriptions will resubscribe to that same subject.
      */
    var resetOnDisconnect: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectableConfig {
    
    inline def apply[T](connector: () => SubjectLike[T]): ConnectableConfig[T] = {
      val __obj = js.Dynamic.literal(connector = js.Any.fromFunction0(connector))
      __obj.asInstanceOf[ConnectableConfig[T]]
    }
    
    extension [Self <: ConnectableConfig[?], T](x: Self & ConnectableConfig[T]) {
      
      inline def setConnector(value: () => SubjectLike[T]): Self = StObject.set(x, "connector", js.Any.fromFunction0(value))
      
      inline def setResetOnDisconnect(value: Boolean): Self = StObject.set(x, "resetOnDisconnect", value.asInstanceOf[js.Any])
      
      inline def setResetOnDisconnectUndefined: Self = StObject.set(x, "resetOnDisconnect", js.undefined)
    }
  }
}
