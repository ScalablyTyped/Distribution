package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.Cons
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsCombineLatestWithMod {
  
  @JSImport("rxjs/internal/operators/combineLatestWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatestWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherSources because its type [...ObservableInputTuple<A>] is not an array type */ otherSources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[T, Cons[T, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatestWith")(otherSources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Cons[T, A]]]
}
