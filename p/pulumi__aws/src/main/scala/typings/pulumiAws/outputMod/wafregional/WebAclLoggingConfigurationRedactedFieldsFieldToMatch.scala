package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclLoggingConfigurationRedactedFieldsFieldToMatch extends StObject {
  
  /**
    * When the value of `type` is `HEADER`, enter the name of the header that you want the WAF to search, for example, `User-Agent` or `Referer`. If the value of `type` is any other value, omit `data`.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: String
}
object WebAclLoggingConfigurationRedactedFieldsFieldToMatch {
  
  @scala.inline
  def apply(`type`: String): WebAclLoggingConfigurationRedactedFieldsFieldToMatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclLoggingConfigurationRedactedFieldsFieldToMatch]
  }
  
  @scala.inline
  implicit class WebAclLoggingConfigurationRedactedFieldsFieldToMatchMutableBuilder[Self <: WebAclLoggingConfigurationRedactedFieldsFieldToMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
