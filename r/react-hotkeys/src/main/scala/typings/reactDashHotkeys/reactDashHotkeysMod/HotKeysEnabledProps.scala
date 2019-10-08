package typings.reactDashHotkeys.reactDashHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeysEnabledProps extends GlobalHotKeysProps {
  /**
    * Function to call when this component loses focus in the browser
    */
  @JSName("onBlur")
  var onBlur_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Function to call when this component gains focus in the browser
    */
  @JSName("onFocus")
  var onFocus_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object HotKeysEnabledProps {
  @scala.inline
  def apply(
    GlobalHotKeysProps: GlobalHotKeysProps = null,
    onBlur: () => Unit = null,
    onFocus: () => Unit = null
  ): HotKeysEnabledProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, GlobalHotKeysProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    __obj.asInstanceOf[HotKeysEnabledProps]
  }
}

