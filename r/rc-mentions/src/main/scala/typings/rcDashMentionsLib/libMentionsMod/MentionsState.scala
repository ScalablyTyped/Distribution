package typings
package rcDashMentionsLib.libMentionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionsState extends js.Object {
  var activeIndex: scala.Double
  var isFocus: scala.Boolean
  var measureLocation: scala.Double
  var measurePrefix: java.lang.String
  var measureText: java.lang.String | scala.Null
  var measuring: scala.Boolean
  var value: java.lang.String
}

object MentionsState {
  @scala.inline
  def apply(
    activeIndex: scala.Double,
    isFocus: scala.Boolean,
    measureLocation: scala.Double,
    measurePrefix: java.lang.String,
    measuring: scala.Boolean,
    value: java.lang.String,
    measureText: java.lang.String = null
  ): MentionsState = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, isFocus = isFocus, measureLocation = measureLocation, measurePrefix = measurePrefix, measuring = measuring, value = value)
    if (measureText != null) __obj.updateDynamic("measureText")(measureText)
    __obj.asInstanceOf[MentionsState]
  }
}

