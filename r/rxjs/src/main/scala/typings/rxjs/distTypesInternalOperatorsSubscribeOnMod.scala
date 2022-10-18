package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsSubscribeOnMod {
  
  @JSImport("rxjs/dist/types/internal/operators/subscribeOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subscribeOn[T](scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def subscribeOn[T](scheduler: SchedulerLike, delay: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
