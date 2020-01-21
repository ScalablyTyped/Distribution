package typings.storybookReactNative

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
import typings.std.Pick
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityComponentType
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityElementsHidden
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityHint
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityIgnoresInvertColors
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityLabel
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityLiveRegion
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityRole
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityStates
import typings.storybookReactNative.storybookReactNativeStrings.accessibilityTraits
import typings.storybookReactNative.storybookReactNativeStrings.accessible
import typings.storybookReactNative.storybookReactNativeStrings.adjustsFontSizeToFit
import typings.storybookReactNative.storybookReactNativeStrings.allowFontScaling
import typings.storybookReactNative.storybookReactNativeStrings.ellipsizeMode
import typings.storybookReactNative.storybookReactNativeStrings.importantForAccessibility
import typings.storybookReactNative.storybookReactNativeStrings.lineBreakMode
import typings.storybookReactNative.storybookReactNativeStrings.maxFontSizeMultiplier
import typings.storybookReactNative.storybookReactNativeStrings.minimumFontScale
import typings.storybookReactNative.storybookReactNativeStrings.nativeID
import typings.storybookReactNative.storybookReactNativeStrings.numberOfLines
import typings.storybookReactNative.storybookReactNativeStrings.onAccessibilityTap
import typings.storybookReactNative.storybookReactNativeStrings.onLayout
import typings.storybookReactNative.storybookReactNativeStrings.onLongPress
import typings.storybookReactNative.storybookReactNativeStrings.onMagicTap
import typings.storybookReactNative.storybookReactNativeStrings.onPress
import typings.storybookReactNative.storybookReactNativeStrings.selectable
import typings.storybookReactNative.storybookReactNativeStrings.selectionColor
import typings.storybookReactNative.storybookReactNativeStrings.style
import typings.storybookReactNative.storybookReactNativeStrings.suppressHighlighting
import typings.storybookReactNative.storybookReactNativeStrings.testID
import typings.storybookReactNative.storybookReactNativeStrings.textBreakStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react-native/dist/preview/components/Shared/text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  val Header: StyledComponent[TextProps with RefAttributes[Text], AnonSelected, AnonBackgroundColor] = js.native
  val Label: StyledComponent[
    TextProps with RefAttributes[Text], 
    Pick[
      TextProps with RefAttributes[Text], 
      style | allowFontScaling | ellipsizeMode | lineBreakMode | numberOfLines | onLayout | onPress | onLongPress | testID | nativeID | maxFontSizeMultiplier | adjustsFontSizeToFit | minimumFontScale | suppressHighlighting | selectable | selectionColor | textBreakStrategy | accessible | accessibilityLabel | accessibilityRole | accessibilityStates | accessibilityHint | accessibilityComponentType | accessibilityLiveRegion | importantForAccessibility | accessibilityElementsHidden | accessibilityTraits | onAccessibilityTap | onMagicTap | accessibilityIgnoresInvertColors
    ], 
    AnonBackgroundColor
  ] = js.native
  val Name: StyledComponent[TextProps with RefAttributes[Text], AnonSelected, AnonBackgroundColor] = js.native
}

