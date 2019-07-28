package typings.rcDashMentions.esMentionsMod

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
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, isFocus = isFocus, measureLocation = measureLocation, measurePrefix = measurePrefix, measuring = measuring, value = value)
    if (measureText != null) __obj.updateDynamic("measureText")(measureText)
    __obj.asInstanceOf[MentionsState]
  }
}

