package typings.rxjs

import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import typings.rxjs.distTypesInternalTypesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilExecuteScheduleMod {
  
  @JSImport("rxjs/internal/util/executeSchedule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeSchedule(parentSubscription: Subscription, scheduler: SchedulerLike, work: js.Function0[Unit]): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  inline def executeSchedule(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  @scala.annotation.targetName("executeSchedule_true")
  inline def executeSchedule(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double,
    repeat: true
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.annotation.targetName("executeSchedule_false")
  inline def executeSchedule(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Double,
    repeat: false
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  @scala.annotation.targetName("executeSchedule_false")
  inline def executeSchedule(
    parentSubscription: Subscription,
    scheduler: SchedulerLike,
    work: js.Function0[Unit],
    delay: Unit,
    repeat: false
  ): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("executeSchedule")(parentSubscription.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any], work.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], repeat.asInstanceOf[js.Any])).asInstanceOf[Subscription]
}
