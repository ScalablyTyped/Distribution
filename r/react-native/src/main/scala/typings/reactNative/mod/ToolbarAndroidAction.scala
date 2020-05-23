package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.ifRoom
import typings.reactNative.reactNativeStrings.never
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
  var show: js.UndefOr[always | ifRoom | never] = js.undefined
  /**
    * showWithText: boolean, whether to show text alongside the icon or not
    */
  var showWithText: js.UndefOr[Boolean] = js.undefined
  /**
    *  title: required, the title of this action
    */
  var title: String
}

object ToolbarAndroidAction {
  @scala.inline
  def apply(
    title: String,
    icon: ImageURISource = null,
    show: always | ifRoom | never = null,
    showWithText: js.UndefOr[Boolean] = js.undefined
  ): ToolbarAndroidAction = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(showWithText)) __obj.updateDynamic("showWithText")(showWithText.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAndroidAction]
  }
}

