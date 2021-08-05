package typings.reactNativeElements.anon

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.anon.Start
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.DataDetectorTypes
import typings.reactNative.mod.DocumentSelectionState
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.KeyboardTypeOptions
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ReturnKeyTypeOptions
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextInputChangeEventData
import typings.reactNative.mod.TextInputContentSizeChangeEventData
import typings.reactNative.mod.TextInputEndEditingEventData
import typings.reactNative.mod.TextInputFocusEventData
import typings.reactNative.mod.TextInputKeyPressEventData
import typings.reactNative.mod.TextInputScrollEventData
import typings.reactNative.mod.TextInputSelectionChangeEventData
import typings.reactNative.mod.TextInputSubmitEditingEventData
import typings.reactNative.mod.TextInputTextInputEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconNode
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.mod.TextProps
import typings.reactNativeElements.reactNativeElementsStrings.URL
import typings.reactNativeElements.reactNativeElementsStrings.`box-none`
import typings.reactNativeElements.reactNativeElementsStrings.`box-only`
import typings.reactNativeElements.reactNativeElementsStrings.`cc-csc`
import typings.reactNativeElements.reactNativeElementsStrings.`cc-exp-month`
import typings.reactNativeElements.reactNativeElementsStrings.`cc-exp-year`
import typings.reactNativeElements.reactNativeElementsStrings.`cc-exp`
import typings.reactNativeElements.reactNativeElementsStrings.`cc-number`
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.`postal-code`
import typings.reactNativeElements.reactNativeElementsStrings.`street-address`
import typings.reactNativeElements.reactNativeElementsStrings.`unless-editing`
import typings.reactNativeElements.reactNativeElementsStrings.`while-editing`
import typings.reactNativeElements.reactNativeElementsStrings.addressCity
import typings.reactNativeElements.reactNativeElementsStrings.addressCityAndState
import typings.reactNativeElements.reactNativeElementsStrings.addressState
import typings.reactNativeElements.reactNativeElementsStrings.always
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.balanced
import typings.reactNativeElements.reactNativeElementsStrings.bottom
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.center
import typings.reactNativeElements.reactNativeElementsStrings.characters
import typings.reactNativeElements.reactNativeElementsStrings.countryName
import typings.reactNativeElements.reactNativeElementsStrings.creditCardNumber
import typings.reactNativeElements.reactNativeElementsStrings.dark
import typings.reactNativeElements.reactNativeElementsStrings.default
import typings.reactNativeElements.reactNativeElementsStrings.email
import typings.reactNativeElements.reactNativeElementsStrings.emailAddress
import typings.reactNativeElements.reactNativeElementsStrings.familyName
import typings.reactNativeElements.reactNativeElementsStrings.fullStreetAddress
import typings.reactNativeElements.reactNativeElementsStrings.givenName
import typings.reactNativeElements.reactNativeElementsStrings.highQuality
import typings.reactNativeElements.reactNativeElementsStrings.jobTitle
import typings.reactNativeElements.reactNativeElementsStrings.light
import typings.reactNativeElements.reactNativeElementsStrings.location
import typings.reactNativeElements.reactNativeElementsStrings.middleName
import typings.reactNativeElements.reactNativeElementsStrings.name
import typings.reactNativeElements.reactNativeElementsStrings.namePrefix
import typings.reactNativeElements.reactNativeElementsStrings.nameSuffix
import typings.reactNativeElements.reactNativeElementsStrings.never
import typings.reactNativeElements.reactNativeElementsStrings.newPassword
import typings.reactNativeElements.reactNativeElementsStrings.nickname
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.noExcludeDescendants
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.off
import typings.reactNativeElements.reactNativeElementsStrings.oneTimeCode
import typings.reactNativeElements.reactNativeElementsStrings.organizationName
import typings.reactNativeElements.reactNativeElementsStrings.password
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.postalCode
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.sentences
import typings.reactNativeElements.reactNativeElementsStrings.simple
import typings.reactNativeElements.reactNativeElementsStrings.streetAddressLine1
import typings.reactNativeElements.reactNativeElementsStrings.streetAddressLine2
import typings.reactNativeElements.reactNativeElementsStrings.sublocality
import typings.reactNativeElements.reactNativeElementsStrings.tel
import typings.reactNativeElements.reactNativeElementsStrings.telephoneNumber
import typings.reactNativeElements.reactNativeElementsStrings.top
import typings.reactNativeElements.reactNativeElementsStrings.username
import typings.reactNativeElements.reactNativeElementsStrings.words
import typings.reactNativeElements.reactNativeElementsStrings.yes
import typings.reactNativeElements.reactNativeElementsStrings.yesExcludeDescendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.InputProps>> */
trait RecursivePartialPartialIn extends StObject {
  
