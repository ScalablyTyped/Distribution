package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecipientList extends StObject {
  
  /** Recipient list attribute object */
  var attributes: js.UndefOr[Any] = js.undefined
  
  /** Detailed description of the recipient list */
  var description: js.UndefOr[String] = js.undefined
  
  /** Short, unique, recipient list identifier */
  var id: js.UndefOr[String] = js.undefined
  
  /** Short, pretty/readable recipient list display name, not required to be unique */
  var name: js.UndefOr[String] = js.undefined
  
  /** limit the number of recipient errors returned. */
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
  
  /** Array of recipient objects */
  var recipients: js.Array[Recipient]
}
object CreateRecipientList {
  
  inline def apply(recipients: js.Array[Recipient]): CreateRecipientList = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecipientList]
  }
  
  extension [Self <: CreateRecipientList](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNum_rcpt_errors(value: Double): Self = StObject.set(x, "num_rcpt_errors", value.asInstanceOf[js.Any])
    
    inline def setNum_rcpt_errorsUndefined: Self = StObject.set(x, "num_rcpt_errors", js.undefined)
    
    inline def setRecipients(value: js.Array[Recipient]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: Recipient*): Self = StObject.set(x, "recipients", js.Array(value*))
  }
}
