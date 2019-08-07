package typings.reactDashIntl

import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[Ref[_]] = js.undefined
}

object Anon_ForwardedRef {
  @scala.inline
  def apply(forwardedRef: Ref[_] = null): Anon_ForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ForwardedRef]
  }
}

