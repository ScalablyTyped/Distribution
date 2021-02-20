package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationRedactedFields extends StObject {
  
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
  implicit class WebAclLoggingConfigurationRedactedFieldsMutableBuilder[Self <: WebAclLoggingConfigurationRedactedFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldToMatches(value: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): Self = StObject.set(x, "fieldToMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldToMatchesVarargs(value: WebAclLoggingConfigurationRedactedFieldsFieldToMatch*): Self = StObject.set(x, "fieldToMatches", js.Array(value :_*))
  }
}
