package typings.atPulumiAws.typesInputMod.waf

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclLoggingConfigurationRedactedFields extends js.Object {
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]
}

object WebAclLoggingConfigurationRedactedFields {
  @scala.inline
  def apply(fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
}

