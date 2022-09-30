package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.ObservableInput
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionMod {
  
  @JSImport("rxjs/dist/types/internal/observable/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  inline def partition[T, A](
    source: ObservableInput[T],
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, Boolean],
    thisArg: A
  ): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  
  inline def partition_TU[T, U /* <: T */](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, /* is U */ Boolean]
  ): js.Tuple2[Observable[U], Observable[Exclude[T, U]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[U], Observable[Exclude[T, U]]]]
  
  inline def partition_TUA[T, U /* <: T */, A](
    source: ObservableInput[T],
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, /* is U */ Boolean],
    thisArg: A
  ): js.Tuple2[Observable[U], Observable[Exclude[T, U]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[U], Observable[Exclude[T, U]]]]
}
