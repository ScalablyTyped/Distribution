package typings.rxjs.rxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Rx", "Subscription")
@js.native
/**
  * @param {function(): void} [unsubscribe] A function describing how to
  * perform the disposal of resources when the `unsubscribe` method is called.
  */
class Subscription ()
  extends typings.rxjs.subscriptionMod.Subscription {
  def this(unsubscribe: js.Function0[Unit]) = this()
}
/* static members */
@JSImport("rxjs/internal/Rx", "Subscription")
@js.native
object Subscription extends js.Object {
  
  /** @nocollapse */
  var EMPTY: typings.rxjs.subscriptionMod.Subscription = js.native
}
