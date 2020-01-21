package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.slide
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
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object StatusBarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    barStyle: StatusBarStyle = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.undefined,
    showHideTransition: fade | slide = null,
    translucent: js.UndefOr[Boolean] = js.undefined
  ): StatusBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(networkActivityIndicatorVisible)) __obj.updateDynamic("networkActivityIndicatorVisible")(networkActivityIndicatorVisible.asInstanceOf[js.Any])
    if (showHideTransition != null) __obj.updateDynamic("showHideTransition")(showHideTransition.asInstanceOf[js.Any])
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarProps]
  }
}

