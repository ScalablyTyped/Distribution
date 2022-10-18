package typings.reactNativeElements

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.Duration
import typings.reactNativeElements.anon.PickcontainerStyleStylePr
import typings.reactNativeElements.anon.TypeofComponent
import typings.reactNativeElements.anon.containerStyleStylePropViAccessibilityElementsHidden
import typings.reactNativeElements.distIconsIconMod.IconNode
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemAccordionMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemAccordion", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickcontainerStyleStylePr] | ForwardRefExoticComponent[containerStyleStylePropViAccessibilityElementsHidden] = js.native
  
  /* Inlined react-native-elements.react-native-elements/dist/list/ListItemBase.ListItemProps & {  isExpanded :boolean | undefined,   icon :react-native-elements.react-native-elements/dist/icons/Icon.IconNode | undefined,   expandIcon :react-native-elements.react-native-elements/dist/icons/Icon.IconNode | undefined,   content :react.react.ReactNode | undefined,   noRotation :boolean | undefined,   noIcon :boolean | undefined,   animation :{  type :'timing' | 'spring' | undefined,   duration :number | undefined} | boolean | undefined} */
  trait ListItemAccordionProps extends StObject {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          typings.react.mod.Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    var ViewComponent: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
      ] = js.undefined
    
    /**
      * Provides an array of custom actions available for accessibility.
      */
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    /**
      * A Boolean value indicating whether the accessibility elements contained within this accessibility element
      * are hidden to the screen reader.
      * @platform ios
      */
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
      */
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    /**
      * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
      * @platform ios
      */
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
      * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
      * @platform android
      */
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Indicates to the accessibility services that the UI component is in
      * a specific language. The provided string should be formatted following
      * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
      * @platform ios
      */
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates to accessibility services whether the user should be notified when this view changes.
      * Works for Android API >= 19 only.
      * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
      * @platform android
      */
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    /**
      * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
      */
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    /**
      * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
      */
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    /**
      * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
      * it contains range information (minimum, current, and maximum).
      */
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    /**
      * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
      * @platform ios
      */
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, indicates that the view is an accessibility element.
      * By default, all the touchable elements are accessible.
      */
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines what the opacity of the wrapped view should be when touch is active.
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    var animation: js.UndefOr[Duration | Boolean] = js.undefined
    
    var bottomDivider: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Delay in ms, from onPressIn, before onLongPress is called.
      */
    var delayLongPress: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called.
      */
    var delayPressIn: js.UndefOr[Double] = js.undefined
    
    /**
      * Delay in ms, from the release of the touch, before onPressOut is called.
      */
    var delayPressOut: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, disable all interactions for this component.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var expandIcon: js.UndefOr[IconNode] = js.undefined
    
    /**
      * This defines how far your touch can start away from the button.
      * This is added to pressRetentionOffset when moving off of the button.
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch hits
      * two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    var icon: js.UndefOr[IconNode] = js.undefined
    
    /**
      * Controls how view is important for accessibility which is if it fires accessibility events
      * and if it is reported to accessibility services that query the screen.
      * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
      *
      * Possible values:
      *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
      *      'yes' - The view is important for accessibility.
      *      'no' - The view is not important for accessibility.
      *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
      */
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    var isExpanded: js.UndefOr[Boolean] = js.undefined
    
    var linearGradientProps: js.UndefOr[Any] = js.undefined
    
    var noIcon: js.UndefOr[Boolean] = js.undefined
    
    var noRotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
      */
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    /**
      * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
      * @platform ios
      */
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
      * @platform ios
      */
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "blur" occurs, meaning the element lost focus.
      * Some platforms may not have the concept of blur.
      */
    var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      * When `accessible` is true (which is the default) this may be called when
      * the OS-specific concept of "focus" occurs. Some platforms may not have
      * the concept of focus.
      */
    var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
    
    /**
      *
      * Called immediately after the underlay is hidden
      */
    var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on mount and layout changes with
      * {nativeEvent: {layout: {x, y, width, height}}}
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
      * @platform ios
      */
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called when the touch is released,
      * but not if cancelled (e.g. by a scroll that steals the responder lock).
      */
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Called immediately after the underlay is shown
      */
    var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var pad: js.UndefOr[Double] = js.undefined
    
    /**
      * When the scroll view is disabled, this defines how far your
      * touch may move off of the button, before deactivating the button.
      * Once deactivated, try moving it back and you'll see that the button
      * is once again reactivated! Move it back and forth several times
      * while the scroll view is disabled. Ensure you pass in a constant
      * to reduce memory allocations.
      */
    var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
    
    /**
      * @see https://reactnative.dev/docs/view#style
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    var topDivider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, doesn't play a system sound on touch.
      *
      * @platform android
      */
    var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The color of the underlay that will show through when the touch is active.
      */
    var underlayColor: js.UndefOr[ColorValue] = js.undefined
  }
  object ListItemAccordionProps {
    
    inline def apply(): ListItemAccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAccordionProps]
    }
    
    extension [Self <: ListItemAccordionProps](x: Self) {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setAnimation(value: Duration | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
      
      inline def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
      
      inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
      
      inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
      
      inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
      
      inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
      
      inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
      
      inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: IconNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setIcon(value: IconNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setLinearGradientProps(value: Any): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
      
      inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
      
      inline def setNoIcon(value: Boolean): Self = StObject.set(x, "noIcon", value.asInstanceOf[js.Any])
      
      inline def setNoIconUndefined: Self = StObject.set(x, "noIcon", js.undefined)
      
      inline def setNoRotation(value: Boolean): Self = StObject.set(x, "noRotation", value.asInstanceOf[js.Any])
      
      inline def setNoRotationUndefined: Self = StObject.set(x, "noRotation", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
      
      inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
      
      inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
      
      inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
      
      inline def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
      
      inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
      
      inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
      
      inline def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
      
      inline def setViewComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])
      ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
      
      inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
    }
  }
  
  type _To = FunctionComponent[PickcontainerStyleStylePr] | ForwardRefExoticComponent[containerStyleStylePropViAccessibilityElementsHidden]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemAccordionMod.foo` */
  override def _to: FunctionComponent[PickcontainerStyleStylePr] | ForwardRefExoticComponent[containerStyleStylePropViAccessibilityElementsHidden] = default
}
