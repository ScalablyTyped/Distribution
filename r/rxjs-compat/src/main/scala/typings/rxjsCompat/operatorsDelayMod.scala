package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDelayMod {
  
  @JSImport("rxjs-compat/operators/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay[T](due: js.Date): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: js.Date, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def delay[T](due: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
