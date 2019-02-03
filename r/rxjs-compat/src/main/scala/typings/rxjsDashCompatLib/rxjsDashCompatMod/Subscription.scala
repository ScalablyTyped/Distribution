package typings
package rxjsDashCompatLib.rxjsDashCompatMod

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
  extends rxjsLib.rxjsMod.Subscription {
  def this(unsubscribe: js.Function0[scala.Unit]) = this()
}

/* static members */
@JSImport("rxjs-compat", "Subscription")
@js.native
object Subscription extends js.Object {
  /** @nocollapse */
  var EMPTY: rxjsLib.internalSubscriptionMod.Subscription = js.native
}

