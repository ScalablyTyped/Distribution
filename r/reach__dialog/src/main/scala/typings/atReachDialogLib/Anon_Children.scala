package typings
package atReachDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    onDismiss: () => scala.Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

