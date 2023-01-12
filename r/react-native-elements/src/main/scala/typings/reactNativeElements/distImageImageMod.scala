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
  
  @JSImport("react-native-elements/dist/image/Image", "Image")
  @js.native
  open class Image protected () extends Component[ImagePropsPartialThemePro, ImageState, Any] {
    def this(props: ImagePropsPartialThemePro) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImagePropsPartialThemePro, context: Any) = this()
    
    def onLoad(e: Any): Unit = js.native
    
    @JSName("state")
    var state_Image: PlaceholderOpacity = js.native
  }
  object Image {
    
    @JSImport("react-native-elements/dist/image/Image", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof ImageNative.abortPrefetch` */
    @JSImport("react-native-elements/dist/image/Image", "Image.abortPrefetch")
    @js.native
    def abortPrefetch: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.abortPrefetch */ Any = js.native
    inline def abortPrefetch_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.abortPrefetch */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abortPrefetch")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof ImageNative.getSize` */
    @JSImport("react-native-elements/dist/image/Image", "Image.getSize")
    @js.native
    def getSize: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.getSize */ Any = js.native
    
    /* static member */
    /* was `typeof ImageNative.getSizeWithHeaders` */
    @JSImport("react-native-elements/dist/image/Image", "Image.getSizeWithHeaders")
    @js.native
    def getSizeWithHeaders: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.getSizeWithHeaders */ Any = js.native
    inline def getSizeWithHeaders_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.getSizeWithHeaders */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSizeWithHeaders")(x.asInstanceOf[js.Any])
    
    inline def getSize_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.getSize */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSize")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof ImageNative.prefetch` */
    @JSImport("react-native-elements/dist/image/Image", "Image.prefetch")
    @js.native
    def prefetch: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.prefetch */ Any = js.native
    inline def prefetch_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.prefetch */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefetch")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof ImageNative.queryCache` */
    @JSImport("react-native-elements/dist/image/Image", "Image.queryCache")
    @js.native
    def queryCache: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.queryCache */ Any = js.native
    inline def queryCache_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.queryCache */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryCache")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof ImageNative.resolveAssetSource` */
    @JSImport("react-native-elements/dist/image/Image", "Image.resolveAssetSource")
    @js.native
    def resolveAssetSource: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.resolveAssetSource */ Any = js.native
    inline def resolveAssetSource_=(
      x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof ImageNative.resolveAssetSource */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolveAssetSource")(x.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageState] (val x: Self) extends AnyVal {
      
      inline def setPlaceholderOpacity(value: Value): Self = StObject.set(x, "placeholderOpacity", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions]
  
  /* This means you don't have to write `default`, but can instead just say `distImageImageMod.foo` */
  override def _to: FunctionComponent[PickImagePropsComponentco] | ForwardRefExoticComponent[ImagePropsComponentcontexAccessibilityActions] = default
}
