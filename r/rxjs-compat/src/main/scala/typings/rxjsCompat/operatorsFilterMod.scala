package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.TruthyTypesOf
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsFilterMod {
  
  @JSImport("rxjs-compat/operators/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def filter[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def filter[T, A](predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, Boolean], thisArg: A): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  inline def filter_TSA_OperatorFunction[T, S /* <: T */, A](
    predicate: js.ThisFunction2[/* this */ A, /* value */ T, /* index */ Double, /* is S */ Boolean],
    thisArg: A
  ): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  inline def filter_TS_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
}
