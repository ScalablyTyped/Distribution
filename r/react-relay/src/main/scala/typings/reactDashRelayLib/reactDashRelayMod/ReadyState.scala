package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyState[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.Variables */] extends js.Object {
  var error: js.UndefOr[stdLib.Error | scala.Null]
  var props: js.UndefOr[T | scala.Null]
  var retry: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object ReadyState {
  @scala.inline
  def apply[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.Variables */](error: stdLib.Error = null, props: T = null, retry: js.Function0[scala.Unit] = null): ReadyState[T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    __obj.asInstanceOf[ReadyState[T]]
  }
}

