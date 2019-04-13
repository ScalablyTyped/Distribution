package typings
package signaleLib.signaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaleConfig extends js.Object {
  /** Display the badge of the logger. */
  var displayBadge: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the current local date in `YYYY-MM-DD` format. */
  var displayDate: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the name of the file that the logger is reporting from. */
  var displayFilename: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the label of the logger. */
  var displayLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the scope name of the logger. */
  var displayScope: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the current local time in `HH:MM:SS` format. */
  var displayTimestamp: js.UndefOr[scala.Boolean] = js.undefined
  /** Underline the logger label. */
  var underlineLabel: js.UndefOr[scala.Boolean] = js.undefined
  /** Underline the logger message. */
  var underlineMessage: js.UndefOr[scala.Boolean] = js.undefined
  var underlinePrefix: js.UndefOr[scala.Boolean] = js.undefined
  var underlineSuffix: js.UndefOr[scala.Boolean] = js.undefined
  var uppercaseLabel: js.UndefOr[scala.Boolean] = js.undefined
}

object SignaleConfig {
  @scala.inline
  def apply(
    displayBadge: js.UndefOr[scala.Boolean] = js.undefined,
    displayDate: js.UndefOr[scala.Boolean] = js.undefined,
    displayFilename: js.UndefOr[scala.Boolean] = js.undefined,
    displayLabel: js.UndefOr[scala.Boolean] = js.undefined,
    displayScope: js.UndefOr[scala.Boolean] = js.undefined,
    displayTimestamp: js.UndefOr[scala.Boolean] = js.undefined,
    underlineLabel: js.UndefOr[scala.Boolean] = js.undefined,
    underlineMessage: js.UndefOr[scala.Boolean] = js.undefined,
    underlinePrefix: js.UndefOr[scala.Boolean] = js.undefined,
    underlineSuffix: js.UndefOr[scala.Boolean] = js.undefined,
    uppercaseLabel: js.UndefOr[scala.Boolean] = js.undefined
  ): SignaleConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayBadge)) __obj.updateDynamic("displayBadge")(displayBadge)
    if (!js.isUndefined(displayDate)) __obj.updateDynamic("displayDate")(displayDate)
    if (!js.isUndefined(displayFilename)) __obj.updateDynamic("displayFilename")(displayFilename)
    if (!js.isUndefined(displayLabel)) __obj.updateDynamic("displayLabel")(displayLabel)
    if (!js.isUndefined(displayScope)) __obj.updateDynamic("displayScope")(displayScope)
    if (!js.isUndefined(displayTimestamp)) __obj.updateDynamic("displayTimestamp")(displayTimestamp)
    if (!js.isUndefined(underlineLabel)) __obj.updateDynamic("underlineLabel")(underlineLabel)
    if (!js.isUndefined(underlineMessage)) __obj.updateDynamic("underlineMessage")(underlineMessage)
    if (!js.isUndefined(underlinePrefix)) __obj.updateDynamic("underlinePrefix")(underlinePrefix)
    if (!js.isUndefined(underlineSuffix)) __obj.updateDynamic("underlineSuffix")(underlineSuffix)
    if (!js.isUndefined(uppercaseLabel)) __obj.updateDynamic("uppercaseLabel")(uppercaseLabel)
    __obj.asInstanceOf[SignaleConfig]
  }
}

