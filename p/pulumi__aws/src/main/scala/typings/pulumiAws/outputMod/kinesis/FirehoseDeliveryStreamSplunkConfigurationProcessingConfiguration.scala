package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration extends js.Object {
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]
  ] = js.native
}

object FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration {
  @scala.inline
  def apply(): FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationOps[Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setProcessorsVarargs(value: FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor*): Self = this.set("processors", js.Array(value :_*))
    @scala.inline
    def setProcessors(value: js.Array[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]): Self = this.set("processors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessors: Self = this.set("processors", js.undefined)
  }
  
}

