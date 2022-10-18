package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.Cons
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsZipWithMod {
  
  @JSImport("rxjs/dist/types/internal/operators/zipWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zipWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherInputs because its type [...ObservableInputTuple<A>] is not an array type */ otherInputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[T, Cons[T, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipWith")(otherInputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Cons[T, A]]]
}
