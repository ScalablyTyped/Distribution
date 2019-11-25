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
    val __obj = js.Dynamic.literal(measureLocation = measureLocation.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], targetText = targetText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeasureConfig]
  }
}

