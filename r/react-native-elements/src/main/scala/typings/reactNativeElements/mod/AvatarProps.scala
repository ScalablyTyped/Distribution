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
import typings.reactNativeElements.anon.PartialImageProps
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.medium
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvatarProps extends StObject {
  
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
  implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setAvatarStyle(value: ImageStyle): Self = StObject.set(x, "avatarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarStyleUndefined: Self = StObject.set(x, "avatarStyle", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setIcon(value: AvatarIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImageComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setImageProps(value: PartialImageProps): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
    
    @scala.inline
    def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
    
    @scala.inline
    def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    @scala.inline
    def setRenderPlaceholderContent(value: ReactElement): Self = StObject.set(x, "renderPlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPlaceholderContentUndefined: Self = StObject.set(x, "renderPlaceholderContent", js.undefined)
    
    @scala.inline
    def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large | xlarge | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSource(value: ImageSourcePropType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
