package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBrokerLogs extends js.Object {
  var audit: Boolean = js.native
  var general: Boolean = js.native
}

object GetBrokerLogs {
  @scala.inline
  def apply(audit: Boolean, general: Boolean): GetBrokerLogs = {
    val __obj = js.Dynamic.literal(audit = audit.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBrokerLogs]
  }
}

