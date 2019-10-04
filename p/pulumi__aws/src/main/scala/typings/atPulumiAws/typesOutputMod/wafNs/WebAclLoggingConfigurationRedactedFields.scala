package typings.atPulumiAws.typesOutputMod.wafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclLoggingConfigurationRedactedFields extends js.Object {
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]
}

object WebAclLoggingConfigurationRedactedFields {
  @scala.inline
  def apply(fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches)
  
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
}

