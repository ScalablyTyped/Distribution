package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsObserveOnMod {
  
  @JSImport("rxjs-compat/operators/observeOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def observeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
