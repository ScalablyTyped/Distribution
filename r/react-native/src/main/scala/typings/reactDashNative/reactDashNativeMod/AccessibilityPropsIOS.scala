package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityPropsIOS extends js.Object {
  /**
    * A Boolean value indicating whether the accessibility elements contained within this accessibility element
    * are hidden to the screen reader.
    * @platform ios
    */
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * https://facebook.github.io/react-native/docs/accessibility#accessibilityignoresinvertcolorsios
    * @platform ios
    */
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  /**
    * Accessibility traits tell a person using VoiceOver what kind of element they have selected.
    * Is this element a label? A button? A header? These questions are answered by accessibilityTraits.
    * @platform ios
    */
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
    * @platform ios
    */
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AccessibilityPropsIOS {
  @scala.inline
  def apply(
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    onAccessibilityTap: () => Unit = null,
    onMagicTap: () => Unit = null
  ): AccessibilityPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    __obj.asInstanceOf[AccessibilityPropsIOS]
  }
}

