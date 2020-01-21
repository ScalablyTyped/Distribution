package typings.reachAlertDialog

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: ReactNode
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var leastDestructiveRef: RefObject[HTMLElement]
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(
    leastDestructiveRef: RefObject[HTMLElement],
    children: ReactNode = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(leastDestructiveRef = leastDestructiveRef.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[AnonChildren]
  }
}

