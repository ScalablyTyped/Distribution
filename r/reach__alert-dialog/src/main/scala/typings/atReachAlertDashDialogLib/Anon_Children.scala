package typings
package atReachAlertDashDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  var leastDestructiveRef: reactLib.reactMod.RefObject[stdLib.HTMLElement]
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    leastDestructiveRef: reactLib.reactMod.RefObject[stdLib.HTMLElement],
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    onDismiss: () => scala.Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], leastDestructiveRef = leastDestructiveRef)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

