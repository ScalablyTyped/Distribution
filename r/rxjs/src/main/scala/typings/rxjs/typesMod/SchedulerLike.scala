package typings.rxjs.typesMod

import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerLike extends js.Object {
  def now(): Double = js.native
  def schedule[T](work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    delay: js.UndefOr[scala.Nothing],
    state: T
  ): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    delay: Double
  ): Subscription = js.native
  def schedule[T](
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    delay: Double,
    state: T
  ): Subscription = js.native
}

