package typings.reactDashBootstrap.libSafeAnchorMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAnchorProps extends HTMLProps[SafeAnchor] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
}

object SafeAnchorProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[SafeAnchor] = null,
    componentClass: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    onClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    role: String = null
  ): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[SafeAnchorProps]
  }
}

