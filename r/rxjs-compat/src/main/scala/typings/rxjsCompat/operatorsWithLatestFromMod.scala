package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsWithLatestFromMod {
  
  @JSImport("rxjs-compat/operators/withLatestFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withLatestFrom[T, O /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<O>] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: O */ js.Array[O]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(inputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: O */ js.Array[O]
  ]]
  
  inline def withLatestFrom_TOR[T, O /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param inputs because its type [...ObservableInputTuple<O>, (value : [T, ...O]): R] is not an array type */ inputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof O ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<O[K]>} */ js.Any
    ]
  ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLatestFrom")(inputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
