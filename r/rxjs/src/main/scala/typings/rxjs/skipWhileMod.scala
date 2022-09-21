package typings.rxjs

import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.rxjsBooleans.`true`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipWhileMod {
  
  @JSImport("rxjs/dist/types/internal/operators/skipWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def skipWhile[T](predicate: BooleanConstructor): OperatorFunction[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T]]
  
  inline def skipWhile_true[T](predicate: js.Function2[/* value */ T, /* index */ Double, `true`]): OperatorFunction[T, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, scala.Nothing]]
}
