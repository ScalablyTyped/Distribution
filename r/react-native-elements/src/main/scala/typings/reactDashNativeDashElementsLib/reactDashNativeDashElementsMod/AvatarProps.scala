package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  /**
    * Component for enclosing element (eg: TouchableHighlight, View, etc)
    *
    * @default TouchableOpacity
    */
  var Component: js.UndefOr[reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]] = js.undefined
  /**
    * Image Component of Avatar
    * @default React Native default Image component
    */
  var ImageComponent: js.UndefOr[reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]] = js.undefined
  /**
    * Opacity when pressed
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Style for avatar image
    */
  var avatarStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageStyle] = js.undefined
  /**
    * Styling for outer container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Edit button for the avatar
    *
    * @default "{size: null, iconName: 'mode-edit', iconType: 'material', iconColor: '#fff', underlayColor: '#000', style: null}"
    */
  var editButton: js.UndefOr[stdLib.Partial[IconProps]] = js.undefined
  /**
    * Icon for the avatar
    */
  var icon: js.UndefOr[AvatarIcon] = js.undefined
  /**
    * extra styling for icon component
    */
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[
    stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ _
    ]
  ] = js.undefined
  /**
    * Callback function when pressing Edit button
    */
  var onEditPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function when long pressing component
    */
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback function when pressing component
    */
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Style for the view outside image or icon
    */
  var overlayContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Style for the placeholder
    */
  var placeholderStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Render a content inside placeholder
    */
  var renderPlaceholderContent: js.UndefOr[reactLib.reactMod.ReactElement[js.Object]] = js.undefined
  /**
    * Determines the shape of avatar
    *
    * @default false
    */
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If to show the edit button or not
    *
    * @default false
    */
  var showEditButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Size of Avatar
    * @default "small"
    */
  var size: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.small | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.medium | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.large | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.xlarge | scala.Double
  ] = js.undefined
  /**
    * Image source
    */
  var source: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Renders title in the avatar
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Style for the title
    */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    Component: reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = null,
    ImageComponent: reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState] = null,
    activeOpacity: scala.Int | scala.Double = null,
    avatarStyle: reactDashNativeLib.reactDashNativeMod.ImageStyle = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    editButton: stdLib.Partial[IconProps] = null,
    icon: AvatarIcon = null,
    iconStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    imageProps: stdLib.Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ _
    ] = null,
    onEditPress: () => scala.Unit = null,
    onLongPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    overlayContainerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    placeholderStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    renderPlaceholderContent: reactLib.reactMod.ReactElement[js.Object] = null,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    showEditButton: js.UndefOr[scala.Boolean] = js.undefined,
    size: reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.small | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.medium | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.large | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.xlarge | scala.Double = null,
    source: reactDashNativeLib.reactDashNativeMod.ImageURISource = null,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent)
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (avatarStyle != null) __obj.updateDynamic("avatarStyle")(avatarStyle)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (editButton != null) __obj.updateDynamic("editButton")(editButton)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps)
    if (onEditPress != null) __obj.updateDynamic("onEditPress")(js.Any.fromFunction0(onEditPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (renderPlaceholderContent != null) __obj.updateDynamic("renderPlaceholderContent")(renderPlaceholderContent)
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (!js.isUndefined(showEditButton)) __obj.updateDynamic("showEditButton")(showEditButton)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

