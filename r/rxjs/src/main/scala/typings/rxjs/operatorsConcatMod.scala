package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsConcatMod {
  
  @JSImport("rxjs/dist/types/internal/operators/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type [...ObservableInputTuple<A>] is not an array type */ sources: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[typings.rxjs.rxjsStrings.concat & TopLevel[A]]
  ): OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(sources.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[
    T, 
    T | (/* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any)
  ]]
}
