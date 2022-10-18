package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.TruthyTypesOf
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsSingleMod {
  
  @JSImport("rxjs-compat/operators/single", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def single[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def single[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def single[T](predicate: BooleanConstructor): OperatorFunction[T, TruthyTypesOf[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("single")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, TruthyTypesOf[T]]]
}
