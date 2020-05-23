package typings.reactNativeMaterialTextfield.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.anon.Start
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
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
import typings.reactNative.mod.TextInputProps
import typings.reactNative.mod.TextInputScrollEventData
import typings.reactNative.mod.TextInputSelectionChangeEventData
import typings.reactNative.mod.TextInputSubmitEditingEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNative.reactNativeStrings.URL
import typings.reactNative.reactNativeStrings.`box-none`
import typings.reactNative.reactNativeStrings.`box-only`
import typings.reactNative.reactNativeStrings.`cc-csc`
import typings.reactNative.reactNativeStrings.`cc-exp-month`
import typings.reactNative.reactNativeStrings.`cc-exp-year`
import typings.reactNative.reactNativeStrings.`cc-exp`
import typings.reactNative.reactNativeStrings.`cc-number`
import typings.reactNative.reactNativeStrings.`no-hide-descendants`
import typings.reactNative.reactNativeStrings.`postal-code`
import typings.reactNative.reactNativeStrings.`street-address`
import typings.reactNative.reactNativeStrings.`unless-editing`
import typings.reactNative.reactNativeStrings.`while-editing`
import typings.reactNative.reactNativeStrings.addressCity
import typings.reactNative.reactNativeStrings.addressCityAndState
import typings.reactNative.reactNativeStrings.addressState
import typings.reactNative.reactNativeStrings.always
import typings.reactNative.reactNativeStrings.assertive
import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.balanced
import typings.reactNative.reactNativeStrings.bottom
import typings.reactNative.reactNativeStrings.button
import typings.reactNative.reactNativeStrings.center
import typings.reactNative.reactNativeStrings.characters
import typings.reactNative.reactNativeStrings.countryName
import typings.reactNative.reactNativeStrings.creditCardNumber
import typings.reactNative.reactNativeStrings.dark
import typings.reactNative.reactNativeStrings.default
import typings.reactNative.reactNativeStrings.email
import typings.reactNative.reactNativeStrings.emailAddress
import typings.reactNative.reactNativeStrings.familyName
import typings.reactNative.reactNativeStrings.fullStreetAddress
import typings.reactNative.reactNativeStrings.givenName
import typings.reactNative.reactNativeStrings.highQuality
import typings.reactNative.reactNativeStrings.jobTitle
import typings.reactNative.reactNativeStrings.light
import typings.reactNative.reactNativeStrings.location
import typings.reactNative.reactNativeStrings.middleName
import typings.reactNative.reactNativeStrings.name
import typings.reactNative.reactNativeStrings.namePrefix
import typings.reactNative.reactNativeStrings.nameSuffix
import typings.reactNative.reactNativeStrings.never
import typings.reactNative.reactNativeStrings.newPassword
import typings.reactNative.reactNativeStrings.nickname
import typings.reactNative.reactNativeStrings.no
import typings.reactNative.reactNativeStrings.noExcludeDescendants
import typings.reactNative.reactNativeStrings.off
import typings.reactNative.reactNativeStrings.oneTimeCode
import typings.reactNative.reactNativeStrings.organizationName
import typings.reactNative.reactNativeStrings.password
import typings.reactNative.reactNativeStrings.polite
import typings.reactNative.reactNativeStrings.postalCode
import typings.reactNative.reactNativeStrings.radiobutton_checked
import typings.reactNative.reactNativeStrings.radiobutton_unchecked
import typings.reactNative.reactNativeStrings.sentences
import typings.reactNative.reactNativeStrings.simple
import typings.reactNative.reactNativeStrings.streetAddressLine1
import typings.reactNative.reactNativeStrings.streetAddressLine2
import typings.reactNative.reactNativeStrings.sublocality
import typings.reactNative.reactNativeStrings.tel
import typings.reactNative.reactNativeStrings.telephoneNumber
import typings.reactNative.reactNativeStrings.top
import typings.reactNative.reactNativeStrings.username
import typings.reactNative.reactNativeStrings.words
import typings.reactNative.reactNativeStrings.yes
import typings.reactNative.reactNativeStrings.yesExcludeDescendants
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dashed
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.dotted
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.none
import typings.reactNativeMaterialTextfield.reactNativeMaterialTextfieldStrings.solid
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFieldProps extends TextInputProps {
  var activeLineWidth: js.UndefOr[Double] = js.undefined
  var affixTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var baseColor: js.UndefOr[String] = js.undefined
  var characterRestriction: js.UndefOr[Double] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentInset: js.UndefOr[ContentInset] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledLineType: js.UndefOr[solid | dotted | dashed | none] = js.undefined
  var disabledLineWidth: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var errorColor: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var formatText: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  var inputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var labelFontSize: js.UndefOr[Double] = js.undefined
  var labelTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var lineType: js.UndefOr[solid | dotted | dashed | none] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var renderLeftAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
  var renderRightAccessory: js.UndefOr[js.Function0[Element]] = js.undefined
  @JSName("style")
  var style_TextFieldProps: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var textColor: js.UndefOr[String] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}

object TextFieldProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: typings.reactNative.reactNativeStrings.none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: typings.reactNative.reactNativeStrings.none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    activeLineWidth: js.UndefOr[Double] = js.undefined,
    affixTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    autoCapitalize: typings.reactNative.reactNativeStrings.none | sentences | words | characters = null,
    autoCompleteType: `cc-csc` | `cc-exp` | `cc-exp-month` | `cc-exp-year` | `cc-number` | email | name | password | `postal-code` | `street-address` | tel | username | off = null,
    autoCorrect: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    baseColor: String = null,
    blurOnSubmit: js.UndefOr[Boolean] = js.undefined,
    caretHidden: js.UndefOr[Boolean] = js.undefined,
    characterRestriction: js.UndefOr[Double] = js.undefined,
    clearButtonMode: never | `while-editing` | `unless-editing` | always = null,
    clearTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    collapsable: js.UndefOr[Boolean] = js.undefined,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    contentInset: ContentInset = null,
    contextMenuHidden: js.UndefOr[Boolean] = js.undefined,
    dataDetectorTypes: DataDetectorTypes | js.Array[DataDetectorTypes] = null,
    defaultValue: String = null,
    disableFullscreenUI: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledLineType: solid | dotted | dashed | none = null,
    disabledLineWidth: js.UndefOr[Double] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    enablesReturnKeyAutomatically: js.UndefOr[Boolean] = js.undefined,
    error: String = null,
    errorColor: String = null,
    fontSize: js.UndefOr[Double] = js.undefined,
    formatText: /* text */ String => String = null,
    hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Insets = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    importantForAutofill: auto | no | noExcludeDescendants | yes | yesExcludeDescendants = null,
    inlineImageLeft: String = null,
    inlineImagePadding: js.UndefOr[Double] = js.undefined,
    inputAccessoryViewID: String = null,
    inputContainerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    isTVSelectable: js.UndefOr[Boolean] = js.undefined,
    keyboardAppearance: default | light | dark = null,
    keyboardType: KeyboardTypeOptions = null,
    label: String = null,
    labelFontSize: js.UndefOr[Double] = js.undefined,
    labelTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    lineType: solid | dotted | dashed | none = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    maxFontSizeMultiplier: js.UndefOr[Null | Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    nativeID: String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined,
    numberOfLines: js.UndefOr[Double] = js.undefined,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
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
    onPress: /* event */ Event => Unit = null,
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
    passwordRules: js.UndefOr[Null | String] = js.undefined,
    placeholder: String = null,
    placeholderTextColor: String = null,
    pointerEvents: `box-none` | typings.reactNative.reactNativeStrings.none | `box-only` | auto = null,
    prefix: String = null,
    rejectResponderTermination: js.UndefOr[Null | Boolean] = js.undefined,
    removeClippedSubviews: js.UndefOr[Boolean] = js.undefined,
    renderLeftAccessory: () => Element = null,
    renderRightAccessory: () => Element = null,
    renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined,
    returnKeyLabel: String = null,
    returnKeyType: ReturnKeyTypeOptions = null,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    secureTextEntry: js.UndefOr[Boolean] = js.undefined,
    selectTextOnFocus: js.UndefOr[Boolean] = js.undefined,
    selection: Start = null,
    selectionColor: String = null,
    selectionState: DocumentSelectionState = null,
    shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined,
    showSoftInputOnFocus: js.UndefOr[Boolean] = js.undefined,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    suffix: String = null,
    testID: String = null,
    textAlignVertical: auto | top | bottom | center = null,
    textBreakStrategy: simple | highQuality | balanced = null,
    textColor: String = null,
    textContentType: typings.reactNative.reactNativeStrings.none | URL | addressCity | addressCityAndState | addressState | countryName | creditCardNumber | emailAddress | familyName | fullStreetAddress | givenName | jobTitle | location | middleName | name | namePrefix | nameSuffix | nickname | organizationName | postalCode | streetAddressLine1 | streetAddressLine2 | sublocality | telephoneNumber | username | password | newPassword | oneTimeCode = null,
    tintColor: String = null,
    title: String = null,
    titleTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    tvParallaxMagnification: js.UndefOr[Double] = js.undefined,
    tvParallaxProperties: TVParallaxProperties = null,
    tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined,
    tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined,
    tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined,
    underlineColorAndroid: String = null,
    value: String = null
  ): TextFieldProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(activeLineWidth)) __obj.updateDynamic("activeLineWidth")(activeLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(affixTextStyle)) __obj.updateDynamic("affixTextStyle")(affixTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCompleteType != null) __obj.updateDynamic("autoCompleteType")(autoCompleteType.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCorrect)) __obj.updateDynamic("autoCorrect")(autoCorrect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (baseColor != null) __obj.updateDynamic("baseColor")(baseColor.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnSubmit)) __obj.updateDynamic("blurOnSubmit")(blurOnSubmit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caretHidden)) __obj.updateDynamic("caretHidden")(caretHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(characterRestriction)) __obj.updateDynamic("characterRestriction")(characterRestriction.get.asInstanceOf[js.Any])
    if (clearButtonMode != null) __obj.updateDynamic("clearButtonMode")(clearButtonMode.asInstanceOf[js.Any])
    if (!js.isUndefined(clearTextOnFocus)) __obj.updateDynamic("clearTextOnFocus")(clearTextOnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (contentInset != null) __obj.updateDynamic("contentInset")(contentInset.asInstanceOf[js.Any])
    if (!js.isUndefined(contextMenuHidden)) __obj.updateDynamic("contextMenuHidden")(contextMenuHidden.get.asInstanceOf[js.Any])
    if (dataDetectorTypes != null) __obj.updateDynamic("dataDetectorTypes")(dataDetectorTypes.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFullscreenUI)) __obj.updateDynamic("disableFullscreenUI")(disableFullscreenUI.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (disabledLineType != null) __obj.updateDynamic("disabledLineType")(disabledLineType.asInstanceOf[js.Any])
    if (!js.isUndefined(disabledLineWidth)) __obj.updateDynamic("disabledLineWidth")(disabledLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesReturnKeyAutomatically)) __obj.updateDynamic("enablesReturnKeyAutomatically")(enablesReturnKeyAutomatically.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errorColor != null) __obj.updateDynamic("errorColor")(errorColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (formatText != null) __obj.updateDynamic("formatText")(js.Any.fromFunction1(formatText))
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (importantForAutofill != null) __obj.updateDynamic("importantForAutofill")(importantForAutofill.asInstanceOf[js.Any])
    if (inlineImageLeft != null) __obj.updateDynamic("inlineImageLeft")(inlineImageLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineImagePadding)) __obj.updateDynamic("inlineImagePadding")(inlineImagePadding.get.asInstanceOf[js.Any])
    if (inputAccessoryViewID != null) __obj.updateDynamic("inputAccessoryViewID")(inputAccessoryViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(inputContainerStyle)) __obj.updateDynamic("inputContainerStyle")(inputContainerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isTVSelectable)) __obj.updateDynamic("isTVSelectable")(isTVSelectable.get.asInstanceOf[js.Any])
    if (keyboardAppearance != null) __obj.updateDynamic("keyboardAppearance")(keyboardAppearance.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelFontSize)) __obj.updateDynamic("labelFontSize")(labelFontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelTextStyle)) __obj.updateDynamic("labelTextStyle")(labelTextStyle.asInstanceOf[js.Any])
    if (lineType != null) __obj.updateDynamic("lineType")(lineType.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFontSizeMultiplier)) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.get.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLines)) __obj.updateDynamic("numberOfLines")(numberOfLines.get.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
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
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
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
    if (!js.isUndefined(passwordRules)) __obj.updateDynamic("passwordRules")(passwordRules.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectResponderTermination)) __obj.updateDynamic("rejectResponderTermination")(rejectResponderTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews.get.asInstanceOf[js.Any])
    if (renderLeftAccessory != null) __obj.updateDynamic("renderLeftAccessory")(js.Any.fromFunction0(renderLeftAccessory))
    if (renderRightAccessory != null) __obj.updateDynamic("renderRightAccessory")(js.Any.fromFunction0(renderRightAccessory))
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid.get.asInstanceOf[js.Any])
    if (returnKeyLabel != null) __obj.updateDynamic("returnKeyLabel")(returnKeyLabel.asInstanceOf[js.Any])
    if (returnKeyType != null) __obj.updateDynamic("returnKeyType")(returnKeyType.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(secureTextEntry)) __obj.updateDynamic("secureTextEntry")(secureTextEntry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectTextOnFocus)) __obj.updateDynamic("selectTextOnFocus")(selectTextOnFocus.get.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionState != null) __obj.updateDynamic("selectionState")(selectionState.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showSoftInputOnFocus)) __obj.updateDynamic("showSoftInputOnFocus")(showSoftInputOnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textAlignVertical != null) __obj.updateDynamic("textAlignVertical")(textAlignVertical.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (textColor != null) __obj.updateDynamic("textColor")(textColor.asInstanceOf[js.Any])
    if (textContentType != null) __obj.updateDynamic("textContentType")(textContentType.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleTextStyle)) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxMagnification)) __obj.updateDynamic("tvParallaxMagnification")(tvParallaxMagnification.get.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceX)) __obj.updateDynamic("tvParallaxShiftDistanceX")(tvParallaxShiftDistanceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxShiftDistanceY)) __obj.updateDynamic("tvParallaxShiftDistanceY")(tvParallaxShiftDistanceY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tvParallaxTiltAngle)) __obj.updateDynamic("tvParallaxTiltAngle")(tvParallaxTiltAngle.get.asInstanceOf[js.Any])
    if (underlineColorAndroid != null) __obj.updateDynamic("underlineColorAndroid")(underlineColorAndroid.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFieldProps]
  }
}

