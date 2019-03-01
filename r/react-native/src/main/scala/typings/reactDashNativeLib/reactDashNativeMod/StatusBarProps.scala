package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarProps
  extends StatusBarPropsIOS
     with StatusBarPropsAndroid {
  /**
    * If the transition between status bar property changes should be
    * animated. Supported for backgroundColor, barStyle and hidden.
    */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
}

object StatusBarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    barStyle: StatusBarStyle = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    networkActivityIndicatorVisible: js.UndefOr[scala.Boolean] = js.undefined,
    showHideTransition: reactDashNativeLib.reactDashNativeLibStrings.fade | reactDashNativeLib.reactDashNativeLibStrings.slide = null,
    translucent: js.UndefOr[scala.Boolean] = js.undefined
  ): StatusBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(networkActivityIndicatorVisible)) __obj.updateDynamic("networkActivityIndicatorVisible")(networkActivityIndicatorVisible)
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[StatusBarProps]
  }
}

