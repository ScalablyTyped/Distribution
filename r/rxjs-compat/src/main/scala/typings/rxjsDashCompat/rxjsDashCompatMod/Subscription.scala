package typings.rxjsDashCompat.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Subscription")
@js.native
/**
  * @param {function(): void} [unsubscribe] A function describing how to
  * perform the disposal of resources when the `unsubscribe` method is called.
  */
class Subscription ()
  extends typings.rxjs.rxjsMod.Subscription {
  def this(unsubscribe: js.Function0[Unit]) = this()
}

/* static members */
@JSImport("rxjs-compat", "Subscription")
@js.native
object Subscription extends js.Object {
  /** @nocollapse */
  var EMPTY: typings.rxjs.internalSubscriptionMod.Subscription = js.native
}