  var InputComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentType[js.Any]]]] = js.undefined
  
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var autoCapitalize: js.UndefOr[RecursivePartial[js.UndefOr[none | sentences | words | characters]]] = js.undefined
  
  var autoCompleteType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
      ]
    ]
  ] = js.undefined
  
  var autoCorrect: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var autoFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var blurOnSubmit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var caretHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var clearButtonMode: js.UndefOr[
    RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]
  ] = js.undefined
  
  var clearTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var collapsable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var contextMenuHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var dataDetectorTypes: js.UndefOr[RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]] = js.undefined
  
  var defaultValue: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var disableFullscreenUI: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var disabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var disabledInputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var editable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var enablesReturnKeyAutomatically: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var errorMessage: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var errorProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  
  var errorStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var focusable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var hitSlop: js.UndefOr[RecursivePartial[js.UndefOr[Insets]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  
  var importantForAutofill: js.UndefOr[
    RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
  ] = js.undefined
  
  var inlineImageLeft: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var inlineImagePadding: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var inputAccessoryViewID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var inputContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var inputStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var isTVSelectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var keyboardAppearance: js.UndefOr[RecursivePartial[js.UndefOr[default | light | dark]]] = js.undefined
  
  var keyboardType: js.UndefOr[RecursivePartial[js.UndefOr[KeyboardTypeOptions]]] = js.undefined
  
  var label: js.UndefOr[RecursivePartial[js.UndefOr[String | ReactElement]]] = js.undefined
  
  var labelProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  
  var labelStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var leftIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.undefined
  
  var leftIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.undefined
  
  var maxLength: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var multiline: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var needsOffscreenAlphaCompositing: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onBlur: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]]
    ]
  ] = js.undefined
  
  var onChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], Unit]]
    ]
  ] = js.undefined
  
  var onChangeText: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]] = js.undefined
  
  var onContentSizeChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], Unit]
      ]
    ]
  ] = js.undefined
  
  var onEndEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]]
    ]
  ] = js.undefined
  
  var onFocus: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]]
    ]
  ] = js.undefined
  
  var onKeyPress: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]]
    ]
  ] = js.undefined
  
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onMoveShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  
  var onMoveShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  
  var onResponderEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderGrant: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderReject: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderRelease: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderTerminate: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onResponderTerminationRequest: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  
  var onScroll: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]]
    ]
  ] = js.undefined
  
  var onSelectionChange: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
      ]
    ]
  ] = js.undefined
  
  var onStartShouldSetResponder: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  
  var onStartShouldSetResponderCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]
  ] = js.undefined
  
  var onSubmitEditing: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
      ]
    ]
  ] = js.undefined
  
  var onTextInput: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputTextInputEventData], Unit]]
    ]
  ] = js.undefined
  
  var onTouchCancel: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onTouchEnd: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onTouchMove: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onTouchStart: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var passwordRules: js.UndefOr[RecursivePartial[js.UndefOr[String | Null]]] = js.undefined
  
  var placeholder: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var placeholderTextColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var pointerEvents: js.UndefOr[RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]] = js.undefined
  
  var rejectResponderTermination: js.UndefOr[RecursivePartial[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var removeClippedSubviews: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var renderErrorMessage: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var renderToHardwareTextureAndroid: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var returnKeyLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var returnKeyType: js.UndefOr[RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]] = js.undefined
  
  var rightIcon: js.UndefOr[RecursivePartial[js.UndefOr[IconNode]]] = js.undefined
  
  var rightIconContainerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var scrollEnabled: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var secureTextEntry: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var selectTextOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var selection: js.UndefOr[RecursivePartial[js.UndefOr[Start]]] = js.undefined
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var selectionState: js.UndefOr[RecursivePartial[js.UndefOr[DocumentSelectionState]]] = js.undefined
  
  var shouldRasterizeIOS: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var showSoftInputOnFocus: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var spellCheck: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var textAlignVertical: js.UndefOr[RecursivePartial[js.UndefOr[auto | top | bottom | center]]] = js.undefined
  
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.undefined
  
  var textContentType: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
      ]
    ]
  ] = js.undefined
  
  var tvParallaxMagnification: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[RecursivePartial[js.UndefOr[TVParallaxProperties]]] = js.undefined
  
  var tvParallaxShiftDistanceX: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxShiftDistanceY: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var tvParallaxTiltAngle: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var underlineColorAndroid: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
}
object RecursivePartialPartialIn {
  
