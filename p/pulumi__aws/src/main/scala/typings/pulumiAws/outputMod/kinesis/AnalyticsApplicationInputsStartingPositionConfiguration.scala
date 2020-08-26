package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  var startingPosition: String = js.native
}

object AnalyticsApplicationInputsStartingPositionConfiguration {
  @scala.inline
  def apply(startingPosition: String): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal(startingPosition = startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  @scala.inline
  implicit class AnalyticsApplicationInputsStartingPositionConfigurationOps[Self <: AnalyticsApplicationInputsStartingPositionConfiguration] (val x: Self) extends AnyVal {
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
    def setStartingPosition(value: String): Self = this.set("startingPosition", value.asInstanceOf[js.Any])
  }
  
}

