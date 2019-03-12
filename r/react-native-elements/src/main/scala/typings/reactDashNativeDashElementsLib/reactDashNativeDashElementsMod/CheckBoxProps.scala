package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckBoxProps extends js.Object {
  /**
    *  Specify React Native component for main button
    */
  var Component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Aligns checkbox to center
    *
    *  @default false
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Flag for checking the icon
    *
    * @default false
    */
  var checked: scala.Boolean
  /**
    * Default checked color
    *
    * @default 'green'
    */
  var checkedColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'check-square-o'
    */
  var checkedIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Specify a custom checked message
    */
  var checkedTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style of main container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Specify different font family
    * @default 'System font bold (iOS)'
    * @default 'Sans Serif Bold (android)'
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Moves icon to right of text.
    *
    * @default false
    */
  var iconRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Icon family, can be one of the following
    * (required only if specifying an icon that is not from font-awesome)
    */
  var iconType: js.UndefOr[IconType] = js.undefined
  /**
    * onPress function for checkbox
    */
  var onIconPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onLongPress function for checkbox
    */
  var onLongIconPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onLongPress function for checkbox
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * onPress function for container
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Aligns checkbox to right
    *
    * @default false
    */
  var right: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of the checkbox
    *
    * @default 24
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * style of text
    */
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Title of checkbox
    */
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Additional props for the title
    */
  var titleProps: js.UndefOr[
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ _
    ]
  ] = js.undefined
  /**
    * Default unchecked color
    * @default '#bfbfbf'
    */
  var uncheckedColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default checked icon (Font Awesome Icon)
    *
    * @default 'square-o'
    */
  var uncheckedIcon: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
  /**
    * Style of container that wraps the check box and text
    */
  var wrapperStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object CheckBoxProps {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    Component: reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState] = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    checkedColor: java.lang.String = null,
    checkedIcon: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object] = null,
    checkedTitle: java.lang.String = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    fontFamily: java.lang.String = null,
    iconRight: js.UndefOr[scala.Boolean] = js.undefined,
    iconType: IconType = null,
    onIconPress: () => scala.Unit = null,
    onLongIconPress: () => scala.Unit = null,
    onLongPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    title: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object] = null,
    titleProps: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ _
    ] = null,
    uncheckedColor: java.lang.String = null,
    uncheckedIcon: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[js.Object] = null,
    wrapperStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): CheckBoxProps = {
    val __obj = js.Dynamic.literal(checked = checked)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (checkedColor != null) __obj.updateDynamic("checkedColor")(checkedColor)
    if (checkedIcon != null) __obj.updateDynamic("checkedIcon")(checkedIcon.asInstanceOf[js.Any])
    if (checkedTitle != null) __obj.updateDynamic("checkedTitle")(checkedTitle)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (!js.isUndefined(iconRight)) __obj.updateDynamic("iconRight")(iconRight)
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (onIconPress != null) __obj.updateDynamic("onIconPress")(js.Any.fromFunction0(onIconPress))
    if (onLongIconPress != null) __obj.updateDynamic("onLongIconPress")(js.Any.fromFunction0(onLongIconPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps)
    if (uncheckedColor != null) __obj.updateDynamic("uncheckedColor")(uncheckedColor)
    if (uncheckedIcon != null) __obj.updateDynamic("uncheckedIcon")(uncheckedIcon.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
}

