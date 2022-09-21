package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.reactNativeElementsStrings.ModalComponent
import typings.reactNativeElements.reactNativeElementsStrings.`box-none`
import typings.reactNativeElements.reactNativeElementsStrings.`box-only`
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-left`
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-right`
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.`portrait-upside-down`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.fade
import typings.reactNativeElements.reactNativeElementsStrings.formSheet
import typings.reactNativeElements.reactNativeElementsStrings.fullScreen
import typings.reactNativeElements.reactNativeElementsStrings.landscape
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.overFullScreen
import typings.reactNativeElements.reactNativeElementsStrings.pageSheet
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.portrait
import typings.reactNativeElements.reactNativeElementsStrings.slide
import typings.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<react-native-elements.react-native-elements/dist/dialog/Dialog.DialogProps> */
trait WeakValidationMapDialogPr extends StObject {
  
  var ModalComponent: js.UndefOr[
    Validator[
      js.UndefOr[
        (TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[
            typings.reactNativeElements.reactNativeElementsStrings.ModalComponent, 
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
  
  var accessibilityLabelledBy: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null | String]]] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[Validator[js.UndefOr[none | polite | assertive | Null]]] = js.undefined
  
  var accessibilityRole: js.UndefOr[Validator[js.UndefOr[AccessibilityRole | Null]]] = js.undefined
  
  var accessibilityState: js.UndefOr[Validator[js.UndefOr[AccessibilityState | Null]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[Validator[js.UndefOr[AccessibilityValue | Null]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var accessible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var animated: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var animationType: js.UndefOr[Validator[js.UndefOr[none | slide | fade | Null]]] = js.undefined
  
  var backdropStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  
  var collapsable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var focusable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var hardwareAccelerated: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var hitSlop: js.UndefOr[Validator[js.UndefOr[Insets | Null]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[Validator[js.UndefOr[auto | yes | no | `no-hide-descendants` | Null]]] = js.undefined
  
  var isTVSelectable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var isVisible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var nativeID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ AccessibilityActionEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onBackdropPress: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onDismiss: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onLayout: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ LayoutChangeEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[Validator[js.UndefOr[js.Function0[Unit] | Null]]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]
  ] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]
  ] = js.undefined
  
  var onOrientationChange: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]
  ] = js.undefined
  
  var onPointerCancel: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerCancelCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerDown: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerDownCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerEnter: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerEnterCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerLeave: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerLeaveCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerMove: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerMoveCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerUp: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onPointerUpCapture: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]] = js.undefined
  
  var onRequestClose: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]
  ] = js.undefined
  
  var onResponderEnd: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderGrant: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderMove: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderReject: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderRelease: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderStart: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderTerminate: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]
  ] = js.undefined
  
  var onShow: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]
  ] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]
  ] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]
  ] = js.undefined
  
  var onTouchCancel: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onTouchEnd: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onTouchMove: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var onTouchStart: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]
  ] = js.undefined
  
  var overlayStyle: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var pointerEvents: js.UndefOr[Validator[js.UndefOr[`box-none` | none | `box-only` | auto | Null]]] = js.undefined
  
  var presentationStyle: js.UndefOr[
    Validator[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen | Null]]
  ] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var statusBarTranslucent: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var style: js.UndefOr[Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]] = js.undefined
  
  var supportedOrientations: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]) | Null
      ]
    ]
  ] = js.undefined
  
  var testID: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var theme: js.UndefOr[Validator[js.UndefOr[Null | ThemeAvatar]]] = js.undefined
  
  var transparent: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[Validator[js.UndefOr[Null | TVParallaxProperties]]] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapDialogPr {
  
  inline def apply(): WeakValidationMapDialogPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapDialogPr]
  }
  
  extension [Self <: WeakValidationMapDialogPr](x: Self) {
    
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
    
    inline def setAccessibilityLabelledBy(value: Validator[js.UndefOr[js.Array[String] | Null | String]]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLanguage(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
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
    
    inline def setAnimated(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationType(value: Validator[js.UndefOr[none | slide | fade | Null]]): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setBackdropStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "backdropStyle", value.asInstanceOf[js.Any])
    
    inline def setBackdropStyleUndefined: Self = StObject.set(x, "backdropStyle", js.undefined)
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCollapsable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setFocusable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHardwareAccelerated(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hardwareAccelerated", value.asInstanceOf[js.Any])
    
    inline def setHardwareAcceleratedUndefined: Self = StObject.set(x, "hardwareAccelerated", js.undefined)
    
    inline def setHasTVPreferredFocus(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: Validator[js.UndefOr[Insets | Null]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(value: Validator[js.UndefOr[auto | yes | no | `no-hide-descendants` | Null]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setIsTVSelectable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setIsVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalComponent(
      value: Validator[
          js.UndefOr[
            (TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[ModalComponent, js.Object, js.Object]
            ])) | Null
          ]
        ]
    ): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    inline def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    inline def setNativeID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setOnAccessibilityAction(value: Validator[js.UndefOr[(js.Function1[/* event */ AccessibilityActionEvent, Unit]) | Null]]): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBackdropPress(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onBackdropPress", value.asInstanceOf[js.Any])
    
    inline def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
    
    inline def setOnDismiss(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
    
    inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
    
    inline def setOnLayout(value: Validator[js.UndefOr[(js.Function1[/* event */ LayoutChangeEvent, Unit]) | Null]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: Validator[js.UndefOr[js.Function0[Unit] | Null]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnOrientationChange(value: Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]): Self = StObject.set(x, "onOrientationChange", value.asInstanceOf[js.Any])
    
    inline def setOnOrientationChangeUndefined: Self = StObject.set(x, "onOrientationChange", js.undefined)
    
    inline def setOnPointerCancel(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerCancel", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
    
    inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
    
    inline def setOnPointerDown(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerDown", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerDownCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
    
    inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
    
    inline def setOnPointerEnter(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerEnter", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
    
    inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
    
    inline def setOnPointerLeave(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerLeave", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
    
    inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
    
    inline def setOnPointerMove(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerMove", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
    
    inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
    
    inline def setOnPointerUp(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerUp", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ PointerEvent, Unit]) | Null]]): Self = StObject.set(x, "onPointerUpCapture", value.asInstanceOf[js.Any])
    
    inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
    
    inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
    
    inline def setOnRequestClose(value: Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]): Self = StObject.set(x, "onRequestClose", value.asInstanceOf[js.Any])
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOnResponderEnd(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnShow(value: Validator[js.UndefOr[(js.Function1[/* event */ NativeSyntheticEvent[Any], Unit]) | Null]]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Boolean]) | Null]]): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnTouchCancel(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCapture(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: Validator[js.UndefOr[(js.Function1[/* event */ GestureResponderEvent, Unit]) | Null]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setOverlayStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setPointerEvents(value: Validator[js.UndefOr[`box-none` | none | `box-only` | auto | Null]]): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setPresentationStyle(value: Validator[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen | Null]]): Self = StObject.set(x, "presentationStyle", value.asInstanceOf[js.Any])
    
    inline def setPresentationStyleUndefined: Self = StObject.set(x, "presentationStyle", js.undefined)
    
    inline def setRemoveClippedSubviews(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setShouldRasterizeIOS(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setStatusBarTranslucent(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "statusBarTranslucent", value.asInstanceOf[js.Any])
    
    inline def setStatusBarTranslucentUndefined: Self = StObject.set(x, "statusBarTranslucent", js.undefined)
    
    inline def setStyle(value: Validator[js.UndefOr[Null | StyleProp[ViewStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSupportedOrientations(
      value: Validator[
          js.UndefOr[
            (js.Array[
              portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
            ]) | Null
          ]
        ]
    ): Self = StObject.set(x, "supportedOrientations", value.asInstanceOf[js.Any])
    
    inline def setSupportedOrientationsUndefined: Self = StObject.set(x, "supportedOrientations", js.undefined)
    
    inline def setTestID(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[Null | ThemeAvatar]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTransparent(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setTvParallaxMagnification(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: Validator[js.UndefOr[Null | TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
