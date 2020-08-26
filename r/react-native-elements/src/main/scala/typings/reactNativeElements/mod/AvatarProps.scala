package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialIconPropsPartialIm
import typings.reactNativeElements.anon.PartialImageProps
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvatarProps extends js.Object {
  /**
    * Component for enclosing element (eg: TouchableHighlight, View, etc)
    *
    * @default TouchableOpacity
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Image Component of Avatar
    * @default React Native default Image component
    */
  var ImageComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Edit button for the avatar
    *
    * @default "{size: null, iconName: 'mode-edit', iconType: 'material', iconColor: '#fff', underlayColor: '#000', style: null}"
    */
  var accessory: js.UndefOr[PartialIconPropsPartialIm] = js.native
  /**
    * Opacity when pressed
    *
    * @default 0.2
    */
  var activeOpacity: js.UndefOr[Double] = js.native
  /**
    * Style for avatar image
    */
  var avatarStyle: js.UndefOr[ImageStyle] = js.native
  /**
    * Styling for outer container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Icon for the avatar
    */
  var icon: js.UndefOr[AvatarIcon] = js.native
  /**
    * extra styling for icon component
    */
  var iconStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  /**
    * Optional properties to pass to the image if provided e.g "resizeMode"
    */
  var imageProps: js.UndefOr[PartialImageProps] = js.native
  /**
    * Callback function when pressing Edit button
    */
  var onAccessoryPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function when long pressing component
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback function when pressing component
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Style for the view outside image or icon
    */
  var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Style for the placeholder
    */
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Render a content inside placeholder
    */
  var renderPlaceholderContent: js.UndefOr[ReactElement] = js.native
  /**
    * Determines the shape of avatar
    *
    * @default false
    */
  var rounded: js.UndefOr[Boolean] = js.native
  /**
    * If to show the edit button or not
    *
    * @default false
    */
  var showAccessory: js.UndefOr[Boolean] = js.native
  /**
    * Size of Avatar
    * @default "small"
    */
  var size: js.UndefOr[small | medium | large | xlarge | Double] = js.native
  /**
    * Image source
    */
  var source: js.UndefOr[ImageSourcePropType] = js.native
  /**
    * Renders title in the avatar
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Style for the title
    */
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
}

object AvatarProps {
  @scala.inline
  def apply(): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarProps]
  }
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    @scala.inline
    def setImageComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("ImageComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageComponent: Self = this.set("ImageComponent", js.undefined)
    @scala.inline
    def setAccessory(value: PartialIconPropsPartialIm): Self = this.set("accessory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessory: Self = this.set("accessory", js.undefined)
    @scala.inline
    def setActiveOpacity(value: Double): Self = this.set("activeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveOpacity: Self = this.set("activeOpacity", js.undefined)
    @scala.inline
    def setAvatarStyle(value: ImageStyle): Self = this.set("avatarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarStyle: Self = this.set("avatarStyle", js.undefined)
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    @scala.inline
    def setIcon(value: AvatarIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconStyle(value: StyleProp[TextStyle]): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setIconStyleNull: Self = this.set("iconStyle", null)
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = this.set("imageProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageProps: Self = this.set("imageProps", js.undefined)
    @scala.inline
    def setOnAccessoryPress(value: () => Unit): Self = this.set("onAccessoryPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessoryPress: Self = this.set("onAccessoryPress", js.undefined)
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayContainerStyle: Self = this.set("overlayContainerStyle", js.undefined)
    @scala.inline
    def setOverlayContainerStyleNull: Self = this.set("overlayContainerStyle", null)
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = this.set("placeholderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderStyle: Self = this.set("placeholderStyle", js.undefined)
    @scala.inline
    def setPlaceholderStyleNull: Self = this.set("placeholderStyle", null)
    @scala.inline
    def setRenderPlaceholderContent(value: ReactElement): Self = this.set("renderPlaceholderContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderPlaceholderContent: Self = this.set("renderPlaceholderContent", js.undefined)
    @scala.inline
    def setRounded(value: Boolean): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setShowAccessory(value: Boolean): Self = this.set("showAccessory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAccessory: Self = this.set("showAccessory", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large | xlarge | Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
  }
  
}

