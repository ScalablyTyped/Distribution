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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps extends ViewProps {
  
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.native
  
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Background image source
    */
  var backgroundImage: js.UndefOr[ImageSourcePropType] = js.native
  
  /**
    * Styles for the background image in the container
    */
  var backgroundImageStyle: js.UndefOr[ImageStyle] = js.native
  
  /**
    * Sets the color of the status bar text.
    *
    * @default 'default'
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.native
  
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.native
  
  /**
    * Styles for the container surrounding the title
    */
  var centerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Styling for main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.native
  
  /**
    * Styling for container around the leftComponent
    */
  var leftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.native
  
  /**
    * Determines the alignment of the title
    *
    * @default 'center'
    */
  var placement: js.UndefOr[left | center | right] = js.native
  
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.native
  
  /**
    * Styling for container around the rightComponent
    */
  var rightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: js.UndefOr[StatusBarProperties] = js.native
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: ImageSourcePropType): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageStyle(value: ImageStyle): Self = StObject.set(x, "backgroundImageStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundImageStyleUndefined: Self = StObject.set(x, "backgroundImageStyle", js.undefined)
    
    @scala.inline
    def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    @scala.inline
    def setBackgroundImageVarargs(value: ImageURISource*): Self = StObject.set(x, "backgroundImage", js.Array(value :_*))
    
    @scala.inline
    def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setCenterComponent(value: HeaderSubComponent): Self = StObject.set(x, "centerComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterComponentUndefined: Self = StObject.set(x, "centerComponent", js.undefined)
    
    @scala.inline
    def setCenterContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "centerContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterContainerStyleNull: Self = StObject.set(x, "centerContainerStyle", null)
    
    @scala.inline
    def setCenterContainerStyleUndefined: Self = StObject.set(x, "centerContainerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setLeftComponent(value: HeaderSubComponent): Self = StObject.set(x, "leftComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftComponentUndefined: Self = StObject.set(x, "leftComponent", js.undefined)
    
    @scala.inline
    def setLeftContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "leftContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftContainerStyleNull: Self = StObject.set(x, "leftContainerStyle", null)
    
    @scala.inline
    def setLeftContainerStyleUndefined: Self = StObject.set(x, "leftContainerStyle", js.undefined)
    
    @scala.inline
    def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
    @scala.inline
    def setPlacement(value: left | center | right): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setRightComponent(value: HeaderSubComponent): Self = StObject.set(x, "rightComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightComponentUndefined: Self = StObject.set(x, "rightComponent", js.undefined)
    
    @scala.inline
    def setRightContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightContainerStyleNull: Self = StObject.set(x, "rightContainerStyle", null)
    
    @scala.inline
    def setRightContainerStyleUndefined: Self = StObject.set(x, "rightContainerStyle", js.undefined)
    
    @scala.inline
    def setStatusBarProps(value: StatusBarProperties): Self = StObject.set(x, "statusBarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarPropsUndefined: Self = StObject.set(x, "statusBarProps", js.undefined)
    
    @scala.inline
    def setViewComponent(value: ComponentClass[_, ComponentState]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
