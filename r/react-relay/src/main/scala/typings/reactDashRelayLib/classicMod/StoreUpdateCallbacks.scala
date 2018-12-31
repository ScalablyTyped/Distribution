package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreUpdateCallbacks[T] extends js.Object {
  var onFailure: js.UndefOr[js.Function1[/* transaction */ Transaction, _]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* response */ T, _]] = js.undefined
}

