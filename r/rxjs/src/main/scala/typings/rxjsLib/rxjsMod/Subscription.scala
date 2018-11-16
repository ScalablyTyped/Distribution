package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "Subscription")
@js.native
class Subscription ()
  extends rxjsLib.internalSubscriptionMod.Subscription {
  /**
       * @param {function(): void} [unsubscribe] A function describing how to
       * perform the disposal of resources when the `unsubscribe` method is called.
       */
  def this(unsubscribe: js.Function0[scala.Unit]) = this()
}

@JSImport("rxjs", "Subscription")
@js.native
object Subscription extends js.Object {
  /** @nocollapse */
  var EMPTY: rxjsLib.internalSubscriptionMod.Subscription = js.native
}

