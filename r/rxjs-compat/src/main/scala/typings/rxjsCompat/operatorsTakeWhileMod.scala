package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.TruthyTypesOf
import typings.rxjsCompat.rxjsCompatBooleans.`false`
import typings.rxjsCompat.rxjsCompatBooleans.`true`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTakeWhileMod {
  
  @JSImport("rxjs-compat/operators/takeWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def takeWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean], inclusive: Boolean): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def takeWhile[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  
  inline def takeWhile_TS_OperatorFunction[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean]): OperatorFunction[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, S]]
  
  inline def takeWhile_false[T](predicate: BooleanConstructor, inclusive: `false`): OperatorFunction[T, TruthyTypesOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
  inline def takeWhile_false[T, S /* <: T */](predicate: js.Function2[/* value */ T, /* index */ Double, /* is S */ Boolean], inclusive: `false`): OperatorFunction[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, S]]
  
  inline def takeWhile_true[T](predicate: BooleanConstructor, inclusive: `true`): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("takeWhile")(predicate.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
