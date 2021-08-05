package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclLoggingConfigurationRedactedFields extends StObject {
  
  /**
    * Set of configuration blocks for fields to redact. Detailed below.
    */
  var fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]
}
object WebAclLoggingConfigurationRedactedFields {
  
  inline def apply(fieldToMatches: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]): WebAclLoggingConfigurationRedactedFields = {
    val __obj = js.Dynamic.literal(fieldToMatches = fieldToMatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFields]
  }
  
  extension [Self <: WebAclLoggingConfigurationRedactedFields](x: Self) {
    
    inline def setFieldToMatches(value: Input[js.Array[Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]]]): Self = StObject.set(x, "fieldToMatches", value.asInstanceOf[js.Any])
    
    inline def setFieldToMatchesVarargs(value: Input[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]*): Self = StObject.set(x, "fieldToMatches", js.Array(value :_*))
  }
}
