package typings.rcMentions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-mentions.rc-mentions/lib/Mentions.MentionsState> */
trait PartialMentionsState extends js.Object {
  var activeIndex: js.UndefOr[Double] = js.undefined
  var isFocus: js.UndefOr[Boolean] = js.undefined
  var measureLocation: js.UndefOr[Double] = js.undefined
  var measurePrefix: js.UndefOr[String] = js.undefined
  var measureText: js.UndefOr[String] = js.undefined
  var measuring: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object PartialMentionsState {
  @scala.inline
  def apply(
    activeIndex: js.UndefOr[Double] = js.undefined,
    isFocus: js.UndefOr[Boolean] = js.undefined,
    measureLocation: js.UndefOr[Double] = js.undefined,
    measurePrefix: String = null,
    measureText: String = null,
    measuring: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): PartialMentionsState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeIndex)) __obj.updateDynamic("activeIndex")(activeIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocus)) __obj.updateDynamic("isFocus")(isFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(measureLocation)) __obj.updateDynamic("measureLocation")(measureLocation.get.asInstanceOf[js.Any])
    if (measurePrefix != null) __obj.updateDynamic("measurePrefix")(measurePrefix.asInstanceOf[js.Any])
    if (measureText != null) __obj.updateDynamic("measureText")(measureText.asInstanceOf[js.Any])
    if (!js.isUndefined(measuring)) __obj.updateDynamic("measuring")(measuring.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMentionsState]
  }
}

