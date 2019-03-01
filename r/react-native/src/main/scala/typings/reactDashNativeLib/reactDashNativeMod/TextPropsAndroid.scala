package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPropsAndroid extends js.Object {
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced
  ] = js.undefined
}

object TextPropsAndroid {
  @scala.inline
  def apply(
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionColor: java.lang.String = null,
    textBreakStrategy: reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced = null
  ): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPropsAndroid]
  }
}

