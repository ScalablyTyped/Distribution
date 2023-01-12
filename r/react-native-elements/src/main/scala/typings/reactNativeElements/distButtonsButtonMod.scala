package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reactNative.mod.ActivityIndicatorProps
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableOpacityProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PickButtonPropsstyleonLay
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.distHelpersMod.RneFunctionComponent
import typings.reactNativeElements.distIconsIconMod.IconNode
import typings.reactNativeElements.distTextTextMod.TextProps
import typings.reactNativeElements.reactNativeElementsStrings.bottom
import typings.reactNativeElements.reactNativeElementsStrings.clear
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.outline
import typings.reactNativeElements.reactNativeElementsStrings.right
import typings.reactNativeElements.reactNativeElementsStrings.solid
import typings.reactNativeElements.reactNativeElementsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonsButtonMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/buttons/Button", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps] = js.native
  
  @JSImport("react-native-elements/dist/buttons/Button", "Button")
  @js.native
  val Button: RneFunctionComponent[ButtonProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNative.mod.AccessibilityPropsIOS because Already inherited
  - typings.reactNative.mod.AccessibilityPropsAndroid because Already inherited
  - typings.reactNative.mod.AccessibilityProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackPropsAndroid because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackPropsIOS because Already inherited
  - typings.reactNative.mod.TVProps because Already inherited
  - typings.reactNative.mod.TouchableWithoutFeedbackProps because Already inherited
  - typings.reactNative.mod.TouchableNativeFeedbackProps because var conflicts: accessibilityActions, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLabelledBy, accessibilityLanguage, accessibilityLiveRegion, accessibilityRole, accessibilityState, accessibilityValue, accessibilityViewIsModal, accessible, children, delayLongPress, delayPressIn, delayPressOut, disabled, hasTVPreferredFocus, hitSlop, importantForAccessibility, nextFocusDown, nextFocusForward, nextFocusLeft, nextFocusRight, nextFocusUp, onAccessibilityAction, onAccessibilityEscape, onAccessibilityTap, onBlur, onFocus, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID, touchSoundDisabled. Inlined useForeground, background */ trait ButtonProps
    extends StObject
       with TouchableOpacityProps {
    
    var TouchableComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var ViewComponent: js.UndefOr[
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
    
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var disabledTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var icon: js.UndefOr[IconNode] = js.undefined
    
    var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var iconPosition: js.UndefOr[left | right | top | bottom] = js.undefined
    
    var iconRight: js.UndefOr[Boolean] = js.undefined
    
    var linearGradientProps: js.UndefOr[js.Object] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var loadingProps: js.UndefOr[ActivityIndicatorProps] = js.undefined
    
    var loadingStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var raised: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | ReactElement] = js.undefined
    
    var titleProps: js.UndefOr[TextProps] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var `type`: js.UndefOr[solid | clear | outline] = js.undefined
    
    var useForeground: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setDisabledTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "disabledTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledTitleStyleNull: Self = StObject.set(x, "disabledTitleStyle", null)
      
      inline def setDisabledTitleStyleUndefined: Self = StObject.set(x, "disabledTitleStyle", js.undefined)
      
      inline def setIcon(value: IconNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
      
      inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
      
      inline def setIconPosition(value: left | right | top | bottom): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
      
      inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
      
      inline def setIconRight(value: Boolean): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
      
      inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLinearGradientProps(value: js.Object): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
      
      inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingProps(value: ActivityIndicatorProps): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
      
      inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
      
      inline def setLoadingStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
      
      inline def setLoadingStyleNull: Self = StObject.set(x, "loadingStyle", null)
      
      inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: TextProps): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTouchableComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
      
      inline def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
      
      inline def setType(value: solid | clear | outline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
      
      inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
      
      inline def setViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
      
      inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `distButtonsButtonMod.foo` */
  override def _to: FunctionComponent[PickButtonPropsstyleonLay] | ForwardRefExoticComponent[ButtonProps] = default
}
