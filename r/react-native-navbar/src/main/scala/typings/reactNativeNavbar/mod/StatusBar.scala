package typings.reactNativeNavbar.mod

import typings.reactNativeNavbar.reactNativeNavbarStrings.`light-content`
import typings.reactNativeNavbar.reactNativeNavbarStrings.fade
import typings.reactNativeNavbar.reactNativeNavbarStrings.none
import typings.reactNativeNavbar.reactNativeNavbarStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBar extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.undefined
  var hideAnimation: js.UndefOr[fade | slide | none] = js.undefined
  var showAnimation: js.UndefOr[fade | slide | none] = js.undefined
  var style: js.UndefOr[`light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
}

object StatusBar {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideAnimation: fade | slide | none = null,
    showAnimation: fade | slide | none = null,
    style: `light-content` | typings.reactNativeNavbar.reactNativeNavbarStrings.default = null,
    tintColor: String = null
  ): StatusBar = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(hideAnimation.asInstanceOf[js.Any])
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(showAnimation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBar]
  }
}

