package typings.rcDashMentions.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsState extends js.Object {
  var activeIndex: Double
  var isFocus: Boolean
  var measureLocation: Double
  var measurePrefix: String
  var measureText: String | Null
  var measuring: Boolean
  var value: String
}

object MentionsState {
  @scala.inline
  def apply(
    activeIndex: Double,
    isFocus: Boolean,
    measureLocation: Double,
    measurePrefix: String,
    measuring: Boolean,
    value: String,
    measureText: String = null
  ): MentionsState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], isFocus = isFocus.asInstanceOf[js.Any], measureLocation = measureLocation.asInstanceOf[js.Any], measurePrefix = measurePrefix.asInstanceOf[js.Any], measuring = measuring.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (measureText != null) __obj.updateDynamic("measureText")(measureText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MentionsState]
  }
}

