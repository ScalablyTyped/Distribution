package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.ImagePropsComponentcontexAccessibilityActions
import typings.reactNativeElements.anon.ImagePropsPartialThemePro
import typings.reactNativeElements.anon.PickImagePropsComponentco
import typings.reactNativeElements.anon.PlaceholderOpacity
import typings.reactNativeElements.anon.TypeofComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImageImageMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/image/Image", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions] = js.native
  
  @js.native
  trait Image extends Component[ImagePropsPartialThemePro, ImageState, Any] {
    
    def onLoad(e: Any): Unit = js.native
    
    @JSName("state")
    var state_Image: PlaceholderOpacity = js.native
  }
  
  trait ImageProps
    extends StObject
       with typings.reactNative.mod.ImageProps {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var ImageComponent: js.UndefOr[ComponentType[Any]] = js.undefined
    
    var PlaceholderContent: js.UndefOr[ReactElement] = js.undefined
    
    var childrenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placeholderStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var transition: js.UndefOr[Boolean] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ImageProps {
    
    inline def apply(): ImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageProps]
    }
    
    extension [Self <: ImageProps](x: Self) {
      
      inline def setChildrenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "childrenContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setChildrenContainerStyleNull: Self = StObject.set(x, "childrenContainerStyle", null)
      
      inline def setChildrenContainerStyleUndefined: Self = StObject.set(x, "childrenContainerStyle", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setImageComponent(value: ComponentType[Any]): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
      
      inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setPlaceholderContent(value: ReactElement): Self = StObject.set(x, "PlaceholderContent", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderContentUndefined: Self = StObject.set(x, "PlaceholderContent", js.undefined)
      
      inline def setPlaceholderStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "placeholderStyle", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderStyleNull: Self = StObject.set(x, "placeholderStyle", null)
      
      inline def setPlaceholderStyleUndefined: Self = StObject.set(x, "placeholderStyle", js.undefined)
      
      inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait ImageState extends StObject {
    
    var placeholderOpacity: Value
  }
  object ImageState {
    
    inline def apply(placeholderOpacity: Value): ImageState = {
      val __obj = js.Dynamic.literal(placeholderOpacity = placeholderOpacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageState]
    }
    
    extension [Self <: ImageState](x: Self) {
      
      inline def setPlaceholderOpacity(value: Value): Self = StObject.set(x, "placeholderOpacity", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distImageImageMod.foo` */
  override def _to: FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions] = default
}
