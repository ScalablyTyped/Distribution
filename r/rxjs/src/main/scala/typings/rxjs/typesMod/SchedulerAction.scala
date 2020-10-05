package typings.rxjs.typesMod

import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerAction[T] extends Subscription {
  def schedule(): Subscription = js.native
  def schedule(state: T): Subscription = js.native
  def schedule(state: T, delay: Double): Subscription = js.native
  def schedule(state: js.UndefOr[scala.Nothing], delay: Double): Subscription = js.native
}

