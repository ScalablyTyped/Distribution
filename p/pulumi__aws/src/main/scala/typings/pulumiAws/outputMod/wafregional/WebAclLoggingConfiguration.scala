package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclLoggingConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
    */
  var logDestination: String = js.native
  /**
    * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
    */
  var redactedFields: js.UndefOr[WebAclLoggingConfigurationRedactedFields] = js.native
}

object WebAclLoggingConfiguration {
  @scala.inline
  def apply(logDestination: String, redactedFields: WebAclLoggingConfigurationRedactedFields = null): WebAclLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any])
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfiguration]
  }
}

