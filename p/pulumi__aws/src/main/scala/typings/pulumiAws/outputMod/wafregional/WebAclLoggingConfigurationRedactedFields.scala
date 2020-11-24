package typings.pulumiAws.outputMod.wafregional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldsOps[Self <: WebAclLoggingConfigurationRedactedFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldToMatchesVarargs(value: WebAclLoggingConfigurationRedactedFieldsFieldToMatch*): Self = this.set("fieldToMatches", js.Array(value :_*))
    
    @scala.inline
    def setFieldToMatches(value: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): Self = this.set("fieldToMatches", value.asInstanceOf[js.Any])
  }
}
