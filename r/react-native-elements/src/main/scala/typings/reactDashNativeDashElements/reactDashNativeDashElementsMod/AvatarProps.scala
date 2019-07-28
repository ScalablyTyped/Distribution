package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.ImageURISource
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.large
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.medium
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.small
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.xlarge
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  /**
    * Component for enclosing element (eg: TouchableHighlight, View, etc)
    *
    * @default TouchableOpacity
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Image Component of Avatar
    * @default React Native default Image component
    */
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  /**
    * Opacity when pressed
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * Style for avatar image
    */
  var avatarStyle: js.UndefOr[ImageStyle] = js.undefined
  /**
    * Styling for outer container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Edit button for the avatar
    *
    * @default "{size: null, iconName: 'mode-edit', iconType: 'material', iconColor: '#fff', underlayColor: '#000', style: null}"
    */
  var editButton: js.UndefOr[Partial[IconProps]] = js.undefined
  /**
    * Icon for the avatar
    */
  var icon: js.UndefOr[AvatarIcon] = js.undefined
  /**
    * extra styling for icon component
    */
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[
    Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ _
    ]
  ] = js.undefined
  /**
    * Callback function when pressing Edit button
    */
  var onEditPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function when long pressing component
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback function when pressing component
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Style for the view outside image or icon
    */
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Style for the placeholder
    */
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Render a content inside placeholder
    */
  var renderPlaceholderContent: js.UndefOr[ReactElement] = js.undefined
  /**
    * Determines the shape of avatar
    *
    * @default false
    */
  var rounded: js.UndefOr[Boolean] = js.undefined
  /**
    * If to show the edit button or not
    *
    * @default false
    */
  var showEditButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Size of Avatar
    * @default "small"
    */
  var size: js.UndefOr[small | medium | large | xlarge | Double] = js.undefined
  /**
    * Image source
    */
  var source: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Renders title in the avatar
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Style for the title
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    ImageComponent: ComponentClass[js.Object, ComponentState] = null,
    activeOpacity: Int | Double = null,
    avatarStyle: ImageStyle = null,
    containerStyle: StyleProp[ViewStyle] = null,
    editButton: Partial[IconProps] = null,
    icon: AvatarIcon = null,
    iconStyle: StyleProp[TextStyle] = null,
    imageProps: Partial[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ImageProperties */ _
    ] = null,
    onEditPress: () => Unit = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    placeholderStyle: StyleProp[ViewStyle] = null,
    renderPlaceholderContent: ReactElement = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    showEditButton: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | Double = null,
    source: ImageURISource = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
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

