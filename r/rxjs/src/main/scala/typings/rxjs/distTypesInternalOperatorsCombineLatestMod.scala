package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsCombineLatestMod {
  
  @JSImport("rxjs/dist/types/internal/operators/combineLatest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineLatest[T, A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ]]
  inline def combineLatest[T, A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    project: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: A */ /* values */ js.Array[A], 
      R
    ]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("combineLatest")(sources.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
}
