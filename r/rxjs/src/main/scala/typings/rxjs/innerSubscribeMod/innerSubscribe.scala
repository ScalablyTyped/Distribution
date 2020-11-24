package typings.rxjs.innerSubscribeMod

import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.subscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/innerSubscribe", "innerSubscribe")
@js.native
object innerSubscribe extends js.Object {
  
  def apply(result: js.Any, innerSubscriber: Subscriber[_]): js.UndefOr[Subscription] = js.native
}
