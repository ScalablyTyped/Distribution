package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps
  extends StObject
     with typings.reactNative.mod.ImageProps {
  
  /**
    * Component for enclosing element (eg: TouchableHighlight, View, etc)
    *
    * @default View
    */
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  /**
    * Specify a different component as the Image component.
    *
    * @default Image
    */
  var ImageComponent: js.UndefOr[ComponentType[js.Any]] = js.undefined
  
  /**
    * Content to render when image is loading
    */
  var PlaceholderContent: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Additional styling for the container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Callback function when long pressing component
    */
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback function when pressing component
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Additional styling for the placeholder container
    */
  var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Perform fade transition on image load
    *
    * @default true
    */
  var transition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets transition's duration
    *
    * @default 360
    */
  var transitionDuration: js.UndefOr[Double] = js.undefined
}
object ImageProps {
  
  @scala.inline
  def apply(source: ImageSourcePropType): ImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
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
    def setImageComponent(value: ComponentType[js.Any]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setPlaceholderContent(value: ReactElement): Self = StObject.set(x, "PlaceholderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderContentUndefined: Self = StObject.set(x, "PlaceholderContent", js.undefined)
    
    @scala.inline
    def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
    
    @scala.inline
    def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
    
    @scala.inline
    def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
