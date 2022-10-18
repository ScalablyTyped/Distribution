package typings.rxjs

import typings.rxjs.distTypesInternalObservableConnectableObservableMod.ConnectableObservable
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalSubjectMod.Subject
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsMulticastMod {
  
  @JSImport("rxjs/internal/operators/multicast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multicast[T](subjectFactory: js.Function0[Subject[T]]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  inline def multicast[T](subject: Subject[T]): UnaryFunction[Observable[T], ConnectableObservable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], ConnectableObservable[T]]]
  inline def multicast[T, O /* <: ObservableInput[Any] */](subjectFactory: js.Function0[Subject[T]], selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subjectFactory.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def multicast[T, O /* <: ObservableInput[Any] */](subject: Subject[T], selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("multicast")(subject.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
}
