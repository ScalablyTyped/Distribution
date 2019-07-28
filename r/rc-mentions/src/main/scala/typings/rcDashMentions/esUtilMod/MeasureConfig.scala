package typings.rcDashMentions.esUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureConfig extends js.Object {
  var measureLocation: Double
  var prefix: String
  var selectionStart: Double
  var split: String
  var targetText: String
}

object MeasureConfig {
  @scala.inline
  def apply(measureLocation: Double, prefix: String, selectionStart: Double, split: String, targetText: String): MeasureConfig = {
    val __obj = js.Dynamic.literal(measureLocation = measureLocation, prefix = prefix, selectionStart = selectionStart, split = split, targetText = targetText)
  
    __obj.asInstanceOf[MeasureConfig]
  }
}

