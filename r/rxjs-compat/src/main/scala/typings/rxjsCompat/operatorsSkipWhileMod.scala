package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjsCompat.rxjsCompatBooleans.`true`
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsSkipWhileMod {
  
  @JSImport("rxjs-compat/operators/skipWhile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipWhile[T](predicate: js.Function2[/* value */ T, /* index */ Double, Boolean]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def skipWhile[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? never : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Extract<T, rxjs.rxjs/dist/types/internal/types.Falsy> extends never ? never : T */ js.Any
  ]]
  
  inline def skipWhile_true[T](predicate: js.Function2[/* value */ T, /* index */ Double, `true`]): OperatorFunction[T, scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipWhile")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, scala.Nothing]]
}
