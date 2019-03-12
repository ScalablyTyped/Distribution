package typings
package reactDashShareLib.reactDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonShareButtonProps extends js.Object {
  /**
    * An object to pass any additional properties, such as `aria-*` attributes.
    */
  var additionalProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  /**
    *  Takes a function that returns a Promise to be fulfilled before calling
    * `onClick`. If you do not return promise, `onClick` is called immediately.
    */
  var beforeOnClick: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
  /** Disables click action and adds `disabled` class */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Style when button is disabled
    * @default { opacity: 0.6 }
    */
  var disabledStyle: js.UndefOr[reactLib.reactMod.ReactNs.StyleHTMLAttributes[stdLib.HTMLDivElement]] = js.undefined
  /**
    * Takes a function to be called after closing share dialog.
    */
  var onShareWindowClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * URL of the shared page
    */
  var url: java.lang.String
  var windowHeight: js.UndefOr[scala.Double] = js.undefined
  var windowWidth: js.UndefOr[scala.Double] = js.undefined
}

object CommonShareButtonProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    additionalProps: reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLDivElement] = null,
    beforeOnClick: () => js.Promise[scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledStyle: reactLib.reactMod.ReactNs.StyleHTMLAttributes[stdLib.HTMLDivElement] = null,
    onShareWindowClose: () => scala.Unit = null,
    windowHeight: scala.Int | scala.Double = null,
    windowWidth: scala.Int | scala.Double = null
  ): CommonShareButtonProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (additionalProps != null) __obj.updateDynamic("additionalProps")(additionalProps)
    if (beforeOnClick != null) __obj.updateDynamic("beforeOnClick")(js.Any.fromFunction0(beforeOnClick))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledStyle != null) __obj.updateDynamic("disabledStyle")(disabledStyle)
    if (onShareWindowClose != null) __obj.updateDynamic("onShareWindowClose")(js.Any.fromFunction0(onShareWindowClose))
    if (windowHeight != null) __obj.updateDynamic("windowHeight")(windowHeight.asInstanceOf[js.Any])
    if (windowWidth != null) __obj.updateDynamic("windowWidth")(windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonShareButtonProps]
  }
}

