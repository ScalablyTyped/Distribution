package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsFindIndexMod {
  
  @JSImport("rxjs-compat/operators/findIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable[T], Boolean]): OperatorFunction[T, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Double]]
  inline def findIndex[T](predicate: BooleanConstructor): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ]]
  inline def findIndex[T](predicate: BooleanConstructor, thisArg: Any): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends rxjs.rxjs/dist/types/internal/types.Falsy ? -1 : number */ js.Any
  ]]
  inline def findIndex[T, A](
    predicate: js.ThisFunction3[/* this */ A, /* value */ T, /* index */ Double, /* source */ Observable[T], Boolean],
    thisArg: A
  ): OperatorFunction[T, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Double]]
}
