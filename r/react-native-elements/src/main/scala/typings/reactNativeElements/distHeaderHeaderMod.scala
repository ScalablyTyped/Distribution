package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StatusBarProps
import typings.reactNative.mod.StatusBarStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PickHeaderPropsstyleonLay
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.distIconsIconMod.IconObject
import typings.reactNativeElements.reactNativeElementsStrings.center
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHeaderHeaderMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/header/Header", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickHeaderPropsstyleonLay] | ForwardRefExoticComponent[HeaderProps] = js.native
  
  @JSImport("react-native-elements/dist/header/Header", "Header")
  @js.native
  val Header: RneFunctionComponent[HeaderProps] = js.native
  
  trait HeaderIcon
    extends StObject
       with IconObject {
    
    var icon: js.UndefOr[String] = js.undefined
    
    @JSName("style")
    var style_HeaderIcon: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object HeaderIcon {
    
    inline def apply(): HeaderIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderIcon]
    }
    
    extension [Self <: HeaderIcon](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait HeaderProps
    extends StObject
       with ViewProps {
    
    var ViewComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundImage: js.UndefOr[ImageSourcePropType] = js.undefined
    
    var backgroundImageStyle: js.UndefOr[ImageStyle] = js.undefined
    
    var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
    
    var centerComponent: js.UndefOr[HeaderSubComponent] = js.undefined
    
    var centerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    @JSName("children")
    var children_HeaderProps: js.UndefOr[js.Array[Element]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var elevated: js.UndefOr[Boolean] = js.undefined
    
    var leftComponent: js.UndefOr[HeaderSubComponent] = js.undefined
    
    var leftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var linearGradientProps: js.UndefOr[js.Object] = js.undefined
    
    var placement: js.UndefOr[left | center | right] = js.undefined
    
    var rightComponent: js.UndefOr[HeaderSubComponent] = js.undefined
    
    var rightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var statusBarProps: js.UndefOr[StatusBarProps] = js.undefined
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
      
      inline def setBackgroundImageVarargs(value: ImageURISource*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
      
      inline def setBarStyle(value: StatusBarStyle): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setCenterComponent(value: HeaderSubComponent): Self = StObject.set(x, "centerComponent", value.asInstanceOf[js.Any])
      
      inline def setCenterComponentUndefined: Self = StObject.set(x, "centerComponent", js.undefined)
      
      inline def setCenterContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "centerContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setCenterContainerStyleNull: Self = StObject.set(x, "centerContainerStyle", null)
      
      inline def setCenterContainerStyleUndefined: Self = StObject.set(x, "centerContainerStyle", js.undefined)
      
      inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setElevated(value: Boolean): Self = StObject.set(x, "elevated", value.asInstanceOf[js.Any])
      
      inline def setElevatedUndefined: Self = StObject.set(x, "elevated", js.undefined)
      
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
      
      inline def setStatusBarProps(value: StatusBarProps): Self = StObject.set(x, "statusBarProps", value.asInstanceOf[js.Any])
      
      inline def setStatusBarPropsUndefined: Self = StObject.set(x, "statusBarProps", js.undefined)
      
      inline def setViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
      
      inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    }
  }
  
  type HeaderSubComponent = ReactElement | TextProps | HeaderIcon
  
  type _To = FunctionComponent[PickHeaderPropsstyleonLay] | ForwardRefExoticComponent[HeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `distHeaderHeaderMod.foo` */
  override def _to: FunctionComponent[PickHeaderPropsstyleonLay] | ForwardRefExoticComponent[HeaderProps] = default
}
