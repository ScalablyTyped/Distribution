package typings.rxjs.internalCompatibilityMod

import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.ObservableInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "subscribeTo")
@js.native
object subscribeTo extends js.Object {
  def apply[T](result: ObservableInput[T]): js.Function1[/* subscriber */ typings.rxjs.subscriberMod.Subscriber[T], Unit | Subscription] = js.native
}

