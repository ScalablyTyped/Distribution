package typings.rxjs

import typings.rxjs.distTypesInternalObservableFromEventMod.EventListenerOptions
import typings.rxjs.distTypesInternalObservableFromEventMod.HasEventTargetAddRemove
import typings.rxjs.distTypesInternalObservableFromEventMod.JQueryStyleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeCompatibleEventEmitter
import typings.rxjs.distTypesInternalObservableFromEventMod.NodeStyleEventEmitter
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableFromEventMod {
  
  @JSImport("rxjs/internal/observable/fromEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEvent(target: NodeCompatibleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: NodeStyleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter], eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: JQueryStyleEventEmitter[Any, T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: NodeCompatibleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[R](
    target: NodeStyleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T](target: ArrayLike[HasEventTargetAddRemove[T]], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: JQueryStyleEventEmitter[Any, T],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[JQueryStyleEventEmitter[Any, T]],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def fromEvent_T[T](target: NodeCompatibleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](target: NodeStyleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](
    target: ArrayLike[
      HasEventTargetAddRemove[T] | (JQueryStyleEventEmitter[Any, T]) | NodeCompatibleEventEmitter | NodeStyleEventEmitter
    ],
    eventName: String
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromEvent_TR[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
}
