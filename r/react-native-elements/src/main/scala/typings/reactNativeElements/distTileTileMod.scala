package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialImagePropsAccessibilityActions
import typings.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityActions
import typings.reactNativeElements.anon.TouchableOpacityPropsTouc
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.distIconsIconMod.IconObject
import typings.reactNativeElements.distIconsIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileTileMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tile/Tile", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = js.native
  
  @JSImport("react-native-elements/dist/tile/Tile", "Tile")
  @js.native
  val Tile: RneFunctionComponent[TileProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
  - typings.reactNative.mod.TVProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
  - typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, nextFocusDown, nextFocusForward, nextFocusLeft, nextFocusRight, nextFocusUp, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, touchSoundDisabled. Inlined useForeground, background */ trait TileProps
    extends StObject
       with TouchableOpacityProps {
    
    var ImageComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    /**
      * Determines the type of background drawable that's going to be used to display feedback.
      * It takes an object with type property and extra data depending on the type.
      * It's recommended to use one of the following static methods to generate that dictionary:
      *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
      *         default background for selectable elements (?android:attr/selectableItemBackground)
      *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
      *         theme's default background for borderless selectable elements
      *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
      *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
      *         with specified color (as a string). If property borderless evaluates to true the ripple will render
      *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
      *         type is available on Android API level 21+
      */
    var background: js.UndefOr[BackgroundPropType] = js.undefined
    
    var caption: js.UndefOr[ReactNode] = js.undefined
    
    var captionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var featured: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[IconObject & IconProps] = js.undefined
    
    var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var imageContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var imageProps: js.UndefOr[PartialImagePropsAccessibilityActions] = js.undefined
    
    var imageSrc: js.UndefOr[ImageSourcePropType | String | Double] = js.undefined
    
    var overlayContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleNumberOfLines: js.UndefOr[Double] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var useForeground: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object TileProps {
    
    inline def apply(): TileProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileProps] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCaption(value: ReactNode): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "captionStyle", value.asInstanceOf[js.Any])
      
      inline def setCaptionStyleNull: Self = StObject.set(x, "captionStyle", null)
      
      inline def setCaptionStyleUndefined: Self = StObject.set(x, "captionStyle", js.undefined)
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
      
      inline def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: IconObject & IconProps): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
      
      inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImageComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ImageComponent", value.asInstanceOf[js.Any])
      
      inline def setImageComponentUndefined: Self = StObject.set(x, "ImageComponent", js.undefined)
      
      inline def setImageContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "imageContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setImageContainerStyleNull: Self = StObject.set(x, "imageContainerStyle", null)
      
      inline def setImageContainerStyleUndefined: Self = StObject.set(x, "imageContainerStyle", js.undefined)
      
      inline def setImageProps(value: PartialImagePropsAccessibilityActions): Self = StObject.set(x, "imageProps", value.asInstanceOf[js.Any])
      
      inline def setImagePropsUndefined: Self = StObject.set(x, "imageProps", js.undefined)
      
      inline def setImageSrc(value: ImageSourcePropType | String | Double): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      inline def setImageSrcVarargs(value: ImageURISource*): Self = StObject.set(x, "imageSrc", js.Array(value*))
      
      inline def setOverlayContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerStyleNull: Self = StObject.set(x, "overlayContainerStyle", null)
      
      inline def setOverlayContainerStyleUndefined: Self = StObject.set(x, "overlayContainerStyle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
      
      inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc]
  
  /* This means you don't have to write `default`, but can instead just say `distTileTileMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = default
}
