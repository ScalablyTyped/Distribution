package typings
package reactDashBootstrapLib.libSafeAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAnchorProps
  extends reactLib.reactMod.HTMLProps[SafeAnchor] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[reactLib.reactMod.MouseEventHandler[js.Object]] = js.undefined
}

object SafeAnchorProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[SafeAnchor] = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[js.Object] = null,
    role: java.lang.String = null
  ): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[SafeAnchorProps]
  }
}

