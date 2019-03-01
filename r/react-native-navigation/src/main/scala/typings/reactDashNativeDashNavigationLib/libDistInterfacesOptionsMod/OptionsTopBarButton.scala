package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsTopBarButton extends js.Object {
  /**
    * Set text color
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Set the button as a custom component
    */
  var component: js.UndefOr[reactDashNativeDashNavigationLib.Anon_NamePassProps] = js.undefined
  /**
    * Disable icon tinting
    */
  var disableIconTint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set text color in disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the button enabled or disabled
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the button font family
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the button icon
    */
  var icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  /**
    * Set the button icon insets
    */
  var iconInsets: js.UndefOr[IconInsets] = js.undefined
  /**
    * Button id for reference press event
    */
  var id: java.lang.String
  /**
    * (iOS only) Set the button as an iOS system icon
    */
  var systemItem: js.UndefOr[SystemItemIcon] = js.undefined
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the button text
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object OptionsTopBarButton {
  @scala.inline
  def apply(
    id: java.lang.String,
    color: Color = null,
    component: reactDashNativeDashNavigationLib.Anon_NamePassProps = null,
    disableIconTint: js.UndefOr[scala.Boolean] = js.undefined,
    disabledColor: Color = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    icon: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined,
    iconInsets: IconInsets = null,
    systemItem: SystemItemIcon = null,
    testID: java.lang.String = null,
    text: java.lang.String = null
  ): OptionsTopBarButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (color != null) __obj.updateDynamic("color")(color)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(disableIconTint)) __obj.updateDynamic("disableIconTint")(disableIconTint)
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (iconInsets != null) __obj.updateDynamic("iconInsets")(iconInsets)
    if (systemItem != null) __obj.updateDynamic("systemItem")(systemItem)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[OptionsTopBarButton]
  }
}

