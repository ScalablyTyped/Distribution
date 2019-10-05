package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerLogs extends js.Object {
  var audit: Boolean
  var general: Boolean
}

object GetBrokerLogs {
  @scala.inline
  def apply(audit: Boolean, general: Boolean): GetBrokerLogs = {
    val __obj = js.Dynamic.literal(audit = audit, general = general)
  
    __obj.asInstanceOf[GetBrokerLogs]
  }
}

