package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsRaceMod {
  
  @JSImport("rxjs/internal/operators/race", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def race[T](observables: (Observable[T] | js.Array[Observable[T]])*): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def race[T](observables: js.Array[Observable[T]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  @scala.inline
  def race_TR_OperatorFunction[T, R](observables: (Observable[js.Any] | js.Array[Observable[js.Any]])*): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
  @scala.inline
  def race_TR_OperatorFunction[T, R](observables: js.Array[Observable[T]]): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(observables.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
