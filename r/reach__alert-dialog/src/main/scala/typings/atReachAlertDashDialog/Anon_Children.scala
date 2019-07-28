package typings.atReachAlertDashDialog

import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactNode
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var leastDestructiveRef: RefObject[HTMLElement]
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: ReactNode,
    leastDestructiveRef: RefObject[HTMLElement],
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], leastDestructiveRef = leastDestructiveRef)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

