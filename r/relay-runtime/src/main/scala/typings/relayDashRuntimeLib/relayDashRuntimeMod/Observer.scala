package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[_]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ stdLib.Error, _]] = js.undefined
  var next: js.UndefOr[js.Function1[/* nextThing */ T, _]] = js.undefined
  var start: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
  var unsubscribe: js.UndefOr[js.Function1[/* subscription */ Subscription, _]] = js.undefined
}

