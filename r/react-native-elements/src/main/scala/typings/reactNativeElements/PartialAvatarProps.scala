package typings.reactNativeElements

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.AvatarIcon
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.AvatarProps> */
trait PartialAvatarProps extends js.Object {
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  var activeOpacity: js.UndefOr[Double] = js.undefined
  var avatarStyle: js.UndefOr[ImageStyle] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var editButton: js.UndefOr[PartialIconProps] = js.undefined
  var icon: js.UndefOr[AvatarIcon] = js.undefined
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var imageProps: js.UndefOr[PartialImageProps] = js.undefined
  var onEditPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var renderPlaceholderContent: js.UndefOr[ReactElement] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var showEditButton: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | Double] = js.undefined
  var source: js.UndefOr[ImageSourcePropType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object PartialAvatarProps {
  @scala.inline
  def apply(
    Component: ComponentClass[js.Object, ComponentState] = null,
    ImageComponent: ComponentClass[js.Object, ComponentState] = null,
    activeOpacity: Int | Double = null,
    avatarStyle: ImageStyle = null,
    containerStyle: StyleProp[ViewStyle] = null,
    editButton: PartialIconProps = null,
    icon: AvatarIcon = null,
    iconStyle: StyleProp[TextStyle] = null,
    imageProps: PartialImageProps = null,
    onEditPress: () => Unit = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    placeholderStyle: StyleProp[ViewStyle] = null,
    renderPlaceholderContent: ReactElement = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    showEditButton: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | Double = null,
    source: ImageSourcePropType = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null
  ): PartialAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (avatarStyle != null) __obj.updateDynamic("avatarStyle")(avatarStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (editButton != null) __obj.updateDynamic("editButton")(editButton.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (onEditPress != null) __obj.updateDynamic("onEditPress")(js.Any.fromFunction0(onEditPress))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (renderPlaceholderContent != null) __obj.updateDynamic("renderPlaceholderContent")(renderPlaceholderContent.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(showEditButton)) __obj.updateDynamic("showEditButton")(showEditButton.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAvatarProps]
  }
}

