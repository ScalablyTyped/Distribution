package typings.reactNativeNavigation.optionsMod

import typings.reactNative.mod.ImageRequireSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarBackButton extends js.Object {
  /**
    * Back button icon and text color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set subtitle font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.undefined
  /**
    * Set subtitle font size
    */
  var fontSize: js.UndefOr[Double] = js.undefined
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
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
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
    fontFamily: FontFamily = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    icon: js.UndefOr[ImageRequireSource] = js.undefined,
    showTitle: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OptionsTopBarBackButton = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTitle)) __obj.updateDynamic("showTitle")(showTitle.get.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarBackButton]
  }
}

