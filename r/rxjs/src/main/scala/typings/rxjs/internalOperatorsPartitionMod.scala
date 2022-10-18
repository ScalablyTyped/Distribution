package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.UnaryFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsPartitionMod {
  
  @JSImport("rxjs/internal/operators/partition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
  inline def partition[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[UnaryFunction[Observable[T], js.Tuple2[Observable[T], Observable[T]]]]
}
