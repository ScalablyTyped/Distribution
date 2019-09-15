package typings.reactDashNative.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.reactDashNative.Anon_EndStart
import typings.reactDashNative.reactDashNativeMod.AccessibilityActionEvent
import typings.reactDashNative.reactDashNativeMod.AccessibilityActionInfo
import typings.reactDashNative.reactDashNativeMod.AccessibilityRole
import typings.reactDashNative.reactDashNativeMod.AccessibilityState
import typings.reactDashNative.reactDashNativeMod.AccessibilityStates
import typings.reactDashNative.reactDashNativeMod.AccessibilityTrait
import typings.reactDashNative.reactDashNativeMod.DataDetectorTypes
import typings.reactDashNative.reactDashNativeMod.DocumentSelectionState
import typings.reactDashNative.reactDashNativeMod.GestureResponderEvent
import typings.reactDashNative.reactDashNativeMod.Insets
import typings.reactDashNative.reactDashNativeMod.KeyboardTypeOptions
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.ReturnKeyTypeOptions
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TVParallaxProperties
import typings.reactDashNative.reactDashNativeMod.TextInputChangeEventData
import typings.reactDashNative.reactDashNativeMod.TextInputContentSizeChangeEventData
import typings.reactDashNative.reactDashNativeMod.TextInputEndEditingEventData
import typings.reactDashNative.reactDashNativeMod.TextInputFocusEventData
import typings.reactDashNative.reactDashNativeMod.TextInputKeyPressEventData
import typings.reactDashNative.reactDashNativeMod.TextInputProps
import typings.reactDashNative.reactDashNativeMod.TextInputScrollEventData
import typings.reactDashNative.reactDashNativeMod.TextInputSelectionChangeEventData
import typings.reactDashNative.reactDashNativeMod.TextInputSubmitEditingEventData
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNative.reactDashNativeStrings.URL
import typings.reactDashNative.reactDashNativeStrings.`cc-csc`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp-month`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp-year`
import typings.reactDashNative.reactDashNativeStrings.`cc-exp`
import typings.reactDashNative.reactDashNativeStrings.`cc-number`
import typings.reactDashNative.reactDashNativeStrings.`no-hide-descendants`
import typings.reactDashNative.reactDashNativeStrings.`postal-code`
import typings.reactDashNative.reactDashNativeStrings.`street-address`
import typings.reactDashNative.reactDashNativeStrings.`unless-editing`
import typings.reactDashNative.reactDashNativeStrings.`while-editing`
import typings.reactDashNative.reactDashNativeStrings.addressCity
import typings.reactDashNative.reactDashNativeStrings.addressCityAndState
import typings.reactDashNative.reactDashNativeStrings.addressState
import typings.reactDashNative.reactDashNativeStrings.always
import typings.reactDashNative.reactDashNativeStrings.assertive
import typings.reactDashNative.reactDashNativeStrings.auto
import typings.reactDashNative.reactDashNativeStrings.balanced
import typings.reactDashNative.reactDashNativeStrings.bottom
import typings.reactDashNative.reactDashNativeStrings.button
import typings.reactDashNative.reactDashNativeStrings.center
import typings.reactDashNative.reactDashNativeStrings.characters
import typings.reactDashNative.reactDashNativeStrings.countryName
import typings.reactDashNative.reactDashNativeStrings.creditCardNumber
import typings.reactDashNative.reactDashNativeStrings.dark
import typings.reactDashNative.reactDashNativeStrings.default
import typings.reactDashNative.reactDashNativeStrings.email
import typings.reactDashNative.reactDashNativeStrings.emailAddress
import typings.reactDashNative.reactDashNativeStrings.familyName
import typings.reactDashNative.reactDashNativeStrings.fullStreetAddress
import typings.reactDashNative.reactDashNativeStrings.givenName
import typings.reactDashNative.reactDashNativeStrings.highQuality
import typings.reactDashNative.reactDashNativeStrings.jobTitle
import typings.reactDashNative.reactDashNativeStrings.light
import typings.reactDashNative.reactDashNativeStrings.location
import typings.reactDashNative.reactDashNativeStrings.middleName
import typings.reactDashNative.reactDashNativeStrings.name
import typings.reactDashNative.reactDashNativeStrings.namePrefix
import typings.reactDashNative.reactDashNativeStrings.nameSuffix
import typings.reactDashNative.reactDashNativeStrings.never
import typings.reactDashNative.reactDashNativeStrings.newPassword
import typings.reactDashNative.reactDashNativeStrings.nickname
import typings.reactDashNative.reactDashNativeStrings.no
import typings.reactDashNative.reactDashNativeStrings.none
import typings.reactDashNative.reactDashNativeStrings.off
import typings.reactDashNative.reactDashNativeStrings.oneTimeCode
import typings.reactDashNative.reactDashNativeStrings.organizationName
import typings.reactDashNative.reactDashNativeStrings.password
import typings.reactDashNative.reactDashNativeStrings.polite
import typings.reactDashNative.reactDashNativeStrings.postalCode
import typings.reactDashNative.reactDashNativeStrings.radiobutton_checked
import typings.reactDashNative.reactDashNativeStrings.radiobutton_unchecked
import typings.reactDashNative.reactDashNativeStrings.sentences
import typings.reactDashNative.reactDashNativeStrings.simple
import typings.reactDashNative.reactDashNativeStrings.streetAddressLine1
import typings.reactDashNative.reactDashNativeStrings.streetAddressLine2
import typings.reactDashNative.reactDashNativeStrings.sublocality
import typings.reactDashNative.reactDashNativeStrings.tel
import typings.reactDashNative.reactDashNativeStrings.telephoneNumber
import typings.reactDashNative.reactDashNativeStrings.top
import typings.reactDashNative.reactDashNativeStrings.username
import typings.reactDashNative.reactDashNativeStrings.words
import typings.reactDashNative.reactDashNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: pointerEvents, spellCheck, placeholder, autoFocus, maxLength */
object TextInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.reactDashNative.reactDashNativeMod.TextInput] {
  override val component: String | js.Object = js.constructorOf[typings.reactDashNative.reactDashNativeMod.TextInput].asInstanceOf[String | js.Object]
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    autoCapitalize: none | sentences | words | characters = null,
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    inlineImageLeft: String = null,
    inlineImagePadding: Int | Double = null,
    inputAccessoryViewID: String = null,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    maxFontSizeMultiplier: Int | Double = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onBlur: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit = null,
    onChange: /* e */ NativeSyntheticEvent[TextInputChangeEventData] => Unit = null,
    onChangeText: /* text */ String => Unit = null,
    onContentSizeChange: /* e */ NativeSyntheticEvent[TextInputContentSizeChangeEventData] => Unit = null,
    onEndEditing: /* e */ NativeSyntheticEvent[TextInputEndEditingEventData] => Unit = null,
    onFocus: /* e */ NativeSyntheticEvent[TextInputFocusEventData] => Unit = null,
    onKeyPress: /* e */ NativeSyntheticEvent[TextInputKeyPressEventData] => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onMoveShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onMoveShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onResponderEnd: /* event */ GestureResponderEvent => Unit = null,
    onResponderGrant: /* event */ GestureResponderEvent => Unit = null,
    onResponderMove: /* event */ GestureResponderEvent => Unit = null,
    onResponderReject: /* event */ GestureResponderEvent => Unit = null,
    onResponderRelease: /* event */ GestureResponderEvent => Unit = null,
    onResponderStart: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminate: /* event */ GestureResponderEvent => Unit = null,
    onResponderTerminationRequest: /* event */ GestureResponderEvent => Boolean = null,
    onScroll: /* e */ NativeSyntheticEvent[TextInputScrollEventData] => Unit = null,
    onSelectionChange: /* e */ NativeSyntheticEvent[TextInputSelectionChangeEventData] => Unit = null,
    onStartShouldSetResponder: /* event */ GestureResponderEvent => Boolean = null,
    onStartShouldSetResponderCapture: /* event */ GestureResponderEvent => Boolean = null,
    onSubmitEditing: /* e */ NativeSyntheticEvent[TextInputSubmitEditingEventData] => Unit = null,
    onTouchCancel: /* event */ GestureResponderEvent => Unit = null,
    onTouchEnd: /* event */ GestureResponderEvent => Unit = null,
    onTouchEndCapture: /* event */ GestureResponderEvent => Unit = null,
    onTouchMove: /* event */ GestureResponderEvent => Unit = null,
    onTouchStart: /* event */ GestureResponderEvent => Unit = null,
    placeholderTextColor: String = null,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: Anon_EndStart = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    style_TextInputProps: StyleProp[TextStyle] = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textContentType: none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tvParallaxMagnification: Int | Double = null,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: Int | Double = null,
    tvParallaxShiftDistanceY: Int | Double = null,
    tvParallaxTiltAngle: Int | Double = null,
    underlineColorAndroid: String = null,
    value: String = null
  ): BuildingComponent[tag.type, typings.reactDashNative.reactDashNativeMod.TextInput] = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit)
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden)
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus)
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden)
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically)
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft)
    if (inlineImagePadding != null) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID)
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable)
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline)
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1(onChangeText))
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(js.Any.fromFunction1(onContentSizeChange))
    if (onEndEditing != null) __obj.updateDynamic("onEndEditing")(js.Any.fromFunction1(onEndEditing))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(js.Any.fromFunction1(onMoveShouldSetResponder))
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(js.Any.fromFunction1(onMoveShouldSetResponderCapture))
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(js.Any.fromFunction1(onResponderEnd))
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(js.Any.fromFunction1(onResponderGrant))
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(js.Any.fromFunction1(onResponderMove))
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(js.Any.fromFunction1(onResponderReject))
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(js.Any.fromFunction1(onResponderRelease))
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(js.Any.fromFunction1(onResponderStart))
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(js.Any.fromFunction1(onResponderTerminate))
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(js.Any.fromFunction1(onResponderTerminationRequest))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(js.Any.fromFunction1(onStartShouldSetResponder))
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(js.Any.fromFunction1(onStartShouldSetResponderCapture))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1(onSubmitEditing))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(js.Any.fromFunction1(onTouchEndCapture))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor)
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel)
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType)
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled)
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry)
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (style_TextInputProps != null) __obj.updateDynamic("style")(style_TextInputProps.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tvParallaxMagnification != null) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (tvParallaxShiftDistanceX != null) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.asInstanceOf[js.Any])
    if (tvParallaxShiftDistanceY != null) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.asInstanceOf[js.Any])
    if (tvParallaxTiltAngle != null) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TextInputProps
}

