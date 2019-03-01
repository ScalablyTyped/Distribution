package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarAndroidAction extends js.Object {
  /**
    * icon: the icon for this action, e.g. require('./some_icon.png')
    */
  var icon: js.UndefOr[ImageURISource] = js.undefined
  /**
    * show: when to show this action as an icon or hide it in the overflow menu: always, ifRoom or never
    */
  var show: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.ifRoom | reactDashNativeLib.reactDashNativeLibStrings.never
  ] = js.undefined
  /**
    * showWithText: boolean, whether to show text alongside the icon or not
    */
  var showWithText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  title: required, the title of this action
    */
  var title: java.lang.String
}

object ToolbarAndroidAction {
  @scala.inline
  def apply(
    title: java.lang.String,
    icon: ImageURISource = null,
    show: reactDashNativeLib.reactDashNativeLibStrings.always | reactDashNativeLib.reactDashNativeLibStrings.ifRoom | reactDashNativeLib.reactDashNativeLibStrings.never = null,
    showWithText: js.UndefOr[scala.Boolean] = js.undefined
  ): ToolbarAndroidAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(showWithText)) __obj.updateDynamic("showWithText")(showWithText)
    __obj.asInstanceOf[ToolbarAndroidAction]
  }
}

