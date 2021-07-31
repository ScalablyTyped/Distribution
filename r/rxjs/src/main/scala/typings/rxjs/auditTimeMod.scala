package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auditTimeMod {
  
  @JSImport("rxjs/internal/operators/auditTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def auditTime[T](duration: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def auditTime[T](duration: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("auditTime")(duration.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
}
