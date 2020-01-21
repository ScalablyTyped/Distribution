package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAclLoggingConfigurationRedactedFields extends js.Object {
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch] = js.native
}

object WebAclLoggingConfigurationRedactedFields {
  @scala.inline
  def apply(fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
}

