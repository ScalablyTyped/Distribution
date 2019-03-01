package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextPropsIOS extends js.Object {
  /**
    * Specifies whether font should be scaled down automatically to fit given style constraints.
    */
  var adjustsFontSizeToFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
    */
  var minimumFontScale: js.UndefOr[scala.Double] = js.undefined
  /**
    * When `true`, no visual change is made when text is pressed down. By
    * default, a gray oval highlights the text on press down.
    */
  var suppressHighlighting: js.UndefOr[scala.Boolean] = js.undefined
}

object TextPropsIOS {
  @scala.inline
  def apply(
    adjustsFontSizeToFit: js.UndefOr[scala.Boolean] = js.undefined,
    minimumFontScale: scala.Int | scala.Double = null,
    suppressHighlighting: js.UndefOr[scala.Boolean] = js.undefined
  ): TextPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit)
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting)
    __obj.asInstanceOf[TextPropsIOS]
  }
}

