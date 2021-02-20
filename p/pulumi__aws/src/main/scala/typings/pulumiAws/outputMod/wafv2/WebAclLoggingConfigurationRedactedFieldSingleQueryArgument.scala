package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclLoggingConfigurationRedactedFieldSingleQueryArgument extends StObject {
  
  /**
    * The name of the query header to redact. This setting must be provided as lower case characters.
    */
  var name: String = js.native
}
object WebAclLoggingConfigurationRedactedFieldSingleQueryArgument {
  
  @scala.inline
  def apply(name: String): WebAclLoggingConfigurationRedactedFieldSingleQueryArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldSingleQueryArgument]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldSingleQueryArgumentMutableBuilder[Self <: WebAclLoggingConfigurationRedactedFieldSingleQueryArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
