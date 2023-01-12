package typings.smooch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomColors extends StObject {
  
  /**
    * This color will be used for call-to-actions inside your messages. Must be a 3 or 6-character hexadecimal color.
    * @default '0099ff'
    */
  var actionColor: js.UndefOr[String] = js.undefined
  
  /**
    * This color will be used in the messenger header and the button or tab in idle state. Must be a 3 or 6-character hexadecimal color.
    * @default '65758e'
    */
  var brandColor: js.UndefOr[String] = js.undefined
  
  /**
    * This color will be used for customer messages, quick replies and actions in the footer. Must be a 3 or 6-character hexadecimal color.
    * @default '0099ff'
    */
  var conversationColor: js.UndefOr[String] = js.undefined
}
object CustomColors {
  
  inline def apply(): CustomColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomColors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomColors] (val x: Self) extends AnyVal {
    
    inline def setActionColor(value: String): Self = StObject.set(x, "actionColor", value.asInstanceOf[js.Any])
    
    inline def setActionColorUndefined: Self = StObject.set(x, "actionColor", js.undefined)
    
    inline def setBrandColor(value: String): Self = StObject.set(x, "brandColor", value.asInstanceOf[js.Any])
    
    inline def setBrandColorUndefined: Self = StObject.set(x, "brandColor", js.undefined)
    
    inline def setConversationColor(value: String): Self = StObject.set(x, "conversationColor", value.asInstanceOf[js.Any])
    
    inline def setConversationColorUndefined: Self = StObject.set(x, "conversationColor", js.undefined)
  }
}
