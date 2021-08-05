package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclLoggingConfigurationRedactedFieldSingleQueryArgument extends StObject {
  
  /**
    * The name of the query header to redact. This setting must be provided as lower case characters.
    */
  var name: Input[String]
}
object WebAclLoggingConfigurationRedactedFieldSingleQueryArgument {
  
  inline def apply(name: Input[String]): WebAclLoggingConfigurationRedactedFieldSingleQueryArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]
  }
  
  extension [Self <: WebAclLoggingConfigurationRedactedFieldSingleQueryArgument](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
