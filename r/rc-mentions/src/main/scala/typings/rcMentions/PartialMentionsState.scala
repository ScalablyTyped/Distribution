package typings.rcMentions

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
    activeIndex: Int | Double = null,
    isFocus: js.UndefOr[Boolean] = js.undefined,
    measureLocation: Int | Double = null,
    measurePrefix: String = null,
    measureText: String = null,
    measuring: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): PartialMentionsState = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocus)) __obj.updateDynamic("isFocus")(isFocus.asInstanceOf[js.Any])
    if (measureLocation != null) __obj.updateDynamic("measureLocation")(measureLocation.asInstanceOf[js.Any])
    if (measurePrefix != null) __obj.updateDynamic("measurePrefix")(measurePrefix.asInstanceOf[js.Any])
    if (measureText != null) __obj.updateDynamic("measureText")(measureText.asInstanceOf[js.Any])
    if (!js.isUndefined(measuring)) __obj.updateDynamic("measuring")(measuring.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMentionsState]
  }
}

