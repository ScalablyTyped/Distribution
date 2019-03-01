package typings
package reactDashNativeDashSettingsDashListLib.reactDashNativeDashSettingsDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingsListProps extends js.Object {
  /**
    * default: white
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default: black
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default: 50
    */
  var defaultItemSize: js.UndefOr[scala.Double] = js.undefined
  var defaultTitleInfoPosition: js.UndefOr[java.lang.String] = js.undefined
  /**
    * default: {fontSize: 16}
    */
  var defaultTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var scrollViewProps: js.UndefOr[js.Object] = js.undefined
  /**
    * default: transparent
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
}

object SettingsListProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    defaultItemSize: scala.Int | scala.Double = null,
    defaultTitleInfoPosition: java.lang.String = null,
    defaultTitleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    scrollViewProps: js.Object = null,
    underlayColor: java.lang.String = null
  ): SettingsListProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (defaultItemSize != null) __obj.updateDynamic("defaultItemSize")(defaultItemSize.asInstanceOf[js.Any])
    if (defaultTitleInfoPosition != null) __obj.updateDynamic("defaultTitleInfoPosition")(defaultTitleInfoPosition)
    if (defaultTitleStyle != null) __obj.updateDynamic("defaultTitleStyle")(defaultTitleStyle.asInstanceOf[js.Any])
    if (scrollViewProps != null) __obj.updateDynamic("scrollViewProps")(scrollViewProps)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[SettingsListProps]
  }
}

