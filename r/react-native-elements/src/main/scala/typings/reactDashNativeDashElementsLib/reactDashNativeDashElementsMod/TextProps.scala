package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait TextProps extends _HeaderSubComponent {
  /**
    * font size 40
    */
  var h1: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for when `h1` is set
    */
  var h1Style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * font size 34
    */
  var h2: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for when `h2` is set
    */
  var h2Style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * font size 28
    */
  var h3: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for when `h3` is set
    */
  var h3Style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * font size 22
    */
  var h4: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Styling for when `h4` is set
    */
  var h4Style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Additional styling for Text
    */
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    h1: js.UndefOr[scala.Boolean] = js.undefined,
    h1Style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    h2: js.UndefOr[scala.Boolean] = js.undefined,
    h2Style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    h3: js.UndefOr[scala.Boolean] = js.undefined,
    h3Style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    h4: js.UndefOr[scala.Boolean] = js.undefined,
    h4Style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(h1)) __obj.updateDynamic("h1")(h1)
    if (h1Style != null) __obj.updateDynamic("h1Style")(h1Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h2)) __obj.updateDynamic("h2")(h2)
    if (h2Style != null) __obj.updateDynamic("h2Style")(h2Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h3)) __obj.updateDynamic("h3")(h3)
    if (h3Style != null) __obj.updateDynamic("h3Style")(h3Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h4)) __obj.updateDynamic("h4")(h4)
    if (h4Style != null) __obj.updateDynamic("h4Style")(h4Style.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProps]
  }
}

