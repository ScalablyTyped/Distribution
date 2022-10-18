package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableZipMod {
  
  @JSImport("rxjs/dist/types/internal/observable/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zip[A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Observable[A]]
  inline def zip[A /* <: js.Array[Any] */, R](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ],
    resultSelector: js.Function1[/* values */ A, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def zip_AR[A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sourcesAndResultSelector because its type [...ObservableInputTuple<A>, (values : A): R] is not an array type */ sourcesAndResultSelector: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): Observable[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sourcesAndResultSelector.asInstanceOf[js.Any]).asInstanceOf[Observable[R]]
}
