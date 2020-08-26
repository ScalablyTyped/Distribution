package typings.pulumiAws.inputMod.ses

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDestinationCloudwatchDestination extends js.Object {
  /**
    * The default value for the event
    */
  var defaultValue: Input[String] = js.native
  /**
    * The name for the dimension
    */
  var dimensionName: Input[String] = js.native
  /**
    * The source for the value. It can be either `"messageTag"` or `"emailHeader"`
    */
  var valueSource: Input[String] = js.native
}

object EventDestinationCloudwatchDestination {
  @scala.inline
  def apply(defaultValue: Input[String], dimensionName: Input[String], valueSource: Input[String]): EventDestinationCloudwatchDestination = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], dimensionName = dimensionName.asInstanceOf[js.Any], valueSource = valueSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestinationCloudwatchDestination]
  }
  @scala.inline
  implicit class EventDestinationCloudwatchDestinationOps[Self <: EventDestinationCloudwatchDestination] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: Input[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimensionName(value: Input[String]): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueSource(value: Input[String]): Self = this.set("valueSource", value.asInstanceOf[js.Any])
  }
  
}

