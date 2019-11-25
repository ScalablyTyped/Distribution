package typings.splunkDashLogging.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContext extends js.Object {
  var message: js.Any
  var metadata: js.UndefOr[SendContextMetadata] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
}

object SendContext {
  @scala.inline
  def apply(message: js.Any, metadata: SendContextMetadata = null, severity: String = null): SendContext = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContext]
  }
}

