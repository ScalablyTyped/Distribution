package typings.reactBootstrapTable.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexFilter extends _Filter {
  /**
    * Default value
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * Delay time in milliseconds after the last key press prior to applying the filter. Defaults to 500ms.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Placeholder text to show in the filter.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * CSS Style to use for the select filter.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Filter type must be 'RegexFilter'
    */
  var `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter
}

object RegexFilter {
  @scala.inline
  def apply(
    `type`: typings.reactBootstrapTable.reactBootstrapTableStrings.RegexFilter,
    defaultValue: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    placeholder: String = null,
    style: CSSProperties = null
  ): RegexFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexFilter]
  }
}

