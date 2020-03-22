package typings.signale.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignaleConfig extends js.Object {
  /** Display the badge of the logger. */
  var displayBadge: js.UndefOr[Boolean] = js.undefined
  /** Display the current local date in `YYYY-MM-DD` format. */
  var displayDate: js.UndefOr[Boolean] = js.undefined
  /** Display the name of the file that the logger is reporting from. */
  var displayFilename: js.UndefOr[Boolean] = js.undefined
  /** Display the label of the logger. */
  var displayLabel: js.UndefOr[Boolean] = js.undefined
  /** Display the scope name of the logger. */
  var displayScope: js.UndefOr[Boolean] = js.undefined
  /** Display the current local time in `HH:MM:SS` format. */
  var displayTimestamp: js.UndefOr[Boolean] = js.undefined
  var logLevel: js.UndefOr[String] = js.undefined
  /** Underline the logger label. */
  var underlineLabel: js.UndefOr[Boolean] = js.undefined
  /** Underline the logger message. */
  var underlineMessage: js.UndefOr[Boolean] = js.undefined
  var underlinePrefix: js.UndefOr[Boolean] = js.undefined
  var underlineSuffix: js.UndefOr[Boolean] = js.undefined
  var uppercaseLabel: js.UndefOr[Boolean] = js.undefined
}

object SignaleConfig {
  @scala.inline
  def apply(
    displayBadge: js.UndefOr[Boolean] = js.undefined,
    displayDate: js.UndefOr[Boolean] = js.undefined,
    displayFilename: js.UndefOr[Boolean] = js.undefined,
    displayLabel: js.UndefOr[Boolean] = js.undefined,
    displayScope: js.UndefOr[Boolean] = js.undefined,
    displayTimestamp: js.UndefOr[Boolean] = js.undefined,
    logLevel: String = null,
    underlineLabel: js.UndefOr[Boolean] = js.undefined,
    underlineMessage: js.UndefOr[Boolean] = js.undefined,
    underlinePrefix: js.UndefOr[Boolean] = js.undefined,
    underlineSuffix: js.UndefOr[Boolean] = js.undefined,
    uppercaseLabel: js.UndefOr[Boolean] = js.undefined
  ): SignaleConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayBadge)) __obj.updateDynamic("displayBadge")(displayBadge.asInstanceOf[js.Any])
    if (!js.isUndefined(displayDate)) __obj.updateDynamic("displayDate")(displayDate.asInstanceOf[js.Any])
    if (!js.isUndefined(displayFilename)) __obj.updateDynamic("displayFilename")(displayFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLabel)) __obj.updateDynamic("displayLabel")(displayLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(displayScope)) __obj.updateDynamic("displayScope")(displayScope.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTimestamp)) __obj.updateDynamic("displayTimestamp")(displayTimestamp.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineLabel)) __obj.updateDynamic("underlineLabel")(underlineLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineMessage)) __obj.updateDynamic("underlineMessage")(underlineMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(underlinePrefix)) __obj.updateDynamic("underlinePrefix")(underlinePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(underlineSuffix)) __obj.updateDynamic("underlineSuffix")(underlineSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(uppercaseLabel)) __obj.updateDynamic("uppercaseLabel")(uppercaseLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignaleConfig]
  }
}

