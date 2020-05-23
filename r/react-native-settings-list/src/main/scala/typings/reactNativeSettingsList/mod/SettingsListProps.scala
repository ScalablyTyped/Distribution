package typings.reactNativeSettingsList.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsListProps extends js.Object {
  /**
    * default: white
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * default: black
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * default: 50
    */
  var defaultItemSize: js.UndefOr[Double] = js.undefined
  var defaultTitleInfoPosition: js.UndefOr[String] = js.undefined
  /**
    * default: {fontSize: 16}
    */
  var defaultTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var scrollViewProps: js.UndefOr[js.Object] = js.undefined
  /**
    * default: transparent
    */
  var underlayColor: js.UndefOr[String] = js.undefined
}

object SettingsListProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    borderColor: String = null,
    defaultItemSize: js.UndefOr[Double] = js.undefined,
    defaultTitleInfoPosition: String = null,
    defaultTitleStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    scrollViewProps: js.Object = null,
    underlayColor: String = null
  ): SettingsListProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultItemSize)) __obj.updateDynamic("defaultItemSize")(defaultItemSize.get.asInstanceOf[js.Any])
    if (defaultTitleInfoPosition != null) __obj.updateDynamic("defaultTitleInfoPosition")(defaultTitleInfoPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultTitleStyle)) __obj.updateDynamic("defaultTitleStyle")(defaultTitleStyle.asInstanceOf[js.Any])
    if (scrollViewProps != null) __obj.updateDynamic("scrollViewProps")(scrollViewProps.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsListProps]
  }
}

