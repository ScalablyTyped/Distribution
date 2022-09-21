package typings.rxjs

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalTypesMod.Cons
import typings.rxjs.internalTypesMod.OperatorFunction
import typings.rxjs.rxjsStrings.zip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsZipMod {
  
  @JSImport("rxjs/dist/types/internal/operators/zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zip[T, A /* <: js.Array[Any] */](
    otherInputs: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ typings.rxjs.rxjsStrings.zip & TopLevel[A]
    ]
  ): OperatorFunction[T, Cons[T, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(otherInputs.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Cons[T, A]]]
  inline def zip[T, A /* <: js.Array[Any] */, R](
    otherInputsAndProject: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ typings.rxjs.rxjsStrings.zip & TopLevel[A]
    ],
    project: js.Function1[/* values */ Cons[T, A], R]
  ): OperatorFunction[T, R] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(otherInputsAndProject.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, R]]
  
  inline def zip_TA_ArrayAnyR[T, A /* <: js.Array[Any] */, R](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param otherInputsAndProject because its type [...ObservableInputTuple<A>, (values : Cons<T, A>): R] is not an array type */ otherInputsAndProject: /* import warning: importer.ImportType#apply c repeated non-array type: {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>} */ js.Array[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: rxjs.rxjs/dist/types/internal/types.ObservableInput<A[K]>}
    */ zip & TopLevel[A]
    ]
  ): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(otherInputsAndProject.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
