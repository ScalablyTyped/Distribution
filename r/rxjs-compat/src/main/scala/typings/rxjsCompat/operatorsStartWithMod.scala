package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ValueFromArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsStartWithMod {
  
  @JSImport("rxjs-compat/operators/startWith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startWith[T](value: Null): OperatorFunction[T, T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | Null]]
  inline def startWith[T](value: Unit): OperatorFunction[T, js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, js.UndefOr[T]]]
  inline def startWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(values.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
  inline def startWith[T, A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): OperatorFunction[T, T | ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWith")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | ValueFromArray[A]]]
}
