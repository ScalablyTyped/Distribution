package typings
package splunkDashLoggingLib.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContext extends js.Object {
  var message: js.Any
  var metadata: js.UndefOr[SendContextMetadata] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
}

object SendContext {
  @scala.inline
  def apply(message: js.Any, metadata: SendContextMetadata = null, severity: java.lang.String = null): SendContext = {
    val __obj = js.Dynamic.literal(message = message)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    __obj.asInstanceOf[SendContext]
  }
}

