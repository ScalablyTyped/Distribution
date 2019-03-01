package typings
package progressjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressJsOptions extends js.Object {
  /**
    * to consider CSS3 transitions in events
    */
  var considerTransition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * overlay mode makes an overlay layer in the target element
    */
  var overlayMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * progress bar theme
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object ProgressJsOptions {
  @scala.inline
  def apply(
    considerTransition: js.UndefOr[scala.Boolean] = js.undefined,
    overlayMode: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): ProgressJsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(considerTransition)) __obj.updateDynamic("considerTransition")(considerTransition)
    if (!js.isUndefined(overlayMode)) __obj.updateDynamic("overlayMode")(overlayMode)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ProgressJsOptions]
  }
}

