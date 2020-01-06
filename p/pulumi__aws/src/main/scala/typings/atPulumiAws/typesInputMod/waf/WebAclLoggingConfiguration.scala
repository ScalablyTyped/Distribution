package typings.atPulumiAws.typesInputMod.waf

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclLoggingConfiguration extends js.Object {
  /**
    * Amazon Resource Name (ARN) of Kinesis Firehose Delivery Stream
    */
  var logDestination: Input[String] = js.native
  /**
    * Configuration block containing parts of the request that you want redacted from the logs. Detailed below.
    */
  var redactedFields: js.UndefOr[Input[WebAclLoggingConfigurationRedactedFields]] = js.native
}

object WebAclLoggingConfiguration {
  @scala.inline
  def apply(
    logDestination: Input[String],
    redactedFields: Input[WebAclLoggingConfigurationRedactedFields] = null
  ): WebAclLoggingConfiguration = {
    val __obj = js.Dynamic.literal(logDestination = logDestination.asInstanceOf[js.Any])
    if (redactedFields != null) __obj.updateDynamic("redactedFields")(redactedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfiguration]
  }
}

