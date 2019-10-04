package typings.atPulumiAws.typesOutputMod.wafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclLoggingConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
    */
  var logDestination: String
  /**
    * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
    */
  var redactedFields: js.UndefOr[WebAclLoggingConfigurationRedactedFields] = js.undefined
}

object WebAclLoggingConfiguration {
  @scala.inline
  def apply(logDestination: String, redactedFields: WebAclLoggingConfigurationRedactedFields = null): WebAclLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestination = logDestination)
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields)
    __obj.asInstanceOf[WebAclLoggingConfiguration]
  }
}

