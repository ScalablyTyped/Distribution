package typings.reduxDashBatchedDashSubscribe.reduxDashBatchedDashSubscribeMod

import typings.redux.reduxMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreExtension extends js.Object {
  @JSName("subscribeImmediate")
  var subscribeImmediate_Original: js.Function1[/* listener */ js.Function0[Unit], Unsubscribe] = js.native
  def subscribeImmediate(listener: js.Function0[Unit]): Unsubscribe = js.native
}

