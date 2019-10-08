package typings.reactDashHotkeys.reactDashHotkeysMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.RefObject
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeysProps extends HotKeysEnabledProps {
  /**
    * The React component that should be used in the DOM to wrap the FocusTrap's
    * children and have the internal key listeners bound to
    */
  var component: js.UndefOr[(ComponentClass[js.Object, ComponentState]) | String] = js.undefined
  var innerRef: js.UndefOr[RefObject[HTMLInputElement]] = js.undefined
}

object HotKeysProps {
  @scala.inline
  def apply(
    HotKeysEnabledProps: HotKeysEnabledProps = null,
    component: (ComponentClass[js.Object, ComponentState]) | String = null,
    innerRef: RefObject[HTMLInputElement] = null
  ): HotKeysProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HotKeysEnabledProps)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    __obj.asInstanceOf[HotKeysProps]
  }
}

