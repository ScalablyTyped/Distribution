package typings.rxjsCompat

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import typings.rxjs.distTypesInternalTypesMod.ValueFromArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableOfMod {
  
  @JSImport("rxjs-compat/observable/of", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Observable[scala.Nothing]]
  inline def of(scheduler: SchedulerLike): Observable[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[scala.Nothing]]
  inline def of(value: Null): Observable[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[Null]]
  inline def of(value: Unit): Observable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[Unit]]
  inline def of[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(values.asInstanceOf[js.Any]).asInstanceOf[Observable[ValueFromArray[A]]]
  inline def of[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param valuesAndScheduler because its type [...A, SchedulerLike] is not an array type */ valuesAndScheduler: /* import warning: importer.ImportType#apply c repeated non-array type: A */ js.Array[A]
  ): Observable[ValueFromArray[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(valuesAndScheduler.asInstanceOf[js.Any]).asInstanceOf[Observable[ValueFromArray[A]]]
  
  inline def of_T[T](): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Observable[T]]
  inline def of_T[T](value: T): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(value.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]
}