  inline def apply(): RecursivePartialPartialIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialIn]
  }
  
  extension [Self <: RecursivePartialPartialIn](x: Self) {
    
    inline def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    inline def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    inline def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAutoCapitalize(value: RecursivePartial[js.UndefOr[none | sentences | words | characters]]): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoCompleteType(
      value: RecursivePartial[
          js.UndefOr[
            `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off
          ]
        ]
    ): Self = StObject.set(x, "autoCompleteType", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteTypeUndefined: Self = StObject.set(x, "autoCompleteType", js.undefined)
    
    inline def setAutoCorrect(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setAutoFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setBlurOnSubmit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "blurOnSubmit", value.asInstanceOf[js.Any])
    
    inline def setBlurOnSubmitUndefined: Self = StObject.set(x, "blurOnSubmit", js.undefined)
    
    inline def setCaretHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "caretHidden", value.asInstanceOf[js.Any])
    
    inline def setCaretHiddenUndefined: Self = StObject.set(x, "caretHidden", js.undefined)
    
    inline def setClearButtonMode(value: RecursivePartial[js.UndefOr[never | `while-editing` | `unless-editing` | always]]): Self = StObject.set(x, "clearButtonMode", value.asInstanceOf[js.Any])
    
    inline def setClearButtonModeUndefined: Self = StObject.set(x, "clearButtonMode", js.undefined)
    
    inline def setClearTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "clearTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def setClearTextOnFocusUndefined: Self = StObject.set(x, "clearTextOnFocus", js.undefined)
    
    inline def setCollapsable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
    
    inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setContextMenuHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "contextMenuHidden", value.asInstanceOf[js.Any])
    
    inline def setContextMenuHiddenUndefined: Self = StObject.set(x, "contextMenuHidden", js.undefined)
    
    inline def setDataDetectorTypes(value: RecursivePartial[js.UndefOr[DataDetectorTypes | js.Array[DataDetectorTypes]]]): Self = StObject.set(x, "dataDetectorTypes", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypesUndefined: Self = StObject.set(x, "dataDetectorTypes", js.undefined)
    
    inline def setDefaultValue(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisableFullscreenUI(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "disableFullscreenUI", value.asInstanceOf[js.Any])
    
    inline def setDisableFullscreenUIUndefined: Self = StObject.set(x, "disableFullscreenUI", js.undefined)
    
    inline def setDisabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "disabledInputStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledInputStyleUndefined: Self = StObject.set(x, "disabledInputStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEditable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnablesReturnKeyAutomatically(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "enablesReturnKeyAutomatically", value.asInstanceOf[js.Any])
    
    inline def setEnablesReturnKeyAutomaticallyUndefined: Self = StObject.set(x, "enablesReturnKeyAutomatically", js.undefined)
    
    inline def setErrorMessage(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "errorProps", value.asInstanceOf[js.Any])
    
    inline def setErrorPropsUndefined: Self = StObject.set(x, "errorProps", js.undefined)
    
    inline def setErrorStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "errorStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorStyleUndefined: Self = StObject.set(x, "errorStyle", js.undefined)
    
    inline def setFocusable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setHasTVPreferredFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    inline def setHitSlop(value: RecursivePartial[js.UndefOr[Insets]]): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setImportantForAutofill(
      value: RecursivePartial[js.UndefOr[auto | no | noExcludeDescendants | yes | yesExcludeDescendants]]
    ): Self = StObject.set(x, "importantForAutofill", value.asInstanceOf[js.Any])
    
    inline def setImportantForAutofillUndefined: Self = StObject.set(x, "importantForAutofill", js.undefined)
    
    inline def setInlineImageLeft(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "inlineImageLeft", value.asInstanceOf[js.Any])
    
    inline def setInlineImageLeftUndefined: Self = StObject.set(x, "inlineImageLeft", js.undefined)
    
    inline def setInlineImagePadding(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "inlineImagePadding", value.asInstanceOf[js.Any])
    
    inline def setInlineImagePaddingUndefined: Self = StObject.set(x, "inlineImagePadding", js.undefined)
    
    inline def setInputAccessoryViewID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "inputAccessoryViewID", value.asInstanceOf[js.Any])
    
    inline def setInputAccessoryViewIDUndefined: Self = StObject.set(x, "inputAccessoryViewID", js.undefined)
    
    inline def setInputComponent(value: RecursivePartial[js.UndefOr[ComponentType[js.Any]]]): Self = StObject.set(x, "InputComponent", value.asInstanceOf[js.Any])
    
    inline def setInputComponentUndefined: Self = StObject.set(x, "InputComponent", js.undefined)
    
    inline def setInputContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
    
    inline def setInputStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setIsTVSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
    
    inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
    
    inline def setKeyboardAppearance(value: RecursivePartial[js.UndefOr[default | light | dark]]): Self = StObject.set(x, "keyboardAppearance", value.asInstanceOf[js.Any])
    
    inline def setKeyboardAppearanceUndefined: Self = StObject.set(x, "keyboardAppearance", js.undefined)
    
    inline def setKeyboardType(value: RecursivePartial[js.UndefOr[KeyboardTypeOptions]]): Self = StObject.set(x, "keyboardType", value.asInstanceOf[js.Any])
    
    inline def setKeyboardTypeUndefined: Self = StObject.set(x, "keyboardType", js.undefined)
    
    inline def setLabel(value: RecursivePartial[js.UndefOr[String | ReactElement]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "labelProps", value.asInstanceOf[js.Any])
    
    inline def setLabelPropsUndefined: Self = StObject.set(x, "labelProps", js.undefined)
    
    inline def setLabelStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLeftIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "leftIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setLeftIconContainerStyleUndefined: Self = StObject.set(x, "leftIconContainerStyle", js.undefined)
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setMaxLength(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMultiline(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
    
    inline def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNeedsOffscreenAlphaCompositing(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
    
    inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
    
    inline def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnAccessibilityAction(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBlur(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputChangeEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnChangeText(value: RecursivePartial[js.UndefOr[js.Function1[/* text */ String, Unit]]]): Self = StObject.set(x, "onChangeText", value.asInstanceOf[js.Any])
    
    inline def setOnChangeTextUndefined: Self = StObject.set(x, "onChangeText", js.undefined)
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnContentSizeChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[/* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData], Unit]
          ]
        ]
    ): Self = StObject.set(x, "onContentSizeChange", value.asInstanceOf[js.Any])
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setOnEndEditing(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputEndEditingEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onEndEditing", value.asInstanceOf[js.Any])
    
    inline def setOnEndEditingUndefined: Self = StObject.set(x, "onEndEditing", js.undefined)
    
    inline def setOnFocus(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputFocusEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyPress(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputKeyPressEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onKeyPress", value.asInstanceOf[js.Any])
    
    inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
    
    inline def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnMoveShouldSetResponder(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]): Self = StObject.set(x, "onMoveShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCapture(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]): Self = StObject.set(x, "onMoveShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
    
    inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
    
    inline def setOnResponderEnd(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderEnd", value.asInstanceOf[js.Any])
    
    inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
    
    inline def setOnResponderGrant(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderGrant", value.asInstanceOf[js.Any])
    
    inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
    
    inline def setOnResponderMove(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderMove", value.asInstanceOf[js.Any])
    
    inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
    
    inline def setOnResponderReject(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderReject", value.asInstanceOf[js.Any])
    
    inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
    
    inline def setOnResponderRelease(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderRelease", value.asInstanceOf[js.Any])
    
    inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
    
    inline def setOnResponderStart(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderStart", value.asInstanceOf[js.Any])
    
    inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
    
    inline def setOnResponderTerminate(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onResponderTerminate", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
    
    inline def setOnResponderTerminationRequest(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]): Self = StObject.set(x, "onResponderTerminationRequest", value.asInstanceOf[js.Any])
    
    inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
    
    inline def setOnScroll(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputScrollEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnSelectionChange(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[/* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData], Unit]
          ]
        ]
    ): Self = StObject.set(x, "onSelectionChange", value.asInstanceOf[js.Any])
    
    inline def setOnSelectionChangeUndefined: Self = StObject.set(x, "onSelectionChange", js.undefined)
    
    inline def setOnStartShouldSetResponder(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]): Self = StObject.set(x, "onStartShouldSetResponder", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCapture(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]]]): Self = StObject.set(x, "onStartShouldSetResponderCapture", value.asInstanceOf[js.Any])
    
    inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
    
    inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
    
    inline def setOnSubmitEditing(
      value: RecursivePartial[
          js.UndefOr[
            js.Function1[/* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData], Unit]
          ]
        ]
    ): Self = StObject.set(x, "onSubmitEditing", value.asInstanceOf[js.Any])
    
    inline def setOnSubmitEditingUndefined: Self = StObject.set(x, "onSubmitEditing", js.undefined)
    
    inline def setOnTextInput(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TextInputTextInputEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onTextInput", value.asInstanceOf[js.Any])
    
    inline def setOnTextInputUndefined: Self = StObject.set(x, "onTextInput", js.undefined)
    
    inline def setOnTouchCancel(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCapture(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onTouchEndCapture", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    
    inline def setPasswordRules(value: RecursivePartial[js.UndefOr[String | Null]]): Self = StObject.set(x, "passwordRules", value.asInstanceOf[js.Any])
    
    inline def setPasswordRulesUndefined: Self = StObject.set(x, "passwordRules", js.undefined)
    
    inline def setPlaceholder(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "placeholderTextColor", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderTextColorUndefined: Self = StObject.set(x, "placeholderTextColor", js.undefined)
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPointerEvents(value: RecursivePartial[js.UndefOr[`box-none` | none | `box-only` | auto]]): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    inline def setRejectResponderTermination(value: RecursivePartial[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "rejectResponderTermination", value.asInstanceOf[js.Any])
    
    inline def setRejectResponderTerminationUndefined: Self = StObject.set(x, "rejectResponderTermination", js.undefined)
    
    inline def setRemoveClippedSubviews(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
    
    inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
    
    inline def setRenderErrorMessage(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setRenderErrorMessageUndefined: Self = StObject.set(x, "renderErrorMessage", js.undefined)
    
    inline def setRenderToHardwareTextureAndroid(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
    
    inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
    
    inline def setReturnKeyLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "returnKeyLabel", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyLabelUndefined: Self = StObject.set(x, "returnKeyLabel", js.undefined)
    
    inline def setReturnKeyType(value: RecursivePartial[js.UndefOr[ReturnKeyTypeOptions]]): Self = StObject.set(x, "returnKeyType", value.asInstanceOf[js.Any])
    
    inline def setReturnKeyTypeUndefined: Self = StObject.set(x, "returnKeyType", js.undefined)
    
    inline def setRightIcon(value: RecursivePartial[js.UndefOr[IconNode]]): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "rightIconContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setRightIconContainerStyleUndefined: Self = StObject.set(x, "rightIconContainerStyle", js.undefined)
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    inline def setScrollEnabled(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
    
    inline def setSecureTextEntry(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "secureTextEntry", value.asInstanceOf[js.Any])
    
    inline def setSecureTextEntryUndefined: Self = StObject.set(x, "secureTextEntry", js.undefined)
    
    inline def setSelectTextOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectTextOnFocus", value.asInstanceOf[js.Any])
    
    inline def setSelectTextOnFocusUndefined: Self = StObject.set(x, "selectTextOnFocus", js.undefined)
    
    inline def setSelection(value: RecursivePartial[js.UndefOr[Start]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSelectionState(value: RecursivePartial[js.UndefOr[DocumentSelectionState]]): Self = StObject.set(x, "selectionState", value.asInstanceOf[js.Any])
    
    inline def setSelectionStateUndefined: Self = StObject.set(x, "selectionState", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setShouldRasterizeIOS(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
    
    inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
    
    inline def setShowSoftInputOnFocus(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "showSoftInputOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowSoftInputOnFocusUndefined: Self = StObject.set(x, "showSoftInputOnFocus", js.undefined)
    
    inline def setSpellCheck(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
    
    inline def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
    
    inline def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTextAlignVertical(value: RecursivePartial[js.UndefOr[auto | top | bottom | center]]): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    inline def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setTextContentType(
      value: RecursivePartial[
          js.UndefOr[
            none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode
          ]
        ]
    ): Self = StObject.set(x, "textContentType", value.asInstanceOf[js.Any])
    
    inline def setTextContentTypeUndefined: Self = StObject.set(x, "textContentType", js.undefined)
    
    inline def setTvParallaxMagnification(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
    
    inline def setTvParallaxProperties(value: RecursivePartial[js.UndefOr[TVParallaxProperties]]): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    inline def setTvParallaxShiftDistanceX(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
    
    inline def setTvParallaxShiftDistanceY(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
    
    inline def setTvParallaxTiltAngle(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
    
    inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    
    inline def setUnderlineColorAndroid(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "underlineColorAndroid", value.asInstanceOf[js.Any])
    
    inline def setUnderlineColorAndroidUndefined: Self = StObject.set(x, "underlineColorAndroid", js.undefined)
    
    inline def setValue(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
