package typings.rcMentions.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeasureConfig extends js.Object {
  var measureLocation: Double = js.native
  var prefix: String = js.native
  var selectionStart: Double = js.native
  var split: String = js.native
  var targetText: String = js.native
}

object MeasureConfig {
  @scala.inline
  def apply(measureLocation: Double, prefix: String, selectionStart: Double, split: String, targetText: String): MeasureConfig = {
    val __obj = js.Dynamic.literal(measureLocation = measureLocation.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], targetText = targetText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureConfig]
  }
  @scala.inline
  implicit class MeasureConfigOps[Self <: MeasureConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeasureLocation(value: Double): Self = this.set("measureLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplit(value: String): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetText(value: String): Self = this.set("targetText", value.asInstanceOf[js.Any])
  }
  
}

