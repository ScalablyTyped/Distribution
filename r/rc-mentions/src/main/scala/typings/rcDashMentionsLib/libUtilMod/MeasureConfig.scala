package typings
package rcDashMentionsLib.libUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureConfig extends js.Object {
  var measureLocation: scala.Double
  var prefix: java.lang.String
  var selectionStart: scala.Double
  var split: java.lang.String
  var targetText: java.lang.String
}

object MeasureConfig {
  @scala.inline
  def apply(
    measureLocation: scala.Double,
    prefix: java.lang.String,
    selectionStart: scala.Double,
    split: java.lang.String,
    targetText: java.lang.String
  ): MeasureConfig = {
    val __obj = js.Dynamic.literal(measureLocation = measureLocation, prefix = prefix, selectionStart = selectionStart, split = split, targetText = targetText)
  
    __obj.asInstanceOf[MeasureConfig]
  }
}

