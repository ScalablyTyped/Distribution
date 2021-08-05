package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StatusBarProperties
import typings.reactNative.mod.StatusBarStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.center
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProps
  extends StObject
     with ViewProps {
  
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ComponentClass[js.Any, ComponentState]] = js.undefined
  
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Background image source
    */
  var backgroundImage: js.UndefOr[ImageSourcePropType] = js.undefined
  
  /**
    * Styles for the background image in the container
    */
  var backgroundImageStyle: js.UndefOr[ImageStyle] = js.undefined
  
  /**
    * Sets the color of the status bar text.
    *
    * @default 'default'
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  
  /**
    * Styles for the container surrounding the title
    */
  var centerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Styling for main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  
  /**
    * Styling for container around the leftComponent
    */
  var leftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Determines the alignment of the title
    *
    * @default 'center'
    */
  var placement: js.UndefOr[left | center | right] = js.undefined
  
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  
  /**
    * Styling for container around the rightComponent
    */
  var rightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: js.UndefOr[StatusBarProperties] = js.undefined
}
object HeaderProps {
  
  inline def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  extension [Self <: HeaderProps](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: ImageSourcePropType): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageStyle(value: ImageStyle): Self = StObject.set(x, "backgroundImageStyle", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageStyleUndefined: Self = StObject.set(x, "backgroundImageStyle", js.undefined)
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBackgroundImageVarargs(value: ImageURISource*): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
    
    inline def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setCenterComponent(value: HeaderSubComponent): Self = StObject.set(x, "centerComponent", value.asInstanceOf[js.Any])
    
    inline def setCenterComponentUndefined: Self = StObject.set(x, "centerComponent", js.undefined)
    
    inline def setCenterContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "centerContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setCenterContainerStyleNull: Self = StObject.set(x, "centerContainerStyle", null)
    
    inline def setCenterContainerStyleUndefined: Self = StObject.set(x, "centerContainerStyle", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setLeftComponent(value: HeaderSubComponent): Self = StObject.set(x, "leftComponent", value.asInstanceOf[js.Any])
    
    inline def setLeftComponentUndefined: Self = StObject.set(x, "leftComponent", js.undefined)
    
    inline def setLeftContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftContainerStyleNull: Self = StObject.set(x, "leftContainerStyle", null)
    
    inline def setLeftContainerStyleUndefined: Self = StObject.set(x, "leftContainerStyle", js.undefined)
    
    inline def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
    inline def setPlacement(value: left | center | right): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setRightComponent(value: HeaderSubComponent): Self = StObject.set(x, "rightComponent", value.asInstanceOf[js.Any])
    
    inline def setRightComponentUndefined: Self = StObject.set(x, "rightComponent", js.undefined)
    
    inline def setRightContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setRightContainerStyleNull: Self = StObject.set(x, "rightContainerStyle", null)
    
    inline def setRightContainerStyleUndefined: Self = StObject.set(x, "rightContainerStyle", js.undefined)
    
    inline def setStatusBarProps(value: StatusBarProperties): Self = StObject.set(x, "statusBarProps", value.asInstanceOf[js.Any])
    
    inline def setStatusBarPropsUndefined: Self = StObject.set(x, "statusBarProps", js.undefined)
    
    inline def setViewComponent(value: ComponentClass[js.Any, ComponentState]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
