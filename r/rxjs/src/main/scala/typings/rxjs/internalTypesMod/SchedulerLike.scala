package typings.rxjs.internalTypesMod

import typings.rxjs.subscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerLike
  extends StObject
     with TimestampProvider {
  
  def schedule[T](work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    delay: Double
  ): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], js.UndefOr[T], Unit],
    delay: Double,
    state: T
  ): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    delay: Unit,
    state: T
  ): Subscription = js.native
}
