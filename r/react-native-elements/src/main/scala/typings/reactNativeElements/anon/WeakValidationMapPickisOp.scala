package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.Validator
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ActivityIndicatorProps
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.iconMod.IconNode
import typings.reactNativeElements.reactNativeElementsStrings.TouchableComponent
import typings.reactNativeElements.reactNativeElementsStrings.ViewComponent
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.bottom
import typings.reactNativeElements.reactNativeElementsStrings.clear
import typings.reactNativeElements.reactNativeElementsStrings.large
import typings.reactNativeElements.reactNativeElementsStrings.left
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.outline
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.right
import typings.reactNativeElements.reactNativeElementsStrings.small
import typings.reactNativeElements.reactNativeElementsStrings.solid
import typings.reactNativeElements.reactNativeElementsStrings.top
import typings.reactNativeElements.reactNativeElementsStrings.yes
import typings.reactNativeElements.textMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<std.Pick<{  isOpen :boolean, onOpen (): void, onClose (): void,   openIcon :react-native-elements.react-native-elements/dist/icons/Icon.IconNode | undefined,   overlayColor :string | undefined,   children :std.Array<react.react.ReactChild> | undefined,   transitionDuration :number | undefined,   title :string | react.react.ReactElement | undefined,   titleStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   titleProps :react-native-elements.react-native-elements.TextProps | undefined,   buttonStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   type :'solid' | 'clear' | 'outline' | undefined,   loading :boolean | undefined,   loadingStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   loadingProps :react-native.react-native.ActivityIndicatorProps | undefined,   containerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   icon :react-native-elements.react-native-elements/dist/icons/Icon.IconNode | undefined,   iconContainerStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   iconRight :boolean | undefined,   linearGradientProps :object | undefined,   TouchableComponent :{  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> | undefined,   ViewComponent :{  contextType :react.react.Context<any> | undefined} & new <P = {}, S = {}, SS = any>(props : std.Readonly</ * import warning: RewrittenClass.unapply cls was tparam P * / any>): react.react.Component<P, S, SS> | undefined,   disabled :boolean | undefined,   disabledStyle :react-native.react-native.StyleProp<react-native.react-native.ViewStyle> | undefined,   disabledTitleStyle :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   raised :boolean | undefined,   iconPosition :'bottom' | 'left' | 'right' | 'top' | undefined,   color :string | undefined,   size :'small' | 'large' | undefined,   placement :'left' | 'right' | undefined,   visible :boolean | undefined,   upperCase :boolean | undefined} & react-native.react-native.TouchableOpacityProps & react-native.react-native.TouchableNativeFeedbackProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/buttons/SpeedDial.SpeedDialProps>>, 'style' | 'onLayout' | 'testID' | 'accessible' | 'accessibilityActions' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityState' | 'accessibilityHint' | 'accessibilityValue' | 'onAccessibilityAction' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityViewIsModal' | 'onAccessibilityEscape' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors' | 'visible' | 'raised' | 'disabled' | 'color' | 'size' | 'onPress' | 'onLongPress' | 'activeOpacity' | 'delayLongPress' | 'delayPressIn' | 'delayPressOut' | 'hitSlop' | 'onBlur' | 'onFocus' | 'onPressIn' | 'onPressOut' | 'pressRetentionOffset' | 'hasTVPreferredFocus' | 'tvParallaxProperties' | 'touchSoundDisabled' | 'background' | 'useForeground' | 'type' | 'containerStyle' | 'disabledStyle' | 'children' | 'title' | 'transitionDuration' | 'overlayColor' | 'icon' | 'titleStyle' | 'loading' | 'titleProps' | 'buttonStyle' | 'loadingStyle' | 'loadingProps' | 'iconContainerStyle' | 'iconRight' | 'linearGradientProps' | 'TouchableComponent' | 'ViewComponent' | 'disabledTitleStyle' | 'iconPosition' | 'placement' | 'onOpen' | 'onClose' | 'upperCase' | 'isOpen' | 'openIcon'>> */
trait WeakValidationMapPickisOp extends StObject {
  
  var TouchableComponent: js.UndefOr[
    Validator[
      js.UndefOr[
        (TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[
            typings.reactNativeElements.reactNativeElementsStrings.TouchableComponent, 
            js.Object, 
            js.Object
          ]
        ])) | Null
      ]
    ]
  ] = js.undefined
  
  var ViewComponent: js.UndefOr[
    Validator[
      js.UndefOr[
        (TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[
            typings.reactNativeElements.reactNativeElementsStrings.ViewComponent, 
            js.Object, 
            js.Object
          ]
        ])) | Null
      ]
    ]
  ] = js.undefined
  
  var accessibilityActions: js.UndefOr[Validator[js.UndefOr[js.Array[AccessibilityActionInfo] | Null]]] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive | Null]]] = js.undefined
  
  var accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole | Null]]] = js.undefined
  
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState | Null]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue | Null]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var activeOpacity: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var background: js.UndefOr[Validator[js.UndefOr[BackgroundPropType | Null]]] = js.undefined
  
  var buttonStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var children: js.UndefOr[Validator[js.UndefOr[js.Array[ReactChild] | Null]]] = js.undefined
  
  var color: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var containerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var delayLongPress: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var delayPressIn: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var delayPressOut: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var disabledStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var disabledTitleStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[TextStyle]]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets | Null]]] = js.undefined
  
  var icon: js.UndefOr[Validator[js.UndefOr[IconNode | Null]]] = js.undefined
  
  var iconContainerStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var iconPosition: js.UndefOr[Validator[js.UndefOr[bottom | left | right | top | Null]]] = js.undefined
  
  var iconRight: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants` | Null]]] = js.undefined
  
  var isOpen: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var linearGradientProps: js.UndefOr[Validator[js.UndefOr[Null | js.Object]]] = js.undefined
  
  var loading: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var loadingProps: js.UndefOr[Validator[js.UndefOr[ActivityIndicatorProps | Null]]] = js.undefined
  
  var loadingStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ AccessibilityActionEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onBlur: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]) | Null]
    ]
  ] = js.undefined
  
  var onClose: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onFocus: js.UndefOr[
    Validator[
      js.UndefOr[(js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]) | Null]
    ]
  ] = js.undefined
  
  var onLayout: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ LayoutChangeEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onLongPress: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onOpen: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onPress: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onPressIn: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onPressOut: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var openIcon: js.UndefOr[Validator[js.UndefOr[IconNode | Null]]] = js.undefined
  
  var overlayColor: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var placement: js.UndefOr[Validator[js.UndefOr[left | right | Null]]] = js.undefined
  
  var pressRetentionOffset: js.UndefOr[Validator[js.UndefOr[Insets | Null]]] = js.undefined
  
  var raised: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var size: js.UndefOr[Validator[js.UndefOr[small | large | Null]]] = js.undefined
  
  var style: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var testID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | ReactElement | String]]] = js.undefined
  
  var titleProps: js.UndefOr[Validator[js.UndefOr[Null | TextProps]]] = js.undefined
  
  var titleStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[TextStyle]]]] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var transitionDuration: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[Null | TVParallaxProperties]]] = js.undefined
  
  var `type`: js.UndefOr[Validator[js.UndefOr[solid | clear | outline | Null]]] = js.undefined
  
  var upperCase: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var useForeground: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapPickisOp {
  
  inline def apply(): WeakValidationMapPickisOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickisOp]
  }
  
  extension [Self <: WeakValidationMapPickisOp](x: Self) {
    
    inline def setAccessibilityActions(value: Validator[js.UndefOr[js.Array[AccessibilityActionInfo] | Null]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityElementsHidden(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: Validator[js.UndefOr[none | polite | assertive | Null]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: Validator[js.UndefOr[AccessibilityRole | Null]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: Validator[js.UndefOr[AccessibilityState | Null]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(value: Validator[js.UndefOr[AccessibilityValue | Null]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setActiveOpacity(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setBackground(value: Validator[js.UndefOr[BackgroundPropType | Null]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setButtonStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
    
    inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
    
    inline def setChildren(value: Validator[js.UndefOr[js.Array[ReactChild] | Null]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDelayLongPress(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setDisabledTitleStyle(value: Validator[js.UndefOr[Null | StyleProp[TextStyle]]]): Self = StObject.set(x, "disabledTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledTitleStyleUndefined: Self = StObject.set(x, "disabledTitleStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Validator[js.UndefOr[Insets | Null]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setIcon(value: Validator[js.UndefOr[IconNode | Null]]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
    
    inline def setIconPosition(value: Validator[js.UndefOr[bottom | left | right | top | Null]]): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
    
    inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
    
    inline def setIconRight(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "iconRight", value.asInstanceOf[js.Any])
    
    inline def setIconRightUndefined: Self = StObject.set(x, "iconRight", js.undefined)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImportantForAccessibility(value: Validator[js.UndefOr[auto | yes | no | `no-hide-descendants` | Null]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIsOpen(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setLinearGradientProps(value: Validator[js.UndefOr[Null | js.Object]]): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
    inline def setLoading(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingProps(value: Validator[js.UndefOr[ActivityIndicatorProps | Null]]): Self = StObject.set(x, "loadingProps", value.asInstanceOf[js.Any])
    
    inline def setLoadingPropsUndefined: Self = StObject.set(x, "loadingProps", js.undefined)
    
    inline def setLoadingStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "loadingStyle", value.asInstanceOf[js.Any])
    
    inline def setLoadingStyleUndefined: Self = StObject.set(x, "loadingStyle", js.undefined)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setOnAccessibilityAction(value: Validator[js.UndefOr[(js.Function1[/* event */ AccessibilityActionEvent, Unit]) | Null]]): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBlur(
      value: Validator[
          js.UndefOr[(js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]) | Null]
        ]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClose(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnFocus(
      value: Validator[
          js.UndefOr[(js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]) | Null]
        ]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnLayout(value: Validator[js.UndefOr[(js.Function1[/* event */ LayoutChangeEvent, Unit]) | Null]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnOpen(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOnPress(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressIn(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressOut(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onPressOut", value.asInstanceOf[js.Any])
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOpenIcon(value: Validator[js.UndefOr[IconNode | Null]]): Self = StObject.set(x, "openIcon", value.asInstanceOf[js.Any])
    
    inline def setOpenIconUndefined: Self = StObject.set(x, "openIcon", js.undefined)
    
    inline def setOverlayColor(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    inline def setPlacement(value: Validator[js.UndefOr[left | right | Null]]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPressRetentionOffset(value: Validator[js.UndefOr[Insets | Null]]): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    inline def setRaised(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    inline def setSize(value: Validator[js.UndefOr[small | large | Null]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTitle(value: Validator[js.UndefOr[Null | ReactElement | String]]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleProps(value: Validator[js.UndefOr[Null | TextProps]]): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    inline def setTitleStyle(value: Validator[js.UndefOr[Null | StyleProp[TextStyle]]]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTouchSoundDisabled(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    inline def setTouchableComponent(
      value: Validator[
          js.UndefOr[
            (TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[TouchableComponent, js.Object, js.Object]
            ])) | Null
          ]
        ]
    ): Self = StObject.set(x, "TouchableComponent", value.asInstanceOf[js.Any])
    
    inline def setTouchableComponentUndefined: Self = StObject.set(x, "TouchableComponent", js.undefined)
    
    inline def setTransitionDuration(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    inline def setTvParallaxProperties(value: Validator[js.UndefOr[Null | TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setType(value: Validator[js.UndefOr[solid | clear | outline | Null]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpperCase(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "upperCase", value.asInstanceOf[js.Any])
    
    inline def setUpperCaseUndefined: Self = StObject.set(x, "upperCase", js.undefined)
    
    inline def setUseForeground(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    inline def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
    
    inline def setViewComponent(
      value: Validator[
          js.UndefOr[
            (TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[ViewComponent, js.Object, js.Object]
            ])) | Null
          ]
        ]
    ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    
    inline def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
