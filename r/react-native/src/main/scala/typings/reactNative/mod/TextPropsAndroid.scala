package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.balanced
import typings.reactNative.reactNativeStrings.highQuality
import typings.reactNative.reactNativeStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPropsAndroid extends js.Object {
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[String] = js.undefined
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}

object TextPropsAndroid {
  @scala.inline
  def apply(
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    textBreakStrategy: simple | highQuality | balanced = null
  ): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextPropsAndroid]
  }
}

