package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterLoggingInfo extends js.Object {
  /**
    * Configuration block for Broker Logs settings for logging info. See below.
    */
  var brokerLogs: Input[ClusterLoggingInfoBrokerLogs] = js.native
}

object ClusterLoggingInfo {
  @scala.inline
  def apply(brokerLogs: Input[ClusterLoggingInfoBrokerLogs]): ClusterLoggingInfo = {
    val __obj = js.Dynamic.literal(brokerLogs = brokerLogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterLoggingInfo]
  }
}

