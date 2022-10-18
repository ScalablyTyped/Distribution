package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsOnErrorResumeNextMod {
  
  @JSImport("rxjs/dist/types/internal/operators/onErrorResumeNext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onErrorResumeNext[T, A /* <: js.Array[Any] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Any
    ]
  ): OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("onErrorResumeNext")(sources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ]]
}
