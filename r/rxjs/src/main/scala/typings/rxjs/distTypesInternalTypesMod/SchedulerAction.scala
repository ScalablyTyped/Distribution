package typings.rxjs.distTypesInternalTypesMod

import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerAction[T] extends Subscription {
  
  def schedule(): Subscription = js.native
  def schedule(state: T): Subscription = js.native
  def schedule(state: T, delay: Double): Subscription = js.native
  def schedule(state: Unit, delay: Double): Subscription = js.native
}
