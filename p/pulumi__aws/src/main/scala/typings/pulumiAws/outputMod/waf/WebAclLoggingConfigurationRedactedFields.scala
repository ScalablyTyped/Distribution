package typings.pulumiAws.outputMod.waf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclLoggingConfigurationRedactedFields extends StObject {
  
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]
}
object WebAclLoggingConfigurationRedactedFields {
  
  inline def apply(fieldToMatches: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
  
  extension [Self <: WebAclLoggingConfigurationRedactedFields](x: Self) {
    
    inline def setFieldToMatches(value: js.Array[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]): Self = StObject.set(x, "fieldToMatches", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchesVarargs(value: WebAclLoggingConfigurationRedactedFieldsFieldToMatch*): Self = StObject.set(x, "fieldToMatches", js.Array(value :_*))
  }
}
