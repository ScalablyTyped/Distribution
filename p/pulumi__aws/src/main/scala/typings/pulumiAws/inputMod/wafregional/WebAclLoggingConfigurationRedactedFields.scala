package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclLoggingConfigurationRedactedFields extends js.Object {
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]] = js.native
}

object WebAclLoggingConfigurationRedactedFields {
  @scala.inline
  def apply(fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
}

