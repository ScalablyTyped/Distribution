package typings.reactIntl.anon

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardedRef extends js.Object {
  var forwardedRef: js.UndefOr[Ref[_]] = js.undefined
}

object ForwardedRef {
  @scala.inline
  def apply(forwardedRef: js.UndefOr[Null | Ref[_]] = js.undefined): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardedRef)) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedRef]
  }
}

