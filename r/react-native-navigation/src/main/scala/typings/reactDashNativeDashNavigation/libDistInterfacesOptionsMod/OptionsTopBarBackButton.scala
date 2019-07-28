package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarBackButton extends js.Object {
  /**
    * Back button icon and text color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Image to show as the back button
    */
  var icon: js.UndefOr[ImageRequireSource] = js.undefined
  /**
    * Show title or just the icon
    * #### (iOS specific)
    */
  var showTitle: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the back button title
    * #### (iOS specific)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Weither the back button is visible or not
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OptionsTopBarBackButton {
  @scala.inline
  def apply(
    color: Color = null,
    icon: js.UndefOr[ImageRequireSource] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsTopBarBackButton = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OptionsTopBarBackButton]
  }
}

