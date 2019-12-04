package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalSubscriptionMod.Subscription
import typings.rxjs.internalTypesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeTo")
@js.native
object subscribeTo extends js.Object {
  def apply[T](result: ObservableInput[T]): js.Function1[
    /* subscriber */ typings.rxjs.internalSubscriberMod.Subscriber[T], 
    Unit | Subscription
  ] = js.native
}

