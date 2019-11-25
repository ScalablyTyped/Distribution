package typings.atReachDialog

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: ReactNode = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onDismiss: () => Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    __obj.asInstanceOf[Anon_Children]
  }
}

