package typings.reactDashIntl

import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRefInstance extends js.Object {
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] | Null] = js.undefined
}

object Anon_ForwardedRefInstance {
  @scala.inline
  def apply(forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | RefObject[_] = null): Anon_ForwardedRefInstance = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRefInstance]
  }
}

