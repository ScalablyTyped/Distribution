package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SubjectLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsConnectMod {
  
  @JSImport("rxjs/dist/types/internal/operators/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def connect[T, O /* <: ObservableInput[Any] */](selector: js.Function1[/* shared */ Observable[T], O], config: ConnectConfig[T]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(selector.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  
  trait ConnectConfig[T] extends StObject {
    
    /**
      * A factory function used to create the Subject through which the source
      * is multicast. By default, this creates a {@link Subject}.
      */
    def connector(): SubjectLike[T]
  }
  object ConnectConfig {
    
    inline def apply[T](connector: () => SubjectLike[T]): ConnectConfig[T] = {
      val __obj = js.Dynamic.literal(connector = js.Any.fromFunction0(connector))
      __obj.asInstanceOf[ConnectConfig[T]]
    }
    
    extension [Self <: ConnectConfig[?], T](x: Self & ConnectConfig[T]) {
      
      inline def setConnector(value: () => SubjectLike[T]): Self = StObject.set(x, "connector", js.Any.fromFunction0(value))
    }
  }
}
