package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.distTypesInternalTypesMod.ObservedValueOf
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.TimestampProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsPublishReplayMod {
  
  @JSImport("rxjs-compat/operators/publishReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Double, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Double, windowTime: Unit, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Double, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T](bufferSize: Unit, windowTime: Unit, timestampProvider: TimestampProvider): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Double,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Double, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Double,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Double, windowTime: Unit, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Double, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Unit,
    windowTime: Double,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Double, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Unit, selector: js.Function1[/* shared */ Observable[T], O]): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](
    bufferSize: Unit,
    windowTime: Unit,
    selector: js.Function1[/* shared */ Observable[T], O],
    timestampProvider: TimestampProvider
  ): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
  inline def publishReplay[T, O /* <: ObservableInput[Any] */](bufferSize: Unit, windowTime: Unit, selector: Unit, timestampProvider: TimestampProvider): OperatorFunction[T, ObservedValueOf[O]] = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], timestampProvider.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, ObservedValueOf[O]]]
}
