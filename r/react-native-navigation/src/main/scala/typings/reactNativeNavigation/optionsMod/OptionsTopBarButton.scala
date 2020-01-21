package typings.reactNativeNavigation.optionsMod

import typings.reactNative.mod.ImageRequireSource
import typings.reactNativeNavigation.AnonNamePassProps
import typings.reactNativeNavigation.reactNativeNavigationStrings.always
import typings.reactNativeNavigation.reactNativeNavigationStrings.ifRoom
import typings.reactNativeNavigation.reactNativeNavigationStrings.never
import typings.reactNativeNavigation.reactNativeNavigationStrings.withText
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
  var component: js.UndefOr[AnonNamePassProps] = js.undefined
  /**
    * Disable icon tinting
    */
  var disableIconTint: js.UndefOr[Boolean] = js.undefined
  /**
    * Set text color in disabled state
    */
  var disabledColor: js.UndefOr[Color] = js.undefined
  /**
    * Set the button enabled or disabled
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the button font family
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.undefined
  /**
    * Set the button icon
    */
  var icon: js.UndefOr[ImageRequireSource] = js.undefined
  /**
    * Set the button icon insets
    */
  var iconInsets: js.UndefOr[IconInsets] = js.undefined
  /**
    * Button id for reference press event
    */
  var id: String
  /**
    * (Android only) Set showAsAction value
    * @see {@link https://developer.android.com/guide/topics/resources/menu-resource|Android developer guide: Menu resource}
    */
  var showAsAction: js.UndefOr[ifRoom | withText | always | never] = js.undefined
  /**
    * (iOS only) Set the button as an iOS system icon
    */
  var systemItem: js.UndefOr[SystemItemIcon] = js.undefined
  /**
    * Set testID for reference in E2E tests
    */
  var testID: js.UndefOr[String] = js.undefined
  /**
    * Set the button text
    */
  var text: js.UndefOr[String] = js.undefined
}

object OptionsTopBarButton {
  @scala.inline
  def apply(
    id: String,
    color: Color = null,
    component: AnonNamePassProps = null,
    disableIconTint: js.UndefOr[Boolean] = js.undefined,
    disabledColor: Color = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontWeight: FontWeight = null,
    icon: Int | Double = null,
    iconInsets: IconInsets = null,
    showAsAction: ifRoom | withText | always | never = null,
    systemItem: SystemItemIcon = null,
    testID: String = null,
    text: String = null
  ): OptionsTopBarButton = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(disableIconTint)) __obj.updateDynamic("disableIconTint")(disableIconTint.asInstanceOf[js.Any])
    if (disabledColor != null) __obj.updateDynamic("disabledColor")(disabledColor.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconInsets != null) __obj.updateDynamic("iconInsets")(iconInsets.asInstanceOf[js.Any])
    if (showAsAction != null) __obj.updateDynamic("showAsAction")(showAsAction.asInstanceOf[js.Any])
    if (systemItem != null) __obj.updateDynamic("systemItem")(systemItem.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarButton]
  }
}

