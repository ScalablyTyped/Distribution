package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsPartitionMod {
  
  @JSImport("rxjs/internal/operators/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
  @scala.inline
  def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: js.Any): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
}
