package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRaceMod {
  
  @JSImport("rxjs-compat/operator/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def race[T](observables: (Observable_[T] | js.Array[Observable_[T]])*): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[T]]
  inline def race[T](observables: js.Array[Observable_[T]]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def race_TR[T, R](observables: (Observable_[Any] | js.Array[Observable_[Any]])*): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Observable_[R]]
  inline def race_TR[T, R](observables: js.Array[Observable_[T]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
