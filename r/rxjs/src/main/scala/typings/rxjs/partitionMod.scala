package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partitionMod {
  
  @JSImport("rxjs/internal/observable/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def partition[T](source: ObservableInput[T], predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
  @scala.inline
  def partition[T](
    source: ObservableInput[T],
    predicate: js.Function2[/* value */ T, /* index */ Double, Boolean],
    thisArg: js.Any
  ): js.Tuple2[Observable[T], Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(source.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Observable[T], Observable[T]]]
}
